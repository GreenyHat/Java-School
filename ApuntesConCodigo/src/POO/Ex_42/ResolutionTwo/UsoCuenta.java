package POO.Ex_42.ResolutionTwo;

public class UsoCuenta {
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente("Manolo", 5000);
        CuentaCorriente cuenta2 = new CuentaCorriente("Camila", 7000);

        System.out.println("Hola, Manolo!!");
        CuentaCorriente.movimientoDinero(cuenta1, cuenta2, 200);

        System.out.println("\nEl resultado de las cuentas sería el siguiente:");
        System.out.print("Cuenta número 1: \n" + cuenta1.getNombreTitular() + "\nNúmero de cuenta: "
                + cuenta1.getNumeroCuenta() + "\nSaldo restante: \n" + cuenta1.getSaldo() + "\n");
        System.out.print("Cuenta número 2: \n" + cuenta2.getNombreTitular() + "\nNúmero de cuenta: "
                + cuenta2.getNumeroCuenta() + "\nSaldo restante:" + cuenta2.getSaldo());
    }
}
