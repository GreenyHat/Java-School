package POO.Ex_45.Sucursal;

import java.util.Scanner;

public class MainUsoPaquetesSucursal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nSucursal, nPaquetesAEnviar, prioridad;
        String dni, ciudad, direccion;
        double peso;

        System.out.print("Introduce el numero de sucursal: ");
        nSucursal = sc.nextInt();
        System.out.print("Introduce tu DNI: ");
        dni = sc.nextLine();
        System.out.print("Facilita tu direccion: ");
        System.out.print("\nCiudad: ");
        ciudad = sc.nextLine();
        System.out.print("Dirección: ");
        direccion = sc.nextLine();

        Sucursal su1 = new Sucursal(ciudad, nSucursal, direccion);

        System.out.print("Cuantos paquetes vas a enviar? ");
        nPaquetesAEnviar = sc.nextInt();
        Paquete[] paquetes = new Paquete[nPaquetesAEnviar];
        for (int i = 0; i < nPaquetesAEnviar; i++) {
            System.out.println("Datos del paquete nº " + (i + 1));
            System.out.print("Referencia: " + Paquete.getNumenvio());
            System.out.print("\nDNI del remitente: ");
            dni = sc.next();
            System.out.print("Peso del paquete: ");
            peso = sc.nextDouble();
            System.out.print("Cual es la prioridad del envio? ");
            prioridad = sc.nextInt();
            paquetes[i] = new Paquete(dni, peso, prioridad);
        }sc.close();

        System.out.println("\nDatos de la sucursal:");
        System.out.print("Numero de sucursal: " + su1.getNumeroSucursal() + "\nDireccion: " + su1.getDireccion()
                + "\nCiudad: " + su1.getCiudad());
        System.out.println("\nDatos de cada paquete: ");
        for (int i = 0; i < nPaquetesAEnviar; i++) {
            System.out.print("\nPaquete nº " + (i + 1) + "\nPrecio: " + paquetes[i].getCalculaPrecio(paquetes[i])
                    + "\nReferencia: " + Paquete.getNumenvio() + "\nPrioridad: " + paquetes[i].getPrioridad());
        }

    }

}
/*
 * Clase 3: Clase Uso_Sucursal_y_Paquetes.(MAIN(s)) Esta es la clase principal.
 * Desde esta clase se piden los datos del programa por teclado. Se deben pedir:
 * Nº de sucursal
 * Dirección
 * Ciudad
 * Nº de paquetes a enviar
 * Datos de cada uno de los paquetes a enviar, concretamente se ha de pedir por
 * cada paquete:
 * Referencia del envío
 * DNI del remitente
 * Peso del paquete
 * Prioridad del envío (0, 1 o 2)
 * Una vez introducidos los datos de la sucursal y de cada uno de los paquetes,
 * el programa imprimirá en consola los datos de la sucursal (Nº, Dirección y
 * Ciudad) y los datos de cada paquete (Referencia, Peso, Prioridad y Precio)
 */
