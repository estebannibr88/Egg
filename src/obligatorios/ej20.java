/*
 * @author NeuenMartinez
 */
package obligatorios;

import java.util.Scanner;

public class ej20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        String aux = "";
        System.out.println("INGRESAR LOS DATOS DE LA MATRIZ");
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                matriz1[j] = leer.nextInt();
            }
        }
        System.out.println("LA MATRIZ ES:");
        for (int[] fila : matriz) {
            aux = "";
            for (int elemento : fila) {
                aux += "  " + elemento;
            }
            System.out.println(aux);
        }
    }

}