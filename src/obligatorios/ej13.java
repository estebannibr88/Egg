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
public class ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESAR EL TAMAÑO DEL CUADRADO");
        int tamaño = leer.nextInt();
        for (int i = 1; i <= tamaño; i++) {
            for (int j = 1; j <= tamaño; j++) {
                if (i > 1 && i < tamaño && j > 1 && j < tamaño) {
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println("");
        }

    }

}
