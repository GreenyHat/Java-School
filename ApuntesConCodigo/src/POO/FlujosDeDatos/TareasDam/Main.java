package POO.FlujosDeDatos.TareasDam;

// import java.io.FileNotFoundException;//IMPORTANTE: Como IOException esta por en cima en la jerarquia admite tambien a FileNotFoundException
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Empleados> empleado = new ArrayList<>();

        int cod = (int) (Math.random() * 99999999 + 1);
        empleado.add(new Empleados(cod, "Alfredo Ramos", "Calle Falsa, numero -5", 500, 2200));
        empleado.add(new Empleados(cod, "Laura Ramos", "Calle Falsa, numero -5", 500, 1600));
        empleado.add(new Empleados(cod, "Juan Ramos", "Calle Falsa, numero -5", 600, 1600));
        empleado.add(new Empleados(cod, "Eva Ramos", "Calle Falsa, numero -5", 100, 1300));
        empleado.add(new Empleados(cod, "Miriam Ramos", "Calle Falsa, numero -5", 300, 1900));
        empleado.add(new Empleados(cod, "Carlota Ramos", "Calle Falsa, numero -5", 500, 1900));
        empleado.add(new Empleados(cod, "Bernardo Ramos", "Calle Falsa, numero -5", 500, 1800));
        empleado.add(new Empleados(cod, "Alfredo Ramos", "Calle Falsa, numero -5", 500, 1200));

        try {
            RandomAccessFile raf = new RandomAccessFile("EMPLEADOS.DAT", "rw");// El rw se refiere a que esta en modo
                                                                               // lectura/escritura

            for (Empleados e : empleado) {// Sintaxis para recorrer una lista (Nombre de la lista (Empleados) + elemento
                                          // de la lista (empleado))
                raf.writeInt(e.getCodigo());
                StringBuffer sb = new StringBuffer(e.getNombre());
                sb.setLength(20);// esto es para establecer la longitud del contenido actual del stringBufferSi
                                 // el valor de longitud es mayor que la longitud actual, el contenido actual se
                                 // expandirá para ajustarse a la nueva longitud, rellenando con caracteres nulos
                                 // ('\u0000').
                raf.writeChars(sb.toString());// Los Strings son especiales, hay que hacer abrir un stream para que la
                                              // escritura sea correcta
                sb = new StringBuffer(e.getDireccion());
                sb.setLength(30);
                raf.writeChars(sb.toString());
                raf.writeFloat(e.getComision());
                raf.writeFloat(e.getSalario());

            }
            raf.close();
            System.out.println("Escritura realizada con exito");
        } catch (IOException e) {// IMPORTANTE: Como IOException esta por en cima en la jerarquia admite tambien
            // a FileNotFoundException
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
