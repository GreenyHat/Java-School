package Aj.Ex_Factorial;

import java.util.Scanner;

public class GetFactorial {

    public static void main(String[] args) {
        float num = 0;
        float resultado = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un numero para factorizar: ");
        num = sc.nextInt();
        sc.close();

        for (int i = 1; i < num; resultado *= i) {
            i++;

        }

        System.out.println("Resultado: " + resultado);
    }
}
