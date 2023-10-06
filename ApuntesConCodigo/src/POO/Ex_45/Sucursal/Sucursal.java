package POO.Ex_45.Sucursal;

public class Sucursal {
    private int numeroSucursal;
    private String direccion, ciudad;

    public Sucursal(String ciudad, int numeroSucursal, String direccion) {

        this.ciudad = ciudad;
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
    }
    // public Sucursal() {

    //     this.ciudad = ciudad;
    //     this.numeroSucursal = numeroSucursal;
    //     this.direccion = direccion;
    // }

    // 0=normal, 1=Alta y 2=Urgente). Prioridad 0 el precio
    // no se altera. Prioridad 1 el precio se incremente 10 €. Prioridad 2 el precio
    // se incrementa 20 €.


    public void setNumeroSucursal(int numeroSucursal) {
        this.numeroSucursal = numeroSucursal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }
}
