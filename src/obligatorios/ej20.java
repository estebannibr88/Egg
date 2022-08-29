/*
 * @author NeuenMartinez
 */
package obligatorios;

import java.util.Scanner;

public class ej20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int aux;
        int suma = 0;
        int suma1 = 0;
        boolean comprobacion = true;
        System.out.println("INGRESAR LOS DATOS DE LA MATRIZ (solo numeros del 1 al 9)");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    aux = leer.nextInt();
                    if (aux < 1 || aux > 9) {
                        System.out.println("numero incorrecto");
                    }
                } while (aux < 1 || aux > 9);
                matriz[i][j] = aux;
            }
        }
        System.out.println("LA MATRIZ ES:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" [" + matriz[i][j] + "]");
            }
            System.out.println("");

        }
        for (int j = 0; j < 3; j++) {
            suma += matriz[0][j];
        }
        sumaColumnas(matriz, suma, suma1, 1, comprobacion);
        sumaColumnas(matriz, suma, suma1, 2, comprobacion);
        sumaFilas(matriz, suma, suma1, 0, comprobacion);
        sumaFilas(matriz, suma, suma1, 1, comprobacion);
        sumaFilas(matriz, suma, suma1, 2, comprobacion);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    suma1 += matriz[i][j];
                }
                if (suma1 != suma) {
                    comprobacion = false;
                }
            }
        }
        suma1 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0 && j == 2 || i == 1 && j == 1 || i == 2 && j == 0) {
                    suma1 += matriz[i][j];
                }
                if (suma1 != suma) {
                    comprobacion = false;
                }
            }
        }
        if (comprobacion = true) {
            System.out.println("LA MATRIZ ES MAGICA");
        } else {
            System.out.println("LA MATRIZ NO ES MAGICA");
        }
    }

    public static void sumaColumnas(int[][] matriz, int suma, int suma1, int i, boolean comprobacion) {
        for (int j = 0; j < 3; j++) {
            suma1 += matriz[i][j];
        }
        if (suma1 != suma) {
            comprobacion = false;
        }

    }

    public static void sumaFilas(int[][] matriz, int suma, int suma1, int j, boolean comprobacion) {
        for (int i = 0; i < 3; i++) {
            suma1 += matriz[i][j];
        }
        if (suma1 != suma) {
            comprobacion = false;
        }
    }
}
