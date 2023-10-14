# Code.Makery - Aprendiendo a programar

[Subscribe to Updates](link_to_subscription)

## Inicio
- [Biblioteca](#library)
- [Rutas](#paths)
- [Blog](#blog)
- [Acerca de](#about)

## Artículos en esta serie
- [Introducción](#introduccion)
- [Parte 1: Scene Builder](#parte-1-scene-builder)
- [Parte 2: Modelo y TableView](#parte-2-modelo-y-tableview)
- [Parte 3: Interacción con el usuario](#parte-3-interaccion-con-el-usuario)
- [Parte 4: Hojas de estilo CSS](#parte-4-hojas-de-estilo-css)
- [Parte 5: Persistencia de datos con XML](#parte-5-persistencia-de-datos-con-xml)
- [Parte 6: Gráficos estadísticas](#parte-6-graficos-estadisticas)
- [Parte 7: Despliegue](#parte-7-despliegue)

## Tutorial JavaFX (Español)
### Parte 1: Scene Builder

#### Contenidos en Parte 1
- Familiarizándose con JavaFX
- Crear y empezar un proyecto JavaFX
- Uso de Scene builder para diseñar la interfaz de usuario
- Estructura básica de una aplicación mediante el patrón Modelo Vista Controlador (MVC)

#### Prerequisitos
- Última versión de Java JDK 8 (incluye JavaFX 8).
- Eclipse 4.3 o superior con el plugin e(fx)clipse. La forma más sencilla de obtenerlo es descargarse la distribución preconfigurada desde [e(fx)clipse website](https://efxclipse.bestsolution.at/install.html#all-in-one). Como alternativa, puedes usar un sitio de actualización para tu instalación de Eclipse.
- Scene Builder 2.0 o superior

#### Configuración de Eclipse
- Abre las Preferencias de Eclipse (menú Window | Preferences) y navega hasta Java | Installed JREs.
- Si no tienes el jre1.8 en la lista de JREs, entonces pulsa Add…, selecciona Standard VM y elige el Directorio de instalación (JRE Home directory) de tu JDK 8.
- Elimina otros JREs o JDKs de tal manera que JDK 8 se convierta en la opción por defecto.
- Navega a Java | Compiler. Establece el nivel de cumplimiento del compilador en 1.8.
- Navega hasta Java | JavaFX. Especifica la ruta al ejecutable del Scene Builder.

#### Enlaces útiles
- [Java 8 API](https://docs.oracle.com/javase/8/docs/api/) - Documentación (JavaDoc) de las clases estándar de Java
- [JavaFX 8 API](https://docs.oracle.com/javase/8/javafx/api/) - Documentación de las clases JavaFX
- [Oracle’s JavaFX Tutorials](https://docs.oracle.com/javase/8/javafx/get-started-tutorial/get_start_apps.htm) - Tutoriales oficiales de Oracle sobre JavaFX

¡Y ahora, manos a la obra!

#### Crea un nuevo proyecto JavaFX
- En Eclipse (con e(fx)clipse instalado) ve a File | New | Other… y elige JavaFX Project. Especifica el nombre del proyecto (ej. AddressApp) y aprieta Finish.
- Borra el paquete application y su contenido si ha sido automáticamente creado.

#### Crea los paquetes
- Desde el principio vamos a seguir buenos principios de diseño de software. Algunos de estos principios se traducen en el uso de la arquitectura denominada Modelo-Vista-Controlador (MVC). Esta arquitectura promueve la división de nuestro código en tres apartados claramente definidos, uno por cada elemento de la arquitectura. En Java esta separación se logra mediante la creación de tres paquetes separados.
- En el ratón hacemos clic derecho en la carpeta src, New | Package:
  - ch.makery.address - contendrá la mayoría de clases de control (C)
  - ch.makery.address.model - contendrá las clases del modelo (M)
  - ch.makery.address.view - contendrá las vistas (V)
  - Nota: Nuestro paquete dedicado a las vistas contendrá también algunos controladores dedicados exclusivamente a una vista. Les llamaremos controladores-vista.

#### Crea el archivo FXML de diseño
- Hay dos formas de crear la interfaz de usuario. Programándolo en Java o mediante un archivo XML. Si buscas en Internet encontrarás información relativa a ambos métodos. Aquí usaremos XML (archivo con la extensión .fxml) para casi todo. Encuentro más claro mantener el controlador y la vista separados entre sí. Además, podemos usar la herramienta de edición visual Scene Builder, la cual nos evita tener que trabajar directamente con el XML.
- Haz clic derecho el paquete view y crea un nuevo archivo FXML (New | Other | FXML | New FXML Document) llamado PersonOverview.

#### Diseño mediante Scene Builder
**Nota:** Si no puedes hacerlo funcionar, descarga las fuentes para esta parte del tutorial e inténtalo con el archivo fxml incluido.
- Haz clic derecho sobre PersonOverview.fxml y elige Open with Scene Builder. Ahora deberías ver el Scene Builder con un AnchorPane (visible en la jerarquía de componentes (herramienta Hierarchy) situada a la izquierda).
- Selecciona el AnchorPane en tu jerarquía y ajusta el tamaño en el apartado Layout (a la derecha).
- Añade un SplitPane (Horizontal Flow) arrastrándolo desde la librería (Library) al área principal de edición. Haz clic derecho sobre el SplitPane en la jerarquía y elige Fit to Parent.
- Arrastra un TableView (bajo Controls) al lado izquierdo
