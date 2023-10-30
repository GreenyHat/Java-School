package POO.FlujosDeDatos;

import java.io.File;

public class TestingFileMethods {
    //Friki de DAM videos youtube

    public static String[] files(File file) {
        String[] files = file.list();
        return files;
    }

    public static File[] filesX(File file) {
        File[] files = file.listFiles();// asumimos que en este contexto el array es de directorios, ya que el metodo
                                        // listFiles() se usa para listar contenidos de un directorio
        return files;
    }

    public static void main(String[] args) {
        String path = "ApuntesConCodigo\\src\\Testing";
        File file = new File(path);

        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.canRead());
        System.out.println(file.canExecute());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.lastModified());

        for (int i = 0; i < filesX(file).length; i++) {
            System.out.println(filesX(file)[i]);
        }
    }

}
