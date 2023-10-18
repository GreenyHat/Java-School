package POO.FlujosDeDatos;

import java.io.*;

public class MakigasIO_OutputStream {
    
    /*
     * Conceptos generales de la informatica:
     * StdOut (salida estandar) --> en Java System.out
     * StdIn (Entrada estandar) --> System.in (Lo que usamos como parametro del
     * objeto Scanner)
     * La entrada y salida de la info puede darse de distintas formas. Como hemos
     * estado viendo hasta ahora, por consola, por medio de un archivo, por medio de
     * la memoria, un servidor, un dispositivo de almacenamiento...
     * 
     * I/O en Java:
     * Se organiza alredeodr de una estructura de datos general, denominado Stream,
     * los cuales conectan nuestro programa con el mundo exterior o viceversa
     * java.io
     * OutputStream: File para escribir en archivos, outputstreams envolventes
     * (outputstreams donde en su
     * constructor tiene otro outputstream?TENGO QUE DARLE VUELTAS A ESTO?),
     * System.out (implementados por el propio java)
     * InputStream: File para leer archivos, inputstreams envolventes, System.in,
     * tambien se puede establecer conexion de red para consumir el input stream
     * para hablar con el servidor TCP
     */
    public static void main(String[] args) {
        try {
            OutputStream fos = new FileOutputStream("ApuntesConCodigo\\src\\Testing\\testingFlujos\\test3.txt");
            // Los metodos mas importantes seran close() para cerrar el flujo, flush() para
            // en cualquier momento
            // decirle a Java que se asegure de que todos los bytes se han enviado
            // correctamente y write() para escribir de distintas formas
            try {
                for (var i = 0x30; i < 0x39; i++) {// del 0 al 9 en hexadecimal
                    fos.write(i);
                    /*
                     * Explicacion de los 24 bits ignorados:
                     * Cuando se habla de un byte, nos referimos a un conjunto de 8 bits. Sin
                     * embargo, el método write() de FileOutputStream toma un argumento entero
                     * (int), que es de 32 bits en Java.
                     * Por lo que si en vez de poner esos dos numeros en hexadecimal, pones un int
                     * cualquiera
                     * lo traducira a binario y se quedara con el ultimo grupo de 8 bits de los 32,
                     * es decir, ignorara los 24 anteriores, los otros 3 grupos de 8 bits
                     * //////////////////////////////////////////////////////////////
                     * /////////////////////////////////////////////////////////////
                     * El número 259 se representa en binario como 00000000 00000000 00000001
                     * 00000011. Estos son 32 bits, divididos en 4 grupos de 8 bits.
                     * 
                     * El método write() solo toma los 8 bits de más bajo orden (los más a la
                     * derecha) para escribir en el archivo. En este caso, esos 8 bits son 00000011,
                     * que es 3 en decimal. Por lo tanto, solo se escribirá el valor 3 en el
                     * archivo, y los otros 24 bits a la izquierda (los de más alto orden) son
                     * ignorados.
                     * 
                     * Es por eso que se dice que los "24 bits de más alto orden son ignorados".
                     * Solo se escribe el byte de más bajo orden en el archivo.
                     */
                }
                fos.flush();
                /*
                 * Sobre el flush hay que decir que por optimizar el intercambio de info muchas
                 * veces Java decidira no mandar todos los bytes hasta saber que esta enviando,
                 * por lo que los almacenara de manera local hasta que decida enviarlo, para
                 * asegurarnos de que eso no pasa, si lo necesitamos, se usa flush() antes del
                 * close()
                 */
                fos.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
