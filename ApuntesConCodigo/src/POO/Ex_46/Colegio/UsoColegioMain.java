package POO.Ex_46.Colegio;

public class UsoColegioMain {
    public static void main(String[] args) {
        
        Colegio milagro = new Colegio("Milagro", 10);
        Colegio laSalle = new Colegio("La Salle", 20);

        milagro.nuevoAlumno("Jesus", 5.8);
        milagro.nuevoAlumno("Raquel", 1.3);
        milagro.nuevoAlumno("Segismundo", 10);
        milagro.nuevoAlumno("Omar", 0.8);
        milagro.nuevoAlumno("Toni", 9.8);
        laSalle.nuevoAlumno("Julia", 9.73);
        laSalle.nuevoAlumno("Solomon", 10);
        laSalle.nuevoAlumno("Jaime", 3.27);

        milagro.getTodosAlumnos();
        laSalle.getTodosAlumnos();
        milagro.getDatosAlumno(0);        // milagro.getDatosAlumno("Jesus");
    }
}
