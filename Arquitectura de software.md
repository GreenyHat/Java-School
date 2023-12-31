# Índice:

1.  **Introducción a la Arquitectura de Software (Acceso a datos)**

-   Definición y propósito
-   Rol del arquitecto de software

2.  **Estilos y Patrones de Arquitectura**

-   Estilos arquitectónicos (Monolítico, Microservicios, Event-Driven, etc.)
-   Patrones comunes (MVC, MVVM, N-capas, etc.)

3.  **Documentación de Arquitectura**

-   Vistas de arquitectura
-   Lenguajes de descripción de arquitectura (ADLs)

4.  **Arquitectura de Software y Calidad**

-   Atributos de calidad (rendimiento, seguridad, usabilidad, etc.)
-   Tácticas y estrategias para lograr atributos de calidad

5.  **Diseño y Evaluación de Arquitecturas**

-   Principios SOLID
	- [SRP (Principio de responsabilidad unica)](https://youtu.be/73IBjmyjDX0?list=PLTd5ehIj0goO1JFIfukh3UtU9e0BeFM9K)
	- [OCP (Principio abierto/cerrado)](https://youtu.be/3QvSS4BEfPs?list=PLTd5ehIj0goO1JFIfukh3UtU9e0BeFM9K)
	- [LSP (Principio de sustitucion de Liskov)](https://youtu.be/JQX7wrCzxFA?list=PLTd5ehIj0goO1JFIfukh3UtU9e0BeFM9K)
	- [ISP (Principio de segregacion de interfaz)](https://youtu.be/FIiNB9rv1P0?list=PLTd5ehIj0goO1JFIfukh3UtU9e0BeFM9K)
	- Inversion de dependencia
-   Análisis y evaluación de arquitecturas (ATAM, etc.)

6.  **Tendencias Actuales y Emergentes**

-   Arquitecturas basadas en contenedores (Docker, Kubernetes)
-   Arquitecturas serverless
-   Arquitecturas orientadas a eventos

7.  **Herramientas y Prácticas**

-   Herramientas de modelado y diseño
-   Integración continua y entrega continua (CI/CD)


## Relación con acceso a datos:

La asignatura "acceso a datos" en el módulo de Desarrollo de Aplicaciones Multiplataforma (DAM) puede ser altamente complementaria en el camino de aprendizaje sobre arquitectura de software. Veamos por qué:

1.  **Interacción con Bases de Datos**: La arquitectura de software no solo se trata de diseñar sistemas desde un punto de vista teórico. En la práctica, comprender cómo las aplicaciones interactúan con las bases de datos es esencial. Esto incluye aspectos como la conexión, la consulta y la manipulación de datos, y la gestión de transacciones.
2.  **Integración de Tecnologías**: Como mencionaste, en la asignatura se aborda cómo convergen lenguajes como Java y XML. En la arquitectura de software, a menudo tendrás que diseñar sistemas que integren múltiples tecnologías. Comprender cómo diferentes tecnologías pueden trabajar juntas es un aspecto crucial de la labor de un arquitecto.
3.  **Abstracción y Capas**: En el acceso a datos, se introduce a menudo el concepto de capas, especialmente la capa de datos o capa de persistencia. Entender cómo se pueden separar las responsabilidades en diferentes capas es fundamental en arquitectura, ya que permite crear sistemas modulares y mantenibles.
4.  **Patrones de Diseño**: En el contexto del acceso a datos, es probable que te encuentres con patrones como el DAO (Data Access Object) o el Repository. Estos patrones son ejemplos concretos de cómo se pueden aplicar principios arquitectónicos para resolver problemas específicos en el mundo real.
5.  **Rendimiento y Optimización**: Acceder a datos de manera eficiente puede ser un desafío. Las decisiones arquitectónicas que tomes pueden tener un impacto significativo en el rendimiento de un sistema. Por lo tanto, aprender sobre indexación, consultas optimizadas y caché, por ejemplo, te proporcionará herramientas valiosas cuando diseñes arquitecturas.
6.  **Seguridad**: Cuando se trata de acceso a datos, la seguridad es primordial. Es esencial comprender cómo proteger los datos, cómo gestionar los accesos y cómo garantizar la integridad de la información. Estos conceptos también son vitales desde una perspectiva arquitectónica.

En resumen, mientras aprendes sobre acceso a datos, se van adquiriendo habilidades y conocimientos que son directamente relevantes y aplicables a la arquitectura de software. Es recomendable buscar siempre cómo se relaciona lo que aprendes con los principios y prácticas arquitectónicas más amplias.

### _En cuanto al punto 2 cabe destacar:_

En muchas aplicaciones modernas y contextos específicos, especialmente en el desarrollo web y en configuraciones, JSON y YAML se han vuelto más populares que XML. Sin embargo, hay algunas consideraciones a tener en cuenta:

1.  **Historia y Legado**: Aunque JSON y YAML se han vuelto más populares en ciertos ámbitos, muchas aplicaciones y sistemas más antiguos aún utilizan XML. Por lo tanto, tener un conocimiento profundo de XML es esencial si alguna vez trabajas con sistemas legados o en industrias donde XML sigue siendo el estándar.
2.  **Flexibilidad y Especificidad**: XML tiene características que no se encuentran en JSON o YAML, como atributos y [espacios de nombres](https://es.wikipedia.org/wiki/Espacio_de_nombres_XML). Además, XML tiene toda una familia de tecnologías asociadas (como XSLT, XPath y XML Schema) que permiten operaciones complejas y validación detallada.
3.  **Industrias Específicas**: Hay industrias y estándares que todavía se basan en XML. Por ejemplo, en el mundo de los servicios web, [SOAP](https://polaridad.es/soap-que-es-y-como-funciona-el-protocolo-de-acceso-a-objetos-simples/) (que utiliza XML) todavía es relevante en ciertos contextos empresariales. Otros estándares, como HL7 en el sector de la salud, también usan XML.
4.  **Configuración y Desarrollo**: En el mundo de Java, muchas herramientas y frameworks, como Spring, han utilizado tradicionalmente archivos XML para configuración. Aunque estas herramientas han ido adoptando otros formatos (como anotaciones y propiedades), el conocimiento de XML sigue siendo útil.
5.  **Formato Auto-descriptivo**: A diferencia de JSON y YAML, XML es un formato auto-descriptivo. Esto significa que puede transportar tanto datos como metadatos (a través de atributos, espacios de nombres, etc.), lo que puede ser beneficioso en ciertos contextos.

Dicho esto, es cierto que para muchos desarrollos modernos, especialmente en el desarrollo web orientado a APIs RESTful, JSON ha tomado la delantera debido a su simplicidad y ligereza. YAML, por su parte, ha ganado popularidad en configuraciones, como en los archivos Docker Compose o Kubernetes, gracias a su formato legible por humanos.

En resumen, aunque XML puede parecer menos "moderno" en comparación con JSON o YAML en ciertos contextos, sigue siendo una tecnología relevante y útil en muchos escenarios. Es valioso aprender sobre XML, pero también es crucial estar al tanto de las tendencias actuales y familiarizarse con JSON, YAML y otros formatos y tecnologías emergentes.




## 2. Estilos y Patrones de Arquitectura:

![Monolitico vs Microservicios](https://www.ilimit.com/wp-content/uploads/2020/09/Monolith-vs-Microservices.png)

###  Estilos arquitectónicos (Monolítico, Microservicios, Event-Driven, etc.)

Los diferentes estilos arquitectonicos responden a diferentes requerimientos. Por ejemplo:

 **Monolitico:** Es recomendable para proyectos de bajos requerimientos, donde el bajo coste o la previsión de un equipo pequeño sea lo decisivo. Es decir, que tiene que haber el menor numero de clases y módulos posible, así como que todas las funcionalidades esten en un mismo programa, a ser posible.
	-  Los programas son **fáciles de desarrollar**.
	-   El **despliegue y la ejecución** del software son muy sencillos.
	-   El **costo de desarrollo es bajo** en comparación con otras arquitecturas.

**Características**:

-   Una única aplicación que maneja todas las responsabilidades del sistema.
-   Los componentes son interdependientes y se ejecutan en un único proceso.

**Ventajas**:

-   Desarrollo y despliegue más sencillos inicialmente.
-   Menos complejidad en la comunicación entre componentes.

**Inconvenientes**:

-   El código puede volverse difícil de mantener a medida que la base de código crece.
-   La escalabilidad puede ser un problema.
-   Difícil de adaptar a nuevas tecnologías debido a la fuerte interdependencia.


 **Arquitectura basada en capas (Layered Architecture):** 

**Características**:

-   Divide la aplicación en capas lógicas, como presentación, lógica de negocio y acceso a datos.
-   Cada capa depende de las capas que están por debajo de ella.

**Ventajas**:

-   Separación de responsabilidades.
-   Reusabilidad de capas.
-   Facilita la mantenibilidad.

**Inconvenientes**:

-   La comunicación entre capas puede añadir latencia.
-   Cambios en una capa pueden afectar a las demás. 



 **Microservicios:** Admite un mayor numero de clases y módulos por lo que se integra mejor con un mayor equipo ya que no todas las funcionalidades depende de grandes paquetes de código, a diferencia del monolitico donde para comprender el código tienes que tener un gran conocimiento de la totalidad.

**Características**:

-   Divide la aplicación en servicios más pequeños e independientes.
-   Cada servicio es independiente y puede ser desarrollado, desplegado y escalado individualmente.

**Ventajas**:

-   Flexibilidad en la elección de tecnologías.
-   Escalabilidad y resilencia mejoradas.
-   Rápida adaptación a cambios y nuevas funcionalidades.

**Inconvenientes**:

-   Más complejidad en la gestión y comunicación entre servicios.
-   Requiere un seguimiento, monitoreo y herramientas de despliegue más sofisticadas.
-   La consistencia de datos puede ser un desafío.


 **Arquitectura orientada a servicios (SOA):**

**Características**:

-   Conjunto de servicios que se comunican entre sí.
-   Los servicios pueden ser reutilizados en diferentes aplicaciones.

**Ventajas**:

-   Alta reusabilidad.
-   Facilita la integración entre diferentes sistemas.
-   Flexibilidad para adaptarse a los cambios.

**Inconvenientes**:

-   Mayor latencia debido a la comunicación entre servicios.
-   Puede volverse complejo a medida que crece el número de servicios.


 **Event-Driven:** Es una arquitectura basada en eventos, o cambios de estado. Cabe distinguir aquí dos conceptos importantes que serían:  La notificación del evento (o mensaje, tipicamente asíncrono) que sería el trigger del evento, y el evento en sí mismo que sería el cambio de estado en una parte del software. Por ejemplo, dos aplicaciones: ventas e inventario, interactuan ante la petición de compra para cambiar el estado de un producto de _"A la venta"_ a _"Vendido"_

**Características**:

-   Los componentes del sistema reaccionan a eventos.
-   Decoupling entre los productores y consumidores de eventos.

**Ventajas**:

-   Alta escalabilidad y flexibilidad.
-   Los componentes pueden ser desplegados y escalados independientemente.

**Inconvenientes**:

-   La secuencia y el control del flujo pueden ser difíciles de seguir y rastrear.
-   Se requiere una infraestructura de manejo de eventos robusta.
	
### Patrones comunes (MVC, MVVM, N-capas, etc.)

  ### **MVC (Modelo vista controlador):**
![enter image description here](https://developer.mozilla.org/es/docs/Glossary/MVC/model-view-controller-light-blue.png)

Es un patron de arquitectura que debe su nombre a los elementos que componen su estructura principal: **MVC**, parte de las iniciales de Modelo-Vista-Controlador.

- Capa **M**odelo: encontramos los datos de dominio, los cuales almacenarán la inforación. Alli se establece la logica de negocio de la app. Si la app consume servicios prestados por otros sistemas (sistema distribuido) tambien encontrará en esta  capa los DTO (data transfer objects), tambien llamadas clases de transferencia de datos. Por ejemplo, si estamos desarrollando una aplicación de facturación, en el modelo existirán las clases  `Factura`,  `Cliente`  o  `Proveedor`, entre otras.

- Capa **V**ista: Son los componentes encargados de generar la interfaz. Por ejemplo, si un usuario está consultando una factura a través de una aplicación web, la Vista se encargará de representar visualmente el estado actual de la misma en forma de página visualizable en su navegado

- Capa **C**ontrolador: La funcion principal de esta capa es actuar de intermediaria entre el usuario y el sistema. Otras tareas que realiza es de transformacion de datos, para hacer que V y M se entiendan. Por lo que se podria decir que el Controlador es el coordinador general del sistema

![enter image description here](https://www.campusmvp.es/recursos/image.axd?picture=/2019/4T/interaccion-m-v-c.png)

**Características**:

-   Divide la aplicación en tres componentes interconectados:
    -   **Model**: Representa la lógica de negocio y los datos.
    -   **View**: Representa la interfaz de usuario y la presentación.
    -   **Controller**: Actúa como intermediario entre Model y View, gestionando la entrada del usuario y actualizando la vista correspondientemente.

**Ventajas**:

-   Separación clara de responsabilidades, lo que facilita la mantenibilidad y la escalabilidad.
-   Fomenta el desarrollo paralelo. Por ejemplo, mientras un desarrollador trabaja en la vista, otro puede trabajar en la lógica del modelo.
-   Reusabilidad del código.

**Inconvenientes**:

-   Puede volverse complejo si no se gestiona adecuadamente.
-   Para aplicaciones pequeñas, puede parecer una sobrecarga.



### **MVVM (Model-View-ViewModel)**:
 
**Características**:

-   Específicamente diseñado para aplicaciones con interfaces ricas, como las desarrolladas con WPF, Xamarin o herramientas frontend como Angular:
    -   **Model**: Representa datos y lógica de negocio.
    -   **View**: Representa la interfaz de usuario.
    -   **ViewModel**: Actúa como un enlace entre el Model y la View, y tiene la responsabilidad de transformar los datos del modelo en una forma que pueda ser mostrada fácilmente en la vista.

**Ventajas**:

-   Permite un enlace de datos bidireccional entre View y ViewModel, lo que facilita la actualización automática de la interfaz de usuario.
-   Promueve una separación de la lógica de presentación y lógica de negocio.
-   Facilita las pruebas unitarias, especialmente en la lógica de presentación.

**Inconvenientes**:

-   Puede ser más complejo que MVC para aplicaciones sencillas.
-   La curva de aprendizaje puede ser más pronunciada, especialmente para aquellos que no están familiarizados con el enlace de datos.


### **N-capas**:

**Características**:

-   Divide una aplicación en "capas" lógicas separadas, con cada capa teniendo una responsabilidad específica. Las capas comunes incluyen: Presentación, Lógica de Negocio, Acceso a Datos, etc.
-   Las capas interactúan entre sí, pero cada una debe ser independiente en términos de operaciones y responsabilidades.

**Ventajas**:

-   Separación de responsabilidades, facilitando la mantenibilidad y escalabilidad.
-   Fomenta la reusabilidad del código. Por ejemplo, la capa de acceso a datos podría usarse en múltiples sistemas si se diseña adecuadamente.
-   Facilita las pruebas ya que cada capa puede probarse de forma independiente.

**Inconvenientes**:

-   Si no se diseña adecuadamente, puede resultar en una alta dependencia entre las capas, lo que va en contra del propósito principal del patrón.
-   La comunicación entre capas puede introducir latencia si no se gestiona correctamente.

## 3.  **Documentación de Arquitectura**

###  Vistas de arquitectura
![enter image description here](https://upload.wikimedia.org/wikipedia/commons/f/f2/4+1_Architectural_View_Model.jpg)
Cuando hablamos de "vistas de arquitectura" en el contexto de documentar la arquitectura de software, nos referimos a diferentes representaciones o perspectivas de la arquitectura que atienden a diferentes preocupaciones o intereses de los stakeholders. Estas vistas son esenciales para comprender, comunicar y documentar la arquitectura de un sistema.

El concepto de vistas de arquitectura fue popularizado por el trabajo de Philippe Kruchten, conocido como "El Modelo de 4+1 Vistas". Según este modelo, hay varias vistas principales:

1.  **Vista Lógica**:
    
    -   **Preocupación**: Funcionalidad del sistema.
    -   **Descripción**: Muestra cómo se espera que el sistema se comporte en términos de funcionalidad. Se enfoca en los elementos funcionales, sus responsabilidades, relaciones y la colaboración entre ellos. A menudo utiliza diagramas de clases o de paquetes.
2.  **Vista de Implementación**:
    
    -   **Preocupación**: Organización del código fuente.
    -   **Descripción**: Detalla cómo se organiza el sistema en términos de componentes de software, archivos fuente, bibliotecas, etc. Utiliza diagramas de componentes y diagramas de despliegue.
3.  **Vista de Procesos**:
    
    -   **Preocupación**: Rendimiento, escalabilidad y concurrencia.
    -   **Descripción**: Trata aspectos relacionados con la concurrencia, distribución, integradores, y cómo las tareas se dividen y coordinan. Diagramas de secuencia y diagramas de actividades suelen ser comunes aquí.
4.  **Vista Física** (o de Despliegue):
    
    -   **Preocupación**: Cómo el sistema se despliega en el hardware.
    -   **Descripción**: Describe la infraestructura y cómo los componentes del software se asignan a nodos de hardware. Utiliza diagramas de despliegue.
5.  **Vista de Casos de Uso (o escenarios)**:
    
    -   **Preocupación**: Validar la arquitectura desde un punto de vista de usuario o stakeholder.
    -   **Descripción**: Esta no es exactamente una vista en sí, sino más bien una serie de escenarios o casos de uso que validan y demuestran cómo se espera que el sistema funcione en la vida real.

Las vistas de arquitectura proporcionan una forma estructurada de representar y comunicar la arquitectura de software. Al diseñar un sistema, es posible que no todas las vistas sean relevantes o necesarias; la elección de qué vistas incluir debe basarse en las preocupaciones específicas del proyecto y los stakeholders involucrados.


###   Lenguajes de descripción de arquitectura (ADLs)
<!--stackedit_data:
eyJoaXN0b3J5IjpbNDQ1MTExNzU5LDE4MDk2MjI4NTIsMTM4ND
UwNDY0NywtMTY4OTgzNTg5NSwtNDM3OTIwNzksLTIwMjA4NDY1
MTgsMTEwODc1MzU5OSwtNTg2NjA5Mjk2LC0xODQxMjg1MTE0LC
00OTg2NDA3OTIsLTczNDYwNDMyMSwtNTcyNjIwMjQxLDc0ODU5
Mjg2OSwtMTI0Mzg3MTc0MywtMTU2MTExMTk0NV19
-->