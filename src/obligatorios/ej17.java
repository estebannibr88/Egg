/*
 * @author NeuenMartinez
 */
package obligatorios;

import java.util.Scanner;

public class ej17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESAR EL TAMAÑO DEL VECTOR");
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        int n = leer.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("INGRESAR UN NUMERO ENTERO POSITIVO DE HASTA 5 DIGITOS");
            vector[i] = leer.nextInt();
            if (vector[i] >= 0 && vector[i] <= 9) {
                cont1 ++;
            } else if (vector[i] >= 10 && vector[i] <= 99) {
                cont2 ++;
            } else if (vector[i] >= 100 && vector[i] <= 999) {
                cont3 ++;
            } else if (vector[i] >= 1000 && vector[i] <= 9999) {
                cont4 ++;
            } else if (vector[i] >= 1000 && vector[i] <= 9999) {
                cont5 ++;
            } else{
                System.out.println("EL NUMEROINGRESADO NO ES VALIDO Y NO SE REGISTRARA EN NINGUN CONTADOR");
            }
        }
        System.out.println("HUBO " + cont1 + " NUMEROS DE 1 CIFRA");
        System.out.println("HUBO " + cont2 + " NUMEROS DE 2 CIFRA");
        System.out.println("HUBO " + cont3 + " NUMEROS DE 3 CIFRA");
        System.out.println("HUBO " + cont4 + " NUMEROS DE 4 CIFRA");
        System.out.println("HUBO " + cont5 + " NUMEROS DE 5 CIFRA");
    }
}
