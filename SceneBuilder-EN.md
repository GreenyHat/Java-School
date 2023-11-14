## JavaFX Tutorial (Spanish)
### Part 1: Scene Builder

#### Contents in Part 1
- Getting Familiar with JavaFX
- Creating and Starting a JavaFX Project
- Using Scene Builder to Design the User Interface
- Basic Structure of an Application Using the Model-View-Controller (MVC) Pattern

#### Prerequisites
- Latest version of Java JDK 8 (includes JavaFX 8).
- Eclipse 4.3 or higher with the e(fx)clipse plugin. The easiest way to obtain it is to download the preconfigured distribution from the [e(fx)clipse website](https://efxclipse.bestsolution.at/install.html#all-in-one). Alternatively, you can use an update site for your Eclipse installation.
- Scene Builder 2.0 or higher

#### Eclipse Configuration
- Open Eclipse Preferences (Window | Preferences) and navigate to Java | Installed JREs.
- If you don't have jre1.8 in the list of JREs, then click Add..., select Standard VM, and choose the JDK 8 installation directory (JRE Home directory).
- Remove other JREs or JDKs so that JDK 8 becomes the default option.
- Navigate to Java | Compiler. Set the compiler compliance level to 1.8.
- Go to Java | JavaFX. Specify the path to the Scene Builder executable.

#### Useful Links
- [Java 8 API](https://docs.oracle.com/javase/8/docs/api/) - Documentation (JavaDoc) of standard Java classes
- [JavaFX 8 API](https://docs.oracle.com/javase/8/javafx/api/) - Documentation of JavaFX classes
- [Oracle’s JavaFX Tutorials](https://docs.oracle.com/javase/8/javafx/get-started-tutorial/get_start_apps.htm) - Official Oracle tutorials on JavaFX

Now, let's get started!

#### Create a New JavaFX Project
- In Eclipse (with e(fx)clipse installed), go to File | New | Other… and select JavaFX Project. Specify the project name (e.g., AddressApp) and click Finish.
- Delete the application package and its content if it was automatically created.

#### Create Packages
- From the beginning, we'll follow good software design principles. Some of these principles translate to using the architecture known as the Model-View-Controller (MVC). This architecture promotes the division of our code into three clearly defined parts, one for each element of the architecture. In Java, this separation is achieved by creating three separate packages.
- Right-click the src folder, then select New | Package:
  - ch.makery.address - will contain most of the control classes (C)
  - ch.makery.address.model - will contain model classes (M)
  - ch.makery.address.view - will contain views (V)
  - Note: Our package dedicated to views will also contain some controllers dedicated exclusively to a view. We will call them view controllers.

#### Create the FXML Design File
- There are two ways to create the user interface: by programming it in Java or by using an XML file. You can find information on both methods on the internet. Here, we will use XML (a file with the .fxml extension) for most of it. I find it clearer to keep the controller and view separate. Additionally, we can use the visual editing tool
