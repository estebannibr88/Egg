/*
 * @author NeuenMartinez
 */
package obligatorios;

import java.util.Scanner;

public class ej19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESAR EL TAMAÑO DE LA MATRIZ");
        boolean aux = false;
        boolean aux2 = false;
        int n = leer.nextInt();
        int[][] matriz = new int[n][n];
        int[][] matrizTraspuesta = new int[n][n];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
        System.out.println("LA MATRIZ ES:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(" [" + matriz[i][j] + "]");
            }
            System.out.println("");

        }
        System.out.println("");
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                matrizTraspuesta[i][j] = matriz[i][j];
                System.out.print(" [" + matrizTraspuesta[i][j] + "]");
            }
            System.out.println("");
        }
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                if (matrizTraspuesta[i][j] == -1 * (matriz[i][j])) {
                    aux = true;
                } else {
                    aux = false;
                }
            }
        }
        if (aux == true) {
            System.out.println("LA MATRIZ DADA ES ANTISIMETRICA");
        } else {
            System.out.println("LA MATRIZ DADA NO ES ANTISIMETRICA");
        }

    }
}
