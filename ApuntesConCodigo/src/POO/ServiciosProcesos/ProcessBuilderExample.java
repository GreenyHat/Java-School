package POO.ServiciosProcesos;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProcessBuilderExample {
    public static void main(String[] args) {
        ProcessBuilder processBuilder = new ProcessBuilder();
        // Establecer el directorio desde el cual se ejecutará el comando
        processBuilder.directory(new File("ApuntesConCodigo\\src\\Testing"));
        // Comando para ejecutar un ping en Windows
        processBuilder.command("ping", "www.google.com");
        // Comando para listar archivos en Unix/Linux
        processBuilder.command("cmd", "/c", "dir");// Siempre se ejecutara el ultimo comando y se ignora el primero

        /*
         * Apuntes sobre los problemas que tuve con processBuilder.command("dir");
         * dir no es un programa ejecutable independiente, sino más bien un comando
         * interno del intérprete de comandos cmd.exe. Por lo tanto, para ejecutar
         * comandos internos como dir desde ProcessBuilder o Runtime.exec(), debes
         * invocar cmd.exe y pasarle el comando como argumento.
         * El argumento /c le indica a cmd que debe ejecutar el comando que le sigue y
         * luego terminar.
         */

        try {
            Process process = processBuilder.start();

            // Otras operaciones con el proceso pueden realizarse aquí...
            // Capturar y mostrar la salida del proceso
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Espera a que finalice el proceso
            int retorno = process.waitFor();// Segun la clase
            System.out.println("Esto es el waitFor?? " + retorno);// Por que devuvle 0?? ///////////////
            System.out.println("Proceso finalizado");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
