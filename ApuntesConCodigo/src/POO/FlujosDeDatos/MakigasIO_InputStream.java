package POO.FlujosDeDatos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class MakigasIO_InputStream {
    public static void main(String[] args) {
        try {
            InputStream fis = new FileInputStream("ApuntesConCodigo\\src\\Testing\\testingFlujos\\test3.txt");
            fis.
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
