/*
 * @author NeuenMartinez
 */
package obligatorios;

import java.util.Scanner;

public class ej17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESAR EL TAMAÑO DEL VECTOR");
        int n = leer.nextInt();
        int [] vector = new int [n];
        for (int i = 0; i < vector.length; i++) {
            vector [i] = leer.nextInt();
        }
                
    }

}

