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
public class ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int correctos = 0;
        int incorrectos = 0;
        String cadena;
        do {
            System.out.println("INGRESAR UNA CADENA DE 5 CARACTERES (con el primer caracter x y el ultimo o)");
            cadena = leer.nextLine();
            int tamaño = cadena.length();
            if (cadena.equals("&&&&&")) {
            }else if (cadena.length() == 5 && cadena.substring(0, 1).equals("x") && cadena.substring(tamaño - 1).equals("o")) {
                correctos++;
                

            } else {
            incorrectos++;
            }
        } while (!cadena.equals("&&&&&"));
        System.out.println("HUBO " + correctos + " CADENAS CORRECTAS");
        System.out.println("HUBO " + incorrectos + " CADENAS INCORRECTAS");
    }

}
