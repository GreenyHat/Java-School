---


---

<h1 id="índice">Índice:</h1>
<ol>
<li><strong>Introducción a la Programación Orientada a Objetos</strong></li>
</ol>
<ul>
<li>Historia y evolución de la POO.</li>
<li>Beneficios y propósito de la POO.</li>
</ul>
<ol start="2">
<li><strong>Conceptos Básicos de la POO</strong></li>
</ol>
<ul>
<li>Clases y Objetos.</li>
</ul>
<blockquote>
<p>Las <strong>clases</strong> son abstracciones que usamos para convertir elementos que queremos que formen parte de nuestro programa dl cual encapsulamos mediante dos conceptos: <em>atributos</em> y <em>métodos</em>. Habría que añadir los <em>eventos</em> a este fin, ya que serían los triggers que desencadenarían paquetes de código mediante la interacción del usuario con una interfaz grafica, por ejemplo.</p>
<p>Los <strong>objetos</strong>, por otro lado, son la materialización de dicha clase en el codigo, lo que tambien se conoce como instsancia. La clase sería algo así como el concepto, la idea de lo que queremos hacer, concebida al detalle, mientras que el objeto es la materialización de la dea la cual podremos usar.</p>
</blockquote>
<ul>
<li>
<p>Atributos y Métodos.</p>
<ul>
<li>
<p><strong>Atributos</strong>: Son los datos que contendrá la clase (nombre, contraseña, contador…)</p>
</li>
<li>
<p><strong>Métodos</strong>: Son las funcionalidades con las que contara la clase las cuales podrá usar el propio objeto u otros objetos que hereden de dicha clase. Pueden tener opcionalmente parámetros de entrada o parámetros de salida. Si el método retorna un valor se le suele llamar <strong>función</strong> si no <strong>procedimiento</strong></p>
</li>
</ul>
</li>
<li>
<p><strong>Encapsulación</strong> y el principio de ocultamiento.<br>
La encapsulación es el principio mediante el cual en el código se ocultan distintas secciones que <strong>no necesitan</strong> conocer o modificar elementos fuera de dicha clase. Esto ofrece dos ventajas:</p>
<ul>
<li>
<p>Lo que hace el <strong>usuario</strong> puede ser controlado internamente (incluido los errores)</p>
</li>
<li>
<p>Al mantener la mayor parte del codigo oculto, se pueden modificar o mejorar el codigo sin que afecte al modo en el que los usuarios acceden a dicho codigo</p>
</li>
</ul>
</li>
</ul>
<ol start="3">
<li><strong>Herencia</strong></li>
</ol>
<ul>
<li>Concepto y beneficios.</li>
</ul>
<blockquote>
<p>La herencia es la capacidad que tiene una clase de heredar los atributos y métodos de otra. Lo cual favorece a reutilización de código</p>
</blockquote>
<ul>
<li>
<p>Clases base y clases derivadas.</p>
<ul>
<li><strong>Clase base</strong>: La clase base es un tipo específico de clase de la cual podrán heredar las distintas clases derivadas, normalmente atienden a dos objetivos:
<ul>
<li>Diversos tipos tienen algo en común, por ejemplo en el juego del ajedrez, donde todas las piezas forman parte del juego y compartirían desplazamientos en los mismos ejes</li>
<li>Se precisa ampliar la funcionalidad de un programa sin tener que modificar el código existente. Un alfil se mueve de una manera distinta al peón pero comparten dichos estructuras de movimiento.</li>
</ul>
</li>
</ul>
</li>
<li>
<p><strong>Clase derivada</strong>: La clase derivada es aquella que hereda de una clase base con el fin de reutilizar código para ampliar funcionalidades, testear…</p>
</li>
<li>
<p>Sobrescritura y sobrecarga de métodos.</p>
<ul>
<li><strong>Sobrecarga</strong>:  La sobrecarga de métodos, permite usar el mismo nombre del método pero solo si se tiene diferente firma. Cuando hablamos de la firma de un método, nos referimos a sus parámetros…<br>
Un ejemplo: Supongamos que yo quiero hacer sumas, pero mi programa debe sumar por una parte 2 números enteros o 2 números doubles… para esto tengo 2 opciones:</li>
</ul>
<ol>
<li>
<p>crear 2 métodos, uno llamado sumaEnteros(int a, int b) y otro sumaDoubles(double a, double b)</p>
</li>
<li>
<p>Aplicar el concepto de sobrecarga, donde aunque también vamos a crear 2 metodos, los vamos a llamar con el mismo nombre pero con diferentes parametros…sumar(int a, int b) y sumar(double a, double b)</p>
</li>
</ol>
<ul>
<li><strong>Sobreescriura</strong>: Se da cuando en un método heredado se está <em>sobreescribiendo</em> la lógica. <mark>El resto de la clase se puede mantener sin sobreescribir</mark>, por ejemplo:</li>
</ul>
<p>// Definimos la clase padre class ClasePadre {<br>
public String metodo1() {<br>
return “Método 1 de ClasePadre”;<br>
}</p>
<pre><code> public String metodo2() {
     return "Método 2 de ClasePadre";
 } }
