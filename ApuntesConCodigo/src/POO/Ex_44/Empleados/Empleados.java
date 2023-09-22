package POO.Ex_44.Empleados;

public class Empleados {
    final String nombre; // El nombre no se puede modificar durante la ejecucion del programa, de hecho
                         // no se permite setter
    private String departamento;
    private static int idSiguiente = 1;
    private int id;

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
        return "El empleado " + nombre + " con numero de empleado: " + id + ". Trabaja en el departamento de: "
                + departamento;
    }

}
