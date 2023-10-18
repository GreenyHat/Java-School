package POO.FlujosDeDatos;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import java.io.IOException;

public class TestParserDOM {
    //Parser de timpo DOM, la estructura cargara en memoria y tendremos el fichero completo
    
    public class DomExample {
    
        //para poder ejecutarlo
        public static void main(String[] args) {
            try {
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                factory.setValidating(true);
                factory.setIgnoringElementContentWhitespace(true);
                DocumentBuilder builder = factory.newDocumentBuilder();
                File file = new File("ApuntesConCodigo\\src\\Testing\\testingFlujos");
                Document doc = builder.parse(file);
                // Trabajar con el documento 'doc' aquí:
                doc.createElement("ejemplo");
            } catch (ParserConfigurationException | SAXException | IOException e) {
                e.printStackTrace();
            }
        }
    }


    //Esta parte por que?? Que hace?
    //Crea un constructor 
private DocumentBuilderFactory factory;
private DocumentBuilder builder;
private Document doc;

public TestParserDOM() throws ParserConfigurationException, SAXException, IOException {
    factory = DocumentBuilderFactory.newInstance();
    factory.setValidating(true);
    factory.setIgnoringElementContentWhitespace(true);
    
    builder = factory.newDocumentBuilder();
    File file = new File("ApuntesConCodigo\\src\\Testing\\testingFlujos");
    doc = builder.parse(file);
}

public DocumentBuilderFactory getFactory() {
    return factory;
}

public void setFactory(DocumentBuilderFactory factory) {
    this.factory = factory;
}
}
