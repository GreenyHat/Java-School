package POO.Ex_46.Colegio.ResolucionPildoras;

public class Alumnos {
    private String nombreAlumno;
    private Colegio nombreColegio;
    private double notaMedia;
    private int numAlumno = 1;
    private int nAlumno;

    public Alumnos(Colegio nombreColegio, String nombreAlumno, double notaMedia) {
        this.nombreAlumno = nombreAlumno;
        this.nombreColegio = nombreColegio;
        this.notaMedia = notaMedia;
        nAlumno = numAlumno;
        numAlumno++;

    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public Colegio getNombreColegioAlumno() {
        return this.nombreColegio.getNombreColegio();
    }

    public String toString() {
        return "Nombre alumno: " + nombreAlumno + "\nColegio: "
                + nombreColegio + "\nNota Media: " + notaMedia;
    }
}