</code></pre>
<p>// Definimos la clase hija que hereda de la clase padre class<br>
ClaseHija extends ClasePadre {</p>
<pre><code> // Sobreescribimos el metodo1 de la ClasePadre
 @Override
 public String metodo1() {
     return "Método 1 de ClaseHija";
 } }
</code></pre>
<p>// Clase principal para probar el comportamiento public class Main {<br>
public static void main(String[] args) {<br>
ClaseHija obj = new ClaseHija();</p>
<pre><code>     // Llamamos a los métodos
     System.out.println(obj.metodo1());  // Salida: Método 1 de ClaseHija
     System.out.println(obj.metodo2());  // Salida: Método 2 de ClasePadre
 } }
</code></pre>
</li>
</ul>
<p>Ahora, si queremos utilizar el método original de la clase padre dentro del método sobrescrito en la clase hija  <code>super()</code>, lo hacemos de la siguiente manera:</p>
<pre><code> class ClaseHija extends ClasePadre {
     
     // Sobreescribimos el metodo1 de la ClasePadre
     @Override
     public String metodo1() {
         String original = super.metodo1();
         return original + " pero modificado por ClaseHija";
     } }
</code></pre>
<ol start="4">
<li><strong>Polimorfismo</strong></li>
</ol>
<ul>
<li><strong>Definición y utilidad.</strong><br>
El polimorfismo es la capacidad de una entidad (como una variable o función) de tomar varias formas (como hemos visto antes cuando hablabamos de la sobreescritura y la sobrecarga de métodos). Más concretamente, se refiere a la capacidad de diferentes clases de ser tratadas como instancias de la misma clase, principalmente a través de la herencia. El término “polimorfismo” proviene del griego y significa “muchas formas”.</li>
</ul>
<p>El polimorfismo es una herramienta poderosa y fundamental en POO por las siguientes razones:</p>
<ol>
<li>
<p><strong>Flexibilidad y Reusabilidad</strong>: Permite que el código se escriba de manera más genérica y reutilizable. Por ejemplo, puedes tener una función que procese objetos de una clase padre y, gracias al polimorfismo, esta función puede procesar cualquier objeto de las clases derivadas sin necesidad de reescribir o adaptar la función.</p>
</li>
<li>
<p><strong>Extensibilidad</strong>: El polimorfismo facilita la adición de nuevas clases derivadas sin modificar el código existente. Imagina que tienes un sistema que dibuja diferentes formas geométricas. Si luego deseas agregar una nueva forma, simplemente creas una nueva clase para esa forma y, gracias al polimorfismo, el sistema podrá dibujarla sin cambios adicionales.</p>
</li>
<li>
<p><strong>Encapsulación de Comportamiento</strong>: Cada clase derivada puede tener su propia implementación de un método (sobrescritura), permitiendo que el objeto se comporte de manera adecuada según su tipo real, aunque sea tratado como un objeto de la clase padre.</p>
</li>
<li>
<p><strong>Desacoplamiento</strong>: Reduce las dependencias entre componentes del software, ya que permite que las operaciones se realicen basándose en contratos (como interfaces o clases base) en lugar de implementaciones específicas.</p>
</li>
<li>
<p><strong>Claridad y Organización del Código</strong>: Facilita la lectura y el mantenimiento del código, ya que los desarrolladores pueden esperar comportamientos consistentes entre objetos relacionados, incluso si esos objetos pertenecen a diferentes clases derivadas.</p>
</li>
</ol>
<ul>
<li>Polimorfismo de sobrecarga y polimorfismo de sobreescritura (o dinámico).</li>
</ul>
<h4 id="polimorfismo-de-sobrecarga-overloading">Polimorfismo de Sobrecarga (Overloading)</h4>
<p><strong>Definición</strong>: Se refiere a la capacidad de una función o método de ser “sobrecargado” con múltiples versiones, cada una aceptando diferentes números o tipos de argumentos.</p>
<p><strong>Características</strong>:</p>
<ul>
<li>Una misma función o método se define múltiples veces con diferentes listas de parámetros.</li>
<li>La decisión sobre qué versión del método llamar se toma en tiempo de compilación.</li>
</ul>
<p><strong>Ejemplo</strong>:</p>
<pre><code>public int sumar(int a, int b) {
    return a + b;
}

