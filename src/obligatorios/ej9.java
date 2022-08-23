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
public class ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESAR UNA FRASE O PALABRA QUE COMIENCE POR LA LETRA A");
        String palabra = leer.nextLine();
        if (palabra.substring(0, 1).equalsIgnoreCase("a")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }

}
