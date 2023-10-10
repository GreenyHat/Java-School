package POO.Ex_46.Colegio.ResolucionPildoras;

/*
 * Preguntas:
 * Valor de instancia y valor de clase?
 * Conflicto con los booleanos en el primer if del +void expulsarAlumnos()
 */
public class Colegio {
    private String nombre;
    private Alumnos[] arrayAlumnos;
    private int posArray = 0;

    public Colegio(String nombreColegio, int numAlumnos) {
        this.nombre = nombreColegio;
        arrayAlumnos = new Alumnos[numAlumnos];
        /*
         * En el constructor estamos preparando al objeto colegio, el cual tendra
         * un nombre, del colegio y un numero de alumnos que representaria la capacidad
         * del colegio
         * Dentro asignamos el valor de clase al valor del parametro
         */
    }

    public String getNombreColegio() {
        return nombre;
    }

    private Alumnos getAlumno(int nAlumno) {
        return arrayAlumnos[nAlumno];
    } // Por que es privada?
    /*
     * Aqui construimos un metodo de tipo Alumnos para que nos devuelva el alumno
     * CONCRETO que estemos buscando mediante el indice nAlumno (el cual devuelve el
     * alumno que le pasemos segun la posicion en la que se encuentre en el array)
     */

    public void nuevoAlumno(String nombreAlumno, double notaAlumno) {
        Alumnos nuevoAlumno = new Alumnos(this, nombreAlumno, notaAlumno);// Donde se usa?
        arrayAlumnos[posArray] = nuevoAlumno;
        posArray++;

        /*
         * Este metodo nos sirve para crear un nuevo objeto alumno, el metodo nos pide
         * dos parametros
         * el nombre y la nota, el colegio se le asigna con la iteracion del objeto
         * Alumnos el cual recibe 3 parametros
         * el this lo usamos para relacionarlo con el valor de clase del objeto Colegio
         * instanciado en este clase (this.nombre = nombre)
         */

    }

    public void expulsarAlumno(String nombreAlumno) {
        for (int i = 0; i < arrayAlumnos.length; i++) {
            if (this.getAlumno(i) != null) {
                if (arrayAlumnos[i].getNombreAlumno().equals(nombreAlumno)) {
                    arrayAlumnos[i] = null;

                    /*
                     * Aqui estamos diciendo que si un alumno concreto, usando el nAlumno definido
                     * antes, existe, es decir si la posicion es valida:
                     * pasamos al siguiente condicional el cual obtiene el nombre del alumno de la
                     * posicion del array iterada con .equals() entonces lo convertimos a null y lo
                     * eliminamos del array
                     */
                }

            }
        }
    }

    public void setNotaMedia(String nombreAlumno, double nuevaNotaMedia) {
        for (int i = 0; i < arrayAlumnos.length; i++) {
            if (this.getAlumno(i) != null) {
                if (arrayAlumnos[i].getNombreAlumno().equals(nombreAlumno)) {
                    arrayAlumnos[i].setNotaMedia(nuevaNotaMedia);
                }
            }
        }
    }

    public void getTodosAlumnos() {
        for (int i = 0; i < arrayAlumnos.length; i++) {
            if (this.getAlumno(i) != null) {
                System.out.println(this.getAlumno(i));
                System.out.println();
            }
        }
    }

    public void getDatosAlumno(String nombreAlumno) {
        for (int i = 0; i < arrayAlumnos.length; i++) {//// ENTIENDE bien el funcionamiento de este FOR
            if (this.getAlumno(i) != null) {
                if (arrayAlumnos[i].getNombreAlumno().equals(nombreAlumno)) {
                    System.out.println(this.getAlumno(i));
                }
            }
        }

    }

}