public double sumar(double a, double b) {
    return a + b;
}
</code></pre>
<p><strong>Ventajas</strong>:</p>
<ul>
<li>Incrementa la legibilidad al permitir que diferentes funciones o métodos compartan un mismo nombre.</li>
<li>Facilita la implementación de funciones o métodos que realizan tareas similares pero con diferentes tipos o números de argumentos.</li>
</ul>
<p><strong>Inconvenientes</strong>:</p>
<ul>
<li>Puede aumentar la complejidad si se abusa de la sobrecarga con muchas versiones del mismo método.</li>
</ul>
<hr>
<h4 id="polimorfismo-de-sobreescritura-o-dinámico-overriding">Polimorfismo de Sobreescritura (o Dinámico, Overriding)</h4>
<p><strong>Definición</strong>: Se refiere a la capacidad de una clase derivada para proporcionar una implementación específica de un método que ya está definido en su clase base o interfaz.</p>
<p><strong>Características</strong>:</p>
<ul>
<li>La firma del método en la clase derivada debe ser idéntica a la de la clase base.</li>
<li>La decisión sobre qué versión del método llamar se toma en tiempo de ejecución basándose en el tipo real del objeto.</li>
<li>En muchos lenguajes, como Java, la anotación <code>@Override</code> se utiliza para indicar que un método está siendo sobreescrito.</li>
</ul>
<p><strong>Ejemplo</strong>:</p>
<pre><code>class Animal {
    void sonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    @Override
    void sonido() {
        System.out.println("El perro ladra");
    }
} 
</code></pre>
<p><strong>Ventajas</strong>:</p>
<ul>
<li>Facilita la extensibilidad al permitir que clases derivadas modifiquen o extiendan comportamientos definidos en clases base.</li>
<li>Refuerza la abstracción al permitir que objetos de diferentes clases se utilicen de manera uniforme, confiando en que cada objeto se comportará de manera adecuada según su tipo real.</li>
</ul>
<p><strong>Inconvenientes</strong>:</p>
<ul>
<li>Si no se utiliza adecuadamente, puede llevar a comportamientos no deseados en la clase derivada.</li>
</ul>
<ol start="5">
<li><strong>Abstracción</strong></li>
</ol>
<p>La abstracción es uno de los cuatro pilares fundamentales de la Programación Orientada a Objetos (junto con la encapsulación, la herencia y el polimorfismo). Permite a los programadores ocultar los detalles complejos y mostrar solo la información esencial, facilitando el manejo de conceptos complejos al representarlos a un alto nivel.</p>
<hr>
<h4 id="clases-abstractas-y-métodos-abstractos"><strong>Clases Abstractas y Métodos Abstractos</strong>:</h4>
<p><strong>Clases Abstractas</strong>:</p>
<ul>
<li>Una clase abstracta es una que no puede ser instanciada directamente. Su propósito principal es ser extendida (heredada) por otras clases.</li>
<li>Puede tener variables de instancia, métodos (que tienen cuerpo) y métodos abstractos (sin cuerpo).</li>
</ul>
<p><strong>Métodos Abstractos</strong>:</p>
<ul>
<li>Son métodos declarados en una clase abstracta sin implementación. No tienen cuerpo.</li>
<li>Las clases que heredan una clase abstracta deben proporcionar una implementación concreta de todos los métodos abstractos, a menos que ellas mismas sean también clases abstractas.</li>
</ul>
<p><strong>Ejemplo</strong>:</p>
<pre><code>abstract class Animal {
    abstract void sonido();
}

