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
public class ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESAR UNA FRASE");
        String frase = leer.nextLine();
        System.out.println("LA FRASE EN MAYUSCULAS ES: " + frase.toUpperCase());
        System.out.println("LA FRASE EN MINUSCULAS ES: " + frase.toLowerCase());

    }

}
