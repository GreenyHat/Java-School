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
<p>Encapsulación y el principio de ocultamiento.<br>
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
</li>
</ul>
<blockquote>
<p>``// Definimos la clase padre class ClasePadre {<br>
public String metodo1() {<br>
return “Método 1 de ClasePadre”;<br>
}</p>
<pre><code>public String metodo2() {
    return "Método 2 de ClasePadre";
} }
</code></pre>
<p>// Definimos la clase hija que hereda de la clase padre class<br>
ClaseHija extends ClasePadre {</p>
<pre><code>// Sobreescribimos el metodo1 de la ClasePadre
@Override
public String metodo1() {
    return "Método 1 de ClaseHija";
} }
</code></pre>
<p>// Clase principal para probar el comportamiento public class Main {<br>
public static void main(String[] args) {<br>
ClaseHija obj = new ClaseHija();</p>
<pre><code>    // Llamamos a los métodos
    System.out.println(obj.metodo1());  // Salida: Método 1 de ClaseHija
    System.out.println(obj.metodo2());  // Salida: Método 2 de ClasePadre
} }
</code></pre>
</blockquote>
<p>Ahora, si queremos utilizar el método original de la clase padre dentro del método sobrescrito en la clase hija  <code>super()</code>, lo hacemos de la siguiente manera:</p>
<blockquote>
<p>class ClaseHija extends ClasePadre {</p>
<pre><code>// Sobreescribimos el metodo1 de la ClasePadre
@Override
public String metodo1() {
    String original = super.metodo1();
    return original + " pero modificado por ClaseHija";
} }``
</code></pre>
</blockquote>
<ol start="4">
<li><strong>Polimorfismo</strong></li>
</ol>
<ul>
<li>Definición y utilidad.</li>
<li>Polimorfismo de sobrecarga y polimorfismo de sobreescritura (o dinámico).</li>
</ul>
<ol start="5">
<li><strong>Abstracción</strong></li>
</ol>
<ul>
<li>Clases abstractas y métodos abstractos.</li>
<li>Diferencia entre interfaces y clases abstractas.</li>
</ul>
<ol start="6">
<li><strong>Composición y Agregación</strong></li>
</ol>
<ul>
<li>Relaciones entre clases.</li>
<li>Cuándo usar herencia vs. composición.</li>
</ul>
<ol start="7">
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
<li><strong>Sitios web y tutoriales</strong>:</li>
</ol>
<ul>
<li><strong>Java Brains (YouTube)</strong>: Koushik Kothagal ofrece tutoriales sobre Java que cubren en profundidad los conceptos de POO.</li>
<li><strong>Mozilla Developer Network (MDN)</strong>: Si estás interesado en JavaScript, tienen una sección dedicada a la “Programación orientada a objetos en JavaScript”.</li>
</ul>
<ol start="3">
<li><strong>Ejercicios y práctica</strong>:</li>
</ol>
<ul>
<li><strong><a href="http://Exercism.io">Exercism.io</a></strong>: Te permite practicar con ejercicios de programación y recibir retroalimentación. Tienen ejercicios específicos para diferentes lenguajes que te ayudarán a practicar POO.</li>
</ul>
<p>Dado que la Programación Orientada a Objetos es un concepto que se aplica en muchos lenguajes de programación (Java, C#, C++, Python, Ruby, etc.)</p>

