/*
 * @author NeuenMartinez
 */
package extras;

import java.util.Scanner;

public class ej2Ex {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        int aux = 0;
        System.out.println("LOS VALORES INICIALES DE CADA VARIABLE SON:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        System.out.println("LOS VALORES CAMBIADOS DE CADA LETRA SON:");
        aux = cambio(B, C, aux);
        System.out.println("B = " + aux);
        aux = cambio(C, A, aux);
        System.out.println("C = " + aux);
        aux = cambio(A, D, aux);
        System.out.println("A = " + aux);
        aux = cambio(D, B, aux);
        System.out.println("D = " + aux);
    }
        
    public static int cambio(int letra, int letra2, int aux) {
        letra = letra2;
        aux = letra2;
        return aux;
    }
}
