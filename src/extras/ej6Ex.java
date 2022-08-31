/*
 * @author NeuenMartinez
 */
package extras;

import java.util.Scanner;

public class ej6Ex {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESAR LA CANTIDAD DE PERSONAS");
        int n = leer.nextInt();
        int enanos = 0;
        int promInclusive = 0;
        int promEnanos = 0;
        int inclusive = 0;
        int[] vector = new int[n];
        System.out.println("INGRESAR LAS ALTURAS EN CM");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = leer.nextInt();
            inclusive++;
            promInclusive += vector[i];
            if (vector[i] <= 160) {
                enanos++;
                promEnanos += vector[i];
            }

        }
        System.out.println("LE PROMEDIO TOTAL DE PERSONAS ES DE: " + (promInclusive / inclusive));

        if (enanos == 0) {
            System.out.println("NO HUBIERON PERSONAS QUE MIDIERAN MENOS DE 1.60m");
        } else {
            System.out.println("EL PROMEDIO DE PERSONAS QUE MIDEN MENOS DE 1.60m ES DE: " + (promEnanos / enanos));
        }
    }
}
