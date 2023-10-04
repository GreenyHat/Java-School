// package POO.Ex_46.Colegio;

// public class Alumnos {
//     private String nombreAlmuno, nombreColegioC;// relacionar con clase colegio
//     private int idAlumno, numAlumno;
//     private double notaMediaAl;// clase Colegio

//     public Alumnos(String nombreAlumno, String nombreColegioC, double notaMediaAl, int numAlumno) {
//         // this.idAlumno = idAlumno;//se asigna segun el colegio, no deberia pertenecer
//         // a la clase Colegio??
//         this.nombreAlmuno = nombreAlumno;
//         this.nombreColegioC = nombreColegioC;
//         this.notaMediaAl = notaMediaAl;
//         numAlumno = idAlumno;
//         idAlumno++;//Esto seria para que hubiera una consescucion indepedndientemente del colegio en el que este matriculado
//     }

//     public Alumnos(String nombreAlumno, double notaMediaAl) {
//         this.nombreAlmuno = nombreAlumno;
//         this.notaMediaAl = notaMediaAl;

//     }

//     public String getNombreAlmuno() {
//         return nombreAlmuno;
//     }

//     public int getIdAlumno() {
//         return idAlumno;
//     }

//     public int getNumAlumno() {// TRABAJA SOBRE EL NUMERO, NO SALE BIEN EL INDENTIFICADOR.
//         return numAlumno;
//     }

//     public double getNotaMediaAl() {
//         return notaMediaAl;
//     }

//     public String getNombreColegioC() {
//         return nombreColegioC;
//     }

//     public void setNotaMediaAl(double notaMediaAlC) {
//         this.notaMediaAl = notaMediaAlC;
//     }
// }

package POO.Ex_46.Colegio;

public class Alumnos {
    private String nombreAlmuno, nombreColegioC;
    private final int idAlumno; // Hacerlo final para que no pueda ser modificado después de la inicialización
    private static int nextId = 0; // Variable de clase para el siguiente ID disponible
    private double notaMediaAl;

    public Alumnos(String nombreAlumno, String nombreColegioC, double notaMediaAl) {
        this.nombreAlmuno = nombreAlumno;
        this.nombreColegioC = nombreColegioC;
        this.notaMediaAl = notaMediaAl;
        this.idAlumno = nextId; // Asignar el próximo ID disponible a este alumno
        nextId++; // Incrementar el contador de IDs
    }

    // public Alumnos(String nombreAlumno, double notaMediaAl) {
    //     this(nombreAlumno, null, notaMediaAl); // Llamar al otro constructor
    // }

    public String getNombreAlmuno() {
        return nombreAlmuno;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public double getNotaMediaAl() {
        return notaMediaAl;
    }

    public String getNombreColegioC() {
        return nombreColegioC;
    }

    public void setNotaMediaAl(double notaMediaAlC) {
        this.notaMediaAl = notaMediaAlC;
    }
}
