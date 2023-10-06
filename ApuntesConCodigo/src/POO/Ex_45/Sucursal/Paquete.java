package POO.Ex_45.Sucursal;

public class Paquete {

    private final static int numEnvio = (int) (Math.random() * 999999999 + 1);
    private int prioridad;
    private double peso, precio;
    public Paquete(String dniRemitente, double peso, int prioridad) {
        this.peso = peso;
        this.prioridad = prioridad;
    }
    // public Paquete() {
    // this.dniRemitente = dniRemitente;
    // this.peso = peso;
    // this.prioridad = prioridad;
    // }

    public double getCalculaPrecio(Paquete paquete) {
        precio = paquete.getPeso();
        // CONSTRUIR ESTE ATRIBUTO
        if (paquete.getPrioridad() == 1)
            precio += 10;
        if (paquete.getPrioridad() == 2)
            precio += 20;

        return precio;
    }

    public double getPeso() {
        return peso;
    }

    public static int getNumenvio() {
        return numEnvio;
    }

    public void setDniRemitente(String dniRemitente) {
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
}
/*
 * Clase 2: Clase Paquete. Encargada de construir objetos de tipo Paquete con
 * las siguientes características:
 * Propiedades:
 * Referencia del envío
 * Peso
 * DNI del remitente
 * Prioridad del envío. Esta puede ser 0, 1 y 2 (Normal, Alta, Urgente)
 * Constructor:
 * Encargado de establecer las propiedades a los valores elegidos
 * Métodos:
 * 2 setters para modificar (si se quiere) peso y prioridad
 * 2 getters para obtener peso y prioridad.
 */