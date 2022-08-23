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
public class ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESAR EL LIMITE");
        int lim = leer.nextInt();
        int suma = 0;
        do {
            System.out.println("INGRESAR UN NUMERO");
            int num = leer.nextInt();
            suma = num + suma;

        } while (suma <= lim);

    }

}
