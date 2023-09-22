package POO.Ex_43.Vehiculos;

public class Vehiculos {

    private int ruedas, puertas;
    private float peso;
    private String color;
    private boolean climatizador, gps, lucesNeon;

    public Vehiculos(int ruedas) {// constructor de la clase

        this.ruedas = ruedas;
        color = "sin color";
        peso = 0.0f;
    }

    public Vehiculos(int ruedas, int puertas, float peso, String color) {
        this.ruedas = ruedas;
        this.peso = peso;
        this.puertas = puertas;
        color = "sin color";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public void setExtra(boolean climatizador) {
        this.climatizador = climatizador;
    }

    public void setExtra(boolean climatizador, boolean gps) {
        this.climatizador = climatizador;
        this.gps = gps;
    }

    public void setExtra(boolean climatizador, boolean gps, boolean lucesNeon) {// sobrecarga de metodos
        this.climatizador = climatizador;
        this.gps = gps;
        this.lucesNeon = lucesNeon;
    }

    public String getExtra() {
        if (climatizador && !gps && !lucesNeon)
            return " El vehículo incluye el pack 1 de extras";
        else if (climatizador && gps && !lucesNeon)
            return " El vehículo incluye el pack 2 de extras";
        else if (climatizador && gps && lucesNeon)
            return " El vehículo incluye el pack 3 de extras";
        else
            return " El vehículo no tiene extras";
    }

    // Es redundante tener aqui los getters?
    // Quizas en algun contexto querrias para algo algun dato suelto, en este caso
    // no!!
    // public String getColor() {
    // return color;
    // }

    // public float getPeso() {
    // return peso;
    // }

    // public int getPuertas() {
    // return puertas;
    // }

    // public int getRuedas() {
    // return ruedas;
    // }

    public String getDatosVehiculo() {
        return "El vehículo es de color " + color + ", pesa " + peso +
                " kg, tiene " + puertas + " puertas " + "y " + ruedas + " ruedas." + getExtra();

    }

}
