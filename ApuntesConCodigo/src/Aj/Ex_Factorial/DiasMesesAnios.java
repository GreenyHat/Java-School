package Aj.Ex_Factorial;

import java.util.Scanner;

public class DiasMesesAnios {

    public static void main(String[] args) {
        int dia1, mes1, año1, dia2, mes2, año2, diasPasados;
        boolean bisiesto = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Primera fecha:");
        System.out.print("dia ");
        dia1 = sc.nextInt();
        System.out.print("mes ");
        mes1 = sc.nextInt();
        System.out.print("año ");
        año1 = sc.nextInt();

        System.out.println("\nSegunda fecha:");
        System.out.print("dia ");
        dia2 = sc.nextInt();
        System.out.print("mes ");
        mes2 = sc.nextInt();
        System.out.print("año ");
        año2 = sc.nextInt();
        sc.close();

        if ((año1 % 4 == 0 && año1 % 100 != 0) || año1 % 400 == 0) {
            bisiesto = true;
        }

        if ((año2 % 4 == 0 && año2 % 100 != 0) || año2 % 400 == 0) {
            bisiesto = true;
        }

        int diasFecha1 = dia1;
        int diasFecha2 = dia2;

        for (int i = 1; i < mes1; i++) {//for para calcular los dias en meses. Funciona asi:
                                        /*
                                         * Empieza en 1, enero, si la fecha es enero se almacenacy luego se 
                                         * multiplica por el año cuando corresponda, si es mayor a 1 es decir
                                         * otra fecha se va iterando y almacenando las sumas +30+28+31(lo que corrsponda segun mes1) 
                                         * y luego se multiplica por el año todo el resultado
                                         */

    
            switch (i) {
                case 2:
                    diasFecha1 += bisiesto ? 29 : 28;// operador ternario (si true 29 si false 28)
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    diasFecha1 += 30;
                    break;
                default:
                    diasFecha1 += 31;
            }
        }

        for (int i = 1; i < mes2; i++) {
            switch (i) {
                case 2:
                    diasFecha2 += bisiesto ? 29 : 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    diasFecha2 += 30;
                    break;
                default:
                    diasFecha2 += 31;
            }
        }

        
        diasFecha1 += (año1 - 1) * 365; //+ ((año1 - 1) / 4 - (año1 - 1) / 100 + (año1 - 1) / 400);NO ENTIENDO LA PROPUESTA DE CGPT PARA LOS BISIESTOS
        diasFecha2 += (año2 - 1) * 365; //+ ((año2 - 1) / 4 - (año2 - 1) / 100 + (año2 - 1) / 400);

        if (diasFecha2 > diasFecha1) {
            diasPasados = diasFecha2 - diasFecha1;
        } else {
            diasPasados = diasFecha1 - diasFecha2;
        }

        System.out.println("Días transcurridos entre las fechas: " + diasPasados);
        //****afecta que solo haya un bisiesto?? Deberia haber un bisiesto1 y 2??
    }
}
