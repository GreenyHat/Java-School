package POO.FlujosDeDatos;

import java.io.File;
import java.io.IOException;

public class Tema1ClaseFile {
    ///////////////////// Clase File///////////////////////////////////
    /*
     * 1. Instancias dentro de un bloque, como metodo o dentro del main
     * ya que en Java no se permite ejecutar este tipo de metodos dentro del cuerpo
     * de la clase
     * 
     * 2. En la instanciacion estableces el path/ruta absoluta
     * 
     * 3. Maneajas el archivo para hacer lo que veas oportuno, dentro del main
     * 
     * 4. Es importante destacar que debes manejas las excepciones de alguna manera
     * ya sea con un try/catch o con un throw como en este caso.
     * 
     * 4.1. Direrencias entre trhow y try/cath:
     * Soluciones:
     * 1. try/catch:
     * Control inmediato: Te permite manejar la excepción en el lugar exacto donde
     * podría ocurrir.
     * 
     * Reporte y recuperación: Puedes mostrar mensajes específicos, registrar el
     * error o incluso intentar una acción alternativa para recuperarte del error.
     * 
     * Flujo del programa: El programa continúa ejecutándose después de un bloque
     * catch (a menos que elijas terminarlo dentro del catch).
     * 
     * Uso:
     * Cuando esperas que ciertos errores puedan ocurrir y quieres manejarlos
     * específicamente.
     * Cuando quieres proporcionar mensajes de error útiles o instrucciones al
     * usuario.
     * Cuando no quieres que una excepción detenga la ejecución completa del
     * programa, pero prefieres manejarla y continuar.
     * 
     * 2. throws:
     * Delegar responsabilidad: Declarar throws en un método indica que ese método
     * no manejará la excepción, y es responsabilidad del método que lo invoca
     * manejarla.
     * 
     * Simplicidad: A veces, especialmente para herramientas o aplicaciones rápidas,
     * puede ser más sencillo simplemente propagar la excepción y dejar que el
     * programa termine si ocurre un problema.
     * 
     * Niveles superiores: Al propagar una excepción a niveles superiores, puedes
     * manejarla en un lugar más generalizado, en lugar de manejarla en cada lugar
     * donde podría ocurrir.
     * 
     * Uso:
     * Cuando es probable que el método que llama a tu método esté en una mejor
     * posición para manejar la excepción.
     * En operaciones donde es aceptable que la excepción termine el programa si no
     * se maneja (por ejemplo, en herramientas de línea de comandos).
     * Cuando no estás seguro de cómo manejar una excepción en un nivel más bajo y
     * prefieres que los niveles superiores decidan.
     * 
     * ///////////////////METODOS////////////////////////
     * /////////////////////////////////////////////////
     * 
     * createNewFile() Genera el fichero indicado
     * delete() Borra el fichero
     * mkdirs() Crea directorio indicado
     * getName() Devuelve String con nombre del fichero
     * getPath(), getAbsolutePath() Devuelve la ruta relativa y absoluta
     * getParent() Devuelve el directorio superior
     * renameTo() Acepta como parámetro un nuevo File,
     * el cual será la nueva ruta del fichero
     * exists() Comprueba si existe el fichero
     * canWrite(), canRead() Comprueba si puede ser escrito o leído
     * listFiles() Devuelve un array con los ficheros
     * del directorio indicado
     * 
     * 
     * 
     * Acceso secuencial y aleatorio:
     * En el aleatorio se establece un puntero en bytes el cual indica la posicion
     * exacta donde vamos a realizar la lectura o escritura, mientras que en el
     * secuencial debe ser recorrido caracter a caracter o byte a byte
     * 
     * ///////////////////CLASES DE ACCESO////////////////////////
     * //////////////////////////////////////////////////////////
     * Basado en caracteres: Entrada << FileReader //// Salida >> FileWriter
     * Basado en bytes: Entrada << FileInputStream//RandomAccessFile ////
     * Salida >> FileOutputStream//RandomAccesFile
     */

    public static void main(String[] args) throws IOException {
        File fichero = new File(
                "ApuntesConCodigo\\src\\Testing\\testingFlujos\\test.txt");
        File fichero2 = new File(
                "ApuntesConCodigo\\src\\Testing\\testingFlujos\\test3.txt");

        fichero.createNewFile();

        fichero2.createNewFile();

        fichero.delete();

    }

}
