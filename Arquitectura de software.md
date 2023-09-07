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


## Relación con acceso a datos:

La asignatura "acceso a datos" en el módulo de Desarrollo de Aplicaciones Multiplataforma (DAM) puede ser altamente complementaria en el camino de aprendizaje sobre arquitectura de software. Veamos por qué:

1.  **Interacción con Bases de Datos**: La arquitectura de software no solo se trata de diseñar sistemas desde un punto de vista teórico. En la práctica, comprender cómo las aplicaciones interactúan con las bases de datos es esencial. Esto incluye aspectos como la conexión, la consulta y la manipulación de datos, y la gestión de transacciones.
2.  **Integración de Tecnologías**: Como mencionaste, en la asignatura se aborda cómo convergen lenguajes como Java y XML. En la arquitectura de software, a menudo tendrás que diseñar sistemas que integren múltiples tecnologías. Comprender cómo diferentes tecnologías pueden trabajar juntas es un aspecto crucial de la labor de un arquitecto.
3.  **Abstracción y Capas**: En el acceso a datos, se introduce a menudo el concepto de capas, especialmente la capa de datos o capa de persistencia. Entender cómo se pueden separar las responsabilidades en diferentes capas es fundamental en arquitectura, ya que permite crear sistemas modulares y mantenibles.
4.  **Patrones de Diseño**: En el contexto del acceso a datos, es probable que te encuentres con patrones como el DAO (Data Access Object) o el Repository. Estos patrones son ejemplos concretos de cómo se pueden aplicar principios arquitectónicos para resolver problemas específicos en el mundo real.
5.  **Rendimiento y Optimización**: Acceder a datos de manera eficiente puede ser un desafío. Las decisiones arquitectónicas que tomes pueden tener un impacto significativo en el rendimiento de un sistema. Por lo tanto, aprender sobre indexación, consultas optimizadas y caché, por ejemplo, te proporcionará herramientas valiosas cuando diseñes arquitecturas.
6.  **Seguridad**: Cuando se trata de acceso a datos, la seguridad es primordial. Es esencial comprender cómo proteger los datos, cómo gestionar los accesos y cómo garantizar la integridad de la información. Estos conceptos también son vitales desde una perspectiva arquitectónica.

En resumen, mientras aprendes sobre acceso a datos, estarás adquiriendo habilidades y conocimientos que son directamente relevantes y aplicables a la arquitectura de software. Te recomiendo que aproveches al máximo esa asignatura y busques siempre cómo se relaciona lo que aprendes con los principios y prácticas arquitectónicas más amplias.



## 2. Estilos y Patrones de Arquitectura:

![Monolitico vs Microservicios](https://www.ilimit.com/wp-content/uploads/2020/09/Monolith-vs-Microservices.png)

-   Estilos arquitectónicos (Monolítico, Microservicios, Event-Driven, etc.)
-   Patrones comunes (MVC, MVVM, N-capas, etc.)

<!--stackedit_data:
eyJoaXN0b3J5IjpbMTYzNTkwNzgwNyw3NDg1OTI4NjksLTEyND
M4NzE3NDMsLTE1NjExMTE5NDVdfQ==
-->