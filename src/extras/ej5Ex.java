/*
 * @author NeuenMartinez
 */
package extras;

import java.util.Scanner;

public class ej5Ex {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESAR EL TIPO DE OBRA SOCIAL:");
        String tipo = leer.nextLine();
        System.out.println("INGRESAR EL TOTAL:");
        int total = leer.nextInt();
        if (tipo.equalsIgnoreCase("A")) {
            System.out.println("EL TOTAL CON EL DESCUENTO PARA EL TIPO A ES: " + total * 0.50);
        } else if (tipo.equalsIgnoreCase("B")) {
            System.out.println("EL  TOTAL CON EL DESCUENTO PARA EL TIPO B ES: " + total * 0.35);
        } else if (tipo.equalsIgnoreCase("C")) {
            System.out.println("ESTE TIPO DE CATEGORIA NO TIENE DESCUENTO Y SU TOTAL ES DE: " + total);
        } else {
            System.out.println("EL TIPO DE CATEGORIA INGRESADO NO ES VALIDO");
        }

    }

}
