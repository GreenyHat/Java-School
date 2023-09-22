package POO.Ex_42.ResolutionTwo;

public class CuentaCorriente {
    private double saldo;
    private String nombreTitular;
    public long numeroCuenta = (long) (Math.random() * 999999999 + 1);

    public CuentaCorriente(String nombreTitular, double saldo) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public static void movimientoDinero(CuentaCorriente cuenta1, CuentaCorriente cuenta2, int cantidad) {

        if (cantidad > 0) {
            cuenta1.saldo -= cantidad;
            cuenta2.saldo += cantidad;
        } else {
            System.out.println("No se admiten ingresos negativos");
        }

    }
}
