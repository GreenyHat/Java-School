package POO.Ex_46.Colegio;

public class Colegio {
    private String nombreColegio;
    private int numeroAlumnos;
    private String nombreAlumno;
    private int idAlum;
    Alumnos[] al = new Alumnos[numeroAlumnos];// Al ser un colegio necesitamos un array que almacene objetos de tipo//
                                              // Alumno

    public Colegio(String nombreColegio, int numeroAlumnos) {

        this.nombreColegio = nombreColegio;
        this.numeroAlumnos = numeroAlumnos;
        this.al = new Alumnos[numeroAlumnos];
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public String getNombreColegio() {
        return nombreColegio;
    }

    public int getNumeroAlumnos() {
        return numeroAlumnos;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    private int alumnosAgregados = 0;// si lo hago static?

    public void nuevoAlumno(String nombreAlumno, double notaMediaAl) {
        if (alumnosAgregados < numeroAlumnos) {
            al[alumnosAgregados] = new Alumnos(nombreAlumno, nombreColegio, notaMediaAl); // Asume que Alumnos
                                                                                          // tiene un
                                                                                          // constructor
                                                                                          // adecuado
            alumnosAgregados++;
        } else {
            System.out.println("No se puede agregar más alumnos a este colegio.");
        }
    }

    private static int counter;// Lo pongo estatico para que pertenezca a la clase y no al metodo, asi se suma
                               // con todas las iteraciones independientemente del colegio

    public void getTodosAlumnos() {// Esta seria la forma correcta? o seria mejor pedir un objeto Alumnos?
        for (int i = 0; i < alumnosAgregados; i++) {

            System.out.println("|-----------------------------------|" + "\nFicha del alumno:" + "\nNombre del alumno: "
                    + al[i].getNombreAlmuno() + "\nIdentificador relativo: " + idAlum + "\nIdentificador absoluto: "
                    + counter
                    + "\nNombre del centro: " + al[i].getNombreColegioC() + "\nNota media " + al[i].getNotaMediaAl());
            idAlum++;
            counter++;
        }

    }

    public void getDatosAlumno(int idAlum) {

        System.out.println("\nEste es el nombre del alumno: " + al[idAlum].getNombreAlmuno());

    }

    public Alumnos getAlumno(int idAlum) {
        return al[idAlum];
    }

    public void setExpulsaAlumno(String nombreAlumno, int idAlum) {
        for (int i = 0; i < al.length; i++) {

        }
    }
}