class Perro extends Animal {
    @Override
    void sonido() {
        System.out.println("El perro ladra");
    }
}
</code></pre>
<h4 id="diferencia-entre-interfaces-y-clases-abstractas"><strong>Diferencia entre Interfaces y Clases Abstractas</strong>:</h4>
<p><strong>Interfaces</strong>:</p>
<ul>
<li>Es una estructura completamente abstracta que puede incluir métodos abstractos y constantes, pero no implementaciones concretas ni variables de instancia.</li>
<li>Permite la “herencia múltiple”, es decir, una clase puede implementar múltiples interfaces.</li>
</ul>
<p><strong>Clases Abstractas</strong>:</p>
<ul>
<li>Pueden tener tanto métodos concretos (con cuerpo) como abstractos (sin cuerpo).</li>
<li>Pueden tener variables de instancia.</li>
<li>Una clase puede extender solo una clase abstracta, siguiendo el principio de “herencia simple” en la mayoría de los lenguajes de programación orientados a objetos.</li>
</ul>
<p><strong>Comparativa</strong>:</p>
<ul>
<li>
<p><strong>Propósito</strong>: Las clases abstractas suelen ser una base para clases con características y comportamientos similares. Las interfaces se utilizan para definir contratos que otras clases deben implementar, independientemente de su jerarquía en la herencia.</p>
</li>
<li>
<p><strong>Flexibilidad</strong>: Las interfaces son más flexibles ya que una clase puede implementar múltiples interfaces, mientras que solo puede heredar de una única clase abstracta.</p>
</li>
<li>
<p><strong>Estado</strong>: Las clases abstractas pueden mantener el estado a través de variables de instancia. Las interfaces no pueden.</p>
</li>
</ul>
<p><strong>Ejemplo</strong>:</p>
<pre><code>interface Corredor {
    void correr();
}

abstract class Animal {
    abstract void sonido();
}

class Perro extends Animal implements Corredor {
    @Override
    void sonido() {
        System.out.println("El perro ladra");
    }

