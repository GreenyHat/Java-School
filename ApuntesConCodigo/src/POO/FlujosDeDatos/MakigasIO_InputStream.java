package POO.FlujosDeDatos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MakigasIO_InputStream {
    public static void main(String[] args) {
        try {
            InputStream fis = new FileInputStream("src/Testing/testingFlujos/test3.txt");
            int val;// Metodo 1
            byte[] arr = new byte[4096];// Metodo 2
            // "val" podra ser un valor comprendido entre 0 y 255 si ha podido leer algo o
            // puede que sea -1 si no hay nada mas que leer

            while ((val = fis.read()) != -1) {// <<-- Mas elegante||que el while (val != -1); que propone Makigas con el
                                              // if/else.
                // Lo que estamos haciendo aqui es que con el parentesis dentro
                // del parentesis de la condicion del bucle, le decimos al codigo que haga
                // esa accion, en este caso la asignacion del valor a la variable "val"
                // declarada anteriormente, antes de comprobar la condicion e iniciar el
                // bucle" Con la estructura (val = fis.read()) dentro de la condición del
                // bucle while. Estamos indicando que se realice esa acción (la lectura del
                // siguiente byte y la asignación del resultado a "val") antes de evaluar la
                // condición del bucle.Si el valor asignado a "val" no es -1 (indicando que aún
                // hay más byte para leer) el bucle continuará. De lo contrario, se terminará.

                System.out.println(val);
                int cuantos = fis.read(arr, 200, 5);
                System.out.println(cuantos);
                cuantos = fis.read(arr, 200, 5);// segunda lectura del resto de valores del array (realmente leera 4,
                                                // sobra uno en el len)
                System.out.println(cuantos);
                /*
                 * Es interesante depurar aqui para ver como funciona el offset (off) y el
                 * length (len). Aquile estamos pasando a cuantos el valor de los bytes que hay
                 * en las posiciones del 0 al 9 en este caso ya que la primera "48" la captura
                 * "val" y las muestra en las posiciones que le indiquemos con el offset, en
                 * este caso desde el 200 (200+1) en adelante.
                 */
            }
            System.out.println("FIN");
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
