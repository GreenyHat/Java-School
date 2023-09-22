package POO.Ex_43.Vehiculos;

public class UsoVehiculos {

    public static void main(String[] args) {

        Vehiculos coche1 = new Vehiculos(4);
        Vehiculos moto1 = new Vehiculos(2);

        coche1.setColor("azul");
        coche1.setPeso(300.58f);
        coche1.setPuertas(5);
        coche1.setExtra(true, true);
        System.out.println(coche1.getDatosVehiculo() + "\n");

        moto1.setColor("negro");
        moto1.setPeso(300.67f);
        moto1.setPuertas(0);
        moto1.setRuedas(3);
        System.out.println(moto1.getDatosVehiculo());

    }

}
