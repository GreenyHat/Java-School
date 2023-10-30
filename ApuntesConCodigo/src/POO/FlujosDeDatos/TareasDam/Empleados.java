package POO.FlujosDeDatos.TareasDam;

public class Empleados {
    private int codigo;
    private String nombre, direccion;
    private float comision, salario;

    public Empleados(int codigo, String nombre, String direccion, float comision, float salario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.comision = comision;
        this.salario = salario;
    }

    ///////////// GETTERS//////////////////
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public float getComision() {
        return comision;
    }

    public float getSalario() {
        return salario;
    }

    /////////////// SETTERS///////////////

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }

    public void setSalario(float salariol) {
        this.salario = salariol;
    }

}
