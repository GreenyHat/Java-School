package POO.Ex_44.Empleados;

public class UsoEmpleados {

    public static void main(String[] args) {
        Empleados empleado1 = new Empleados("Jose");
        Empleados empleado2 = new Empleados("Mario");
        Empleados empleadoNuevo = new Empleados("Maria");

        empleado1.setDepartamento("Etica");
        System.out.println(empleado1.getDatosEmpleado());
        empleado2.setDepartamento("Contabilidad");
        System.out.println(empleado2.getDatosEmpleado());
        System.out.println(empleadoNuevo.getDatosEmpleado());
    }
}
