package POO.SudokuSolver;

import java.util.Scanner;

public class SudBoard {
    /////////////RELLENAR TABLERO////////////////////
    public static void main(String[] args) {
        int[][] board = new int[9][9];
        Scanner sc = new Scanner(System.in);
        System.out.println("Empiece a escribir números de inzquierda a derecha:");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print("Fila número " + (i + 1) + " y columna " + (j + 1) + ": ");
                board[i][j] = sc.nextInt();
            }
        }
        sc.close();


        /////////////TO DO (corto) ////////////////
        /** */



        /////////////TO DO (largo) ////////////////
        /**
         * Encerrar todo en métodos para mejor estructura
         * Metodo para rellenar las casillas vacias 
         * Logica para la resolucion 
         */

    }
}
