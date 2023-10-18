package POO.FlujosDeDatos;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class TestParseSAX {
    /*
     * He creado un método test() para encapsular la lógica del parser SAX y también
     * he agregado un método main() para que puedas ejecutar la clase. Además, he
     * agregado el manejo de excepciones requerido. Con estas correcciones, el
     * código debería funcionar correctamente.
     * 
     * Sobre este modo de acceso, simplemente destacar que se instanciará, en el
     * método parse, un Handler que será el responsable de ejecutar ciertas operaciones
     * como iniciar elementos, operaciones con nodos, inicio/fin de documento, etc.
     */
    public void test() {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            factory.setValidating(true);
            SAXParser saxParser = factory.newSAXParser();
            File file = new File("test.xml");// Este archivo no existe, es ejemplo
            saxParser.parse(file, new DefaultHandler());
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TestParseSAX parser = new TestParseSAX();
        parser.test();
    }
}
