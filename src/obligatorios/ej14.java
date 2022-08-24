/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorios;

import java.util.Scanner;

/**
 *
 * @author MegaTecnologia
 */
public class ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("INGRESAR LA CANTIDAD DE EUROS A CONVERTIR");
        double euros = leer.nextInt();
        System.out.println("INGRESAR A QUE MONEDA DESEA CONVERTIR");
        String tipo = leer.next();
        conversion(euros, tipo);
    }

    public static void conversion(double euros, String tipo) {
        if (tipo.equalsIgnoreCase("libra")) {
            System.out.println(euros + "euros equivale a " + (euros * 0.86) + " libras");
        } else if (tipo.equalsIgnoreCase("dolar")) {
            System.out.println(euros + "euros equivale a " + (euros * 1.28611) + " dolares");

        } else if (tipo.equalsIgnoreCase("yenes")) {
            System.out.println(euros + "euros equivale a " + (euros * 129.852) + " yenes");

        } else {
            System.out.println("la moneda de cambio no es valida");
        }
    }
}