    @Override
    public void correr() {
        System.out.println("El perro corre");
    }
}
</code></pre>
<ol start="6">
<li><strong>Encapsulación</strong></li>
</ol>
<p><strong>Definición</strong>: La encapsulación se refiere al proceso de ocultar detalles internos o complejos de un objeto, exponiendo solo lo que es necesario o seguro. En otras palabras, es una técnica que envuelve el código y los datos juntos como una única unidad, protegiendo el estado del objeto de accesos no autorizados y modificaciones.</p>
<hr>
<h4 id="propósito"><strong>Propósito</strong>:</h4>
<ol>
<li>
<p><strong>Proteger la Integridad de los Datos</strong>: Mediante la encapsulación, podemos asegurarnos de que el estado interno de un objeto no sea alterado inapropiadamente.</p>
</li>
<li>
<p><strong>Flexibilidad y Mantenibilidad</strong>: Al ocultar los detalles internos, es más fácil hacer cambios en la implementación de una clase sin afectar a las partes del código que la utilizan.</p>
</li>
<li>
<p><strong>Aumentar la Modularidad</strong>: La encapsulación fomenta la modularidad al mantener el comportamiento y el estado del objeto en un solo lugar.</p>
</li>
</ol>
<hr>
<h4 id="cómo-se-implementa"><strong>Cómo se Implementa</strong>:</h4>
<ol>
<li>
<p><strong>Variables/Miembros Privados</strong>: Los atributos (o variables de instancia) de una clase se hacen privados para que no puedan ser accesibles o modificables directamente desde fuera de la clase.</p>
</li>
<li>
<p><strong>Métodos Públicos Accesores y Mutadores (Getters y Setters)</strong>: Para acceder o modificar los atributos privados, se proporcionan métodos públicos. Los métodos “getters” (obtener) permiten leer valores de atributos, y los métodos “setters” (establecer) permiten cambiarlos. Estos métodos actúan como una puerta controlada al estado interno del objeto.</p>
</li>
</ol>
<p><strong>Ejemplo</strong>:</p>
<pre><code>public class Persona {
    private String nombre; // Atributo privado
    private int edad;      // Atributo privado

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método "getter" para el nombre
    public String getNombre() {
        return nombre;
    }

    // Método "setter" para el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método "getter" para la edad
    public int getEdad() {
        return edad;
    }

    // Método "setter" para la edad
    public void setEdad(int edad) {
        if (edad &gt; 0) { // Validación simple
            this.edad = edad;
        }
    }
}
</code></pre>
<hr>
<h4 id="beneficios"><strong>Beneficios</strong>:</h4>
<ol>
<li>
<p><strong>Control</strong>: La encapsulación brinda un control completo sobre los datos de un objeto, permitiendo validaciones o transformaciones cuando se accede o modifica.</p>
</li>
<li>
<p><strong>Reducción de Errores</strong>: Al restringir el acceso directo, se evita que otras partes del código modifiquen el estado del objeto de maneras inesperadas o erróneas.</p>
</li>
<li>
<p><strong>Simplicidad para el Usuario</strong>: Los usuarios o desarrolladores que utilicen la clase no necesitan conocer o preocuparse por los detalles internos de implementación.</p>
</li>
</ol>
<hr>
<ol start="7">
<li><strong>Composición y Agregación</strong></li>
</ol>
<ul>
<li>Relaciones entre clases.</li>
<li>Cuándo usar herencia vs. composición.</li>
</ul>
<ol start="8">
<li>
<p><strong>Principios SOLID</strong></p>
<ul>
<li><a href="https://youtu.be/73IBjmyjDX0?list=PLTd5ehIj0goO1JFIfukh3UtU9e0BeFM9K">SRP (Principio de responsabilidad unica)</a></li>
<li><a href="https://youtu.be/3QvSS4BEfPs?list=PLTd5ehIj0goO1JFIfukh3UtU9e0BeFM9K">OCP (Principio abierto/cerrado)</a></li>
<li><a href="https://youtu.be/JQX7wrCzxFA?list=PLTd5ehIj0goO1JFIfukh3UtU9e0BeFM9K">LSP (Principio de sustitucion de Liskov)</a></li>
<li><a href="https://youtu.be/FIiNB9rv1P0?list=PLTd5ehIj0goO1JFIfukh3UtU9e0BeFM9K">ISP (Principio de segregacion de interfaz)</a></li>
<li>Inversion de dependencia</li>
</ul>
</li>
<li>
<p><strong>Patrones de Diseño</strong></p>
</li>
</ol>
<ul>
<li>Concepto y propósito.</li>
<li>Patrones comunes: Singleton, Factory, Observer, Strategy, entre otros.</li>
</ul>
<p><strong>Recursos recomendados:</strong></p>
<ol>
<li><strong>Libros</strong>:</li>
</ol>
<ul>
<li>“Object-Oriented Thought Process” de Matt Weisfeld: Es un excelente libro para principiantes que desean comprender el pensamiento detrás de la POO.</li>
<li>“Design Patterns: Elements of Reusable Object-Oriented Software” de Erich Gamma, Richard Helm, Ralph Johnson y John Vlissides: Es un libro clásico sobre patrones de diseño en POO.</li>
</ul>
<ol start="2">
<li><strong>Ejercicios y práctica</strong>:</li>
</ol>
<ul>
<li><strong><a href="http://Exercism.io">Exercism.io</a></strong>: Te permite practicar con ejercicios de programación y recibir retroalimentación. Tienen ejercicios específicos para diferentes lenguajes que te ayudarán a practicar POO.</li>
</ul>
<p>Dado que la Programación Orientada a Objetos es un concepto que se aplica en muchos lenguajes de programación (Java, C#, C++, Python, Ruby, etc.)</p>

