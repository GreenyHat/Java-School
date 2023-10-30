package POO.ServiciosProcesos;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class RuntimeExecExample {
    public static void main(String[] args) {
        try {
            // Comando y argumentos
            String[] cmdarray = { "ping", "www.google.com" };
            // Variables de entorno (por ejemplo, podrías agregar o modificar PATH)
            String[] envp = { "MY_ENV_VARIABLE=valueX" };
            // Directorio desde el cual se ejecutará el comando
            File dir = new File("C:/");

            Process process = Runtime.getRuntime().exec(cmdarray, envp, dir);
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Espera a que finalice el proceso
            process.waitFor();
            System.out.println("Fin del proceso");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
