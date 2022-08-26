/*
 * @author NeuenMartinez
 */
package obligatorios;

import java.util.Scanner;

public class ej18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        System.out.println("LA MATRIZ ES:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print(" [" + matriz[i][j] + "]"); 
            }
            System.out.println("");
        }
        System.out.println("LA MATRIZ TRASPUESTA ES:");
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(" [" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

    }
}
