/*
 * @author NeuenMartinez
 */
package extras;

import java.util.Scanner;

public class ej3Ex {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESAR UNA LETRA");
        String letra = leer.nextLine();
        String letraM = letra.toUpperCase();

        switch (letraM) {
            case "A":
                System.out.println("LA LETRA INGRESADA ES UNA VOCAL");
                break;
            case "E":
                System.out.println("LA LETRA INGRESADA ES UNA VOCAL");
                break;
            case "I":
                System.out.println("LA LETRA INGRESADA ES UNA VOCAL");
                break;
            case "O":
                System.out.println("LA LETRA INGRESADA ES UNA VOCAL");
                break;
            case "U":
                System.out.println("LA LETRA INGRESADA ES UNA VOCAL");
                break;
            default:
                System.out.println("LA LETRA INGRESADA NO ES UNA VOCAL");
                break;

        }
    }

}
