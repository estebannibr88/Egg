/*
 * @author NeuenMartinez
 */
package obligatorios;

import java.util.Scanner;

public class ej21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matrizm = new int[10][10];
        int[][] matrizp = new int[3][3];
        int corda = 0, cordb = 0, contador = 0;
        boolean check = false;
        System.out.println("ingrese la primer matriz");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizm[i][j] = j + 1;
                if (i == 9) {
                }
            }
        }
        System.out.println("ingrese la segunda matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizp[i][j] = leer.nextInt();
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matrizm[i][j] == matrizp[0][0] && j < 8 && i < 8 && check != true) {
                    corda = i;
                    cordb = j;
                    contador = 0;
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (matrizp[k][l] == matrizm[corda + k][cordb + l]) {
                                contador++;
                            } else {
                                break;
                            }
                        }
                    }
                    if (contador == 9) {
                        check = true;
                        break;
                    }
                }
            }
            if (check == true) {
                break;
            }

        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrizm[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("\n"
                + "");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizp[i][j]);
            }
            System.out.println(" ");
        }

        if (check == true) {
            System.out.println("matriz p se encuentra en matriz m\n"
                    + "en coordenadas " + corda + " " + cordb);
        } else {
            System.out.println("matriz p no se encuentra en matriz m");
        }

    }

}

