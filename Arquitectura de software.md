# Índice:

1.  **Introducción a la Arquitectura de Software**

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

8. Tipos de aplicación:
- App web estáticas:
da


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

- **Monolitico:** Es recomendable para proyectos de bajos requerimientos, donde el bajo coste o la previsión de un equipo pequeño sea lo decisivo. Es decir, que tiene que haber el menor numero de clases y módulos posible, así como que todas las funcionalidades esten en un mismo programa, a ser posible.
	-  Los programas son **fáciles de desarrollar**.
	-   El **despliegue y la ejecución** del software son muy sencillos.
	-   El **costo de desarrollo es bajo** en comparación con otras arquitecturas.
- **Microservicios:** Admite un mayor numero de clases y módulos por lo que se integra mejor con un mayor equipo ya que no todas las funcionalidades depende de grandes paquetes de código, a diferencia del monolitico donde para comprender el código tienes que tener un gran conocimiento de la totalidad.
- **Event-Driven:** Es una arquitectura basada en eventos, o cambios de estado. Cabe distinguir aquí dos conceptos importantes que serían:  La notificación del evento (o mensaje, tipicamente asíncrono) que sería el trigger del evento, y el evento en sí mismo que sería el cambio de estado en una parte del software. Por ejemplo, dos aplicaciones: ventas e inventario, interactuan ante la petición de compra para cambiar el estado de un producto de _"A la venta"_ a _"Vendido"_
	
### Patrones comunes (MVC, MVVM, N-capas, etc.)

- **MVC (Modelo vista controlador):**
![enter image description here](https://developer.mozilla.org/es/docs/Glossary/MVC/model-view-controller-light-blue.png)
<!--stackedit_data:
eyJoaXN0b3J5IjpbMTA3NTAxOTkwMSwtMjAyMDg0NjUxOCwxMT
A4NzUzNTk5LC01ODY2MDkyOTYsLTE4NDEyODUxMTQsLTQ5ODY0
MDc5MiwtNzM0NjA0MzIxLC01NzI2MjAyNDEsNzQ4NTkyODY5LC
0xMjQzODcxNzQzLC0xNTYxMTExOTQ1XX0=
-->