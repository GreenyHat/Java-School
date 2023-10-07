package POO.Ex_46.Colegio.ResolucionPildoras;

public class Colegio {
    private String nombre;
    private Alumnos[] arrayAlumnos;
    private int posArray = 0;

    public Colegio(String nombre, int numAlumno) {
        this.nombre = nombre;
        arrayAlumnos = new Alumnos[numAlumno];
        /*
         * En el constructor estamos preparando al objeto colegio, el cual tendra
         * un nombre, del nolegio en sí y un num
         */
    }

    public String getNombreColegio(){
        return nombre;
    }

    private Alumnos getAlumno(int nAlumno) {
        return arrayAlumnos[nAlumno];
    }// Por que es privada?

    public void nuevoAlumno(String nombreAlumno, double notaAlumno) {
        Alumnos nuevoAlumno = new Alumnos(this, nombreAlumno, notaAlumno);
        posArray++;
    }

    public void expulsarAlumno(String nombreAlumno){
        for (int i = 0; i < arrayAlumnos.length; i++) {
            if (this.getAlumno(i)!=null) {//si existe!
                if (arrayAlumnos[i].getNombreAlumno().equals(nombreAlumno)) {
                    arrayAlumnos[i] = null;

                    /*
                     * Aqui estamos diciendo que si 
                     */
                }

                
            }
        }
    }

}
