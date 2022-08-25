/*
 * @author NeuenMartinez
 */
package obligatorios;

import java.util.Scanner;

public class ej16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESAR EL TAMAÑO DEL VECTOR");
        boolean aux = false;
        boolean aux2 = false;
        int n = leer.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        System.out.println("INGRESAR UN NUMERO A BUSCAR EN EL VECTOR");
        int num = leer.nextInt();
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num) {
                System.out.println(num + " SE ENCUENTRA DENTRO DEL VECTOR EN LA POSICION [" + i + "]");
                aux2 = true;
            } else {
                aux = true;
            }
        }
        if (aux == true && aux2 == false) {
            System.out.println(num + " NO SE ENCUENTRA DENTRO DEL VECTOR");
        }
    }
}
