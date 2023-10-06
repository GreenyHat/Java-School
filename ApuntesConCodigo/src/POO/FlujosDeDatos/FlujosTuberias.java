package POO.FlujosDeDatos;
import java.io.*;
public class FlujosTuberias {

    public static void main(String[] args) throws IOException {
        
        // 1. Creación de las tuberías
        final PipedOutputStream output = new PipedOutputStream();
        final PipedInputStream input = new PipedInputStream(output);

        // 2. Hilo que escribe en la tubería
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    output.write("Hola desde la tuberia!".getBytes());
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        // 3. Hilo que lee de la tubería
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int data = input.read();
                    while (data != -1) {
                        System.out.print((char) data);
                        data = input.read();
                    }
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();  // Iniciar el hilo de escritura
        thread2.start();  // Iniciar el hilo de lectura
    }
}
