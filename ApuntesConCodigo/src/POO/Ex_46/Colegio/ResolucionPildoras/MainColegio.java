package POO.Ex_46.Colegio.ResolucionPildoras;

public class MainColegio {
     public static void main(String[] args) {
        Colegio cole0 = new Colegio("La Salle", 50);
        Colegio cole1 = new Colegio("El Milagro", 20);
        Colegio cole2 = new Colegio("La Jesutina", 30);

        cole0.nuevoAlumno("Juan", 1.2);
        cole1.nuevoAlumno("Jose", 4);
        cole0.nuevoAlumno("Jose Miguel", 9);
        cole2.nuevoAlumno("Javier", 9.7);

        cole0.getTodosAlumnos();
    }
}
