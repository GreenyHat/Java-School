package POO.FlujosDeDatos.TareasDam;

import java.io.IOException;
import java.io.RandomAccessFile;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;



public class DOM {
    public static void main(String[] args) {

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            DocumentBuilder builder = factory.newDocumentBuilder();

            DOMImplementation implementation = builder.getDOMImplementation();

            Document document = implementation.createDocument(null, "empleados", null);

            RandomAccessFile raf = new RandomAccessFile("EMPLEADOS.DAT", "rw");

            while (raf.getFilePointer()<raf.length()) {//El Filepointer es donde esta en el momento en el fichero, es decir que mientras sea menor a la longitud del documento que sioga leyendo, para llegar al final
                Element empleadoElement = document.createElement("empleado");//Definimos una variable del tipo Element para...  
                /*
                 * CONTINUA AQUI VAS POR EL MINUTO 8 20 DEL VIDEO DE DAM TAREA 2 ACCESO A DATOS #2
                 */

                int codigo = raf.readInt();

                Element codigoElement = document.createElement("codigo");
                Text textCodigo = document.createTextNode(codigo+"");
                codigoElement.appendChild(textCodigo);

                document.getDocumentElement().appendChild(empleadoElement);
            }

            raf.close();
        } catch (ParserConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
