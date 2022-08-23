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
public class ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESAR EL PRIMER NUMERO");
        int num1 = leer.nextInt();
        System.out.println("INGRESAR EL SEGUNDO NUMERO");
        int num2 = leer.nextInt();
        System.out.println("LA SUMA ES: " + (num1 + num2));

    }

}
