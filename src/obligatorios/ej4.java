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
public class ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESAR LA TEMPERATURA EN GRADOS CENTIGRADOS");
        double grados = leer.nextDouble();
        System.out.println("LA TEMPERATURA EN GRADOS FARENHEIT ES DE:" + (32 + (9 * (grados) / 5)));

    }

}
