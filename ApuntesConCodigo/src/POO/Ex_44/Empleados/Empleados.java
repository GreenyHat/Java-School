package POO.Ex_44.Empleados;

/*
POSIBLES MEJORAS PARA EL CÓDIGO
 * Jerarquía de Clases (Herencia):

Crear clases hijas para diferentes tipos de empleados, por ejemplo: EmpleadoAdministrativo, EmpleadoTecnico, etc. Estas clases heredarían de la clase Empleados.
Esto permitirá especializar comportamientos y propiedades para diferentes tipos de empleados.

Encapsulamiento:

Mantener todos los campos privados y proporcionar métodos get y set según sea necesario.
Considerar la adición de métodos para otras operaciones que se quieran realizar con el empleado, garantizando así que el estado interno del objeto se mantenga seguro y consistente.
Polimorfismo:

Definir métodos en la clase principal (por ejemplo, obtenerSalario) y sobrescribir estos métodos en las clases hijas según las diferencias en el cálculo del salario entre diferentes tipos de empleados.

Abstracción:

Convertir la clase Empleados en una clase abstracta si consideramos que no tiene sentido instanciar un empleado genérico. Las clases hijas serían las que se instancian.

Composición y Agregación:

Crear una clase Departamento en lugar de usar solo un String para el nombre del departamento. Esto permitirá agregar más detalles y comportamientos a los departamentos.
Agregar una clase Empresa que contenga una lista de empleados, lo que permitiría realizar operaciones como agregar un empleado, eliminar un empleado, listar todos los empleados, etc.
Interfaces y/o clases abstractas:

Crear interfaces como Bonificable que podría tener un método calculaBonificacion, permitiendo implementar diferentes algoritmos de bonificación para diferentes empleados.

Manejo de Excepciones:

Implementar manejo de excepciones para casos como intentar agregar más empleados de lo que la empresa permite o intentar acceder a empleados que no existen.
Métodos adicionales:

Implementar métodos como promocionarEmpleado, cambiarDepartamento, otorgarBonus, entre otros, que podrían ser relevantes en el contexto de una empresa.

Validaciones:

Añadir validaciones en los setters y en el constructor, por ejemplo, para asegurarse de que el nombre del empleado no esté vacío o que un departamento exista antes de asignar un empleado a él.
Añadir interacción:

Se podría agregar un pequeño menú interactivo en una clase principal (Main) que permita al usuario realizar operaciones como agregar empleados, mostrar detalles de empleados, cambiar departamentos, entre otros.
 */

public class Empleados {
    final String nombre; // El nombre no se puede modificar durante la ejecucion del programa, de hecho
                         // no se permite setter
    private String departamento;
    private static int idSiguiente = 1;
    private int id;
    private static final int empresa = 50;

    /*
     * Por que hemos hecho lo del static y el final? Tengamos en cuenta lo siguiente
     * para distinguir ambos conceptos.
     * Las variables static son variables de clase, pertenecen a la clase y no
     * pueden ser parametros de instancia, por otro lado
     * las final son constantes que se mantienen con el misma valor asignado, en
     * este caso al objeto de la clase Empleados
     * Luego la lógia seguida para los ids, es mantener el incremento según el orden
     * de secuencia del codigo segun el cual
     * una vez asignada la id, al comenzar: 1 (pues asi se describe en el
     * constructotr de objetos) se incrementará tras su uso, por lo que
     * el siguiente objeto será 2 y así sucesivamente
     */

    public Empleados(String nombre) {
        this.nombre = nombre;
        departamento = "Formación";
        id = idSiguiente;
        idSiguiente++;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDatosEmpleado() {
        if (id <= empresa) {
            return "El empleado " + nombre + " con numero de empleado: " + id + ". Trabaja en el departamento de: "
                    + departamento;
        } else {
            return "No tenemos capacidad para más empleados...";
        }

    }

}
