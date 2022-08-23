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
public class ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESAR UN NUMERO");
        int num = leer.nextInt();
        System.out.println("EL DOBLE DEL NUMERO INGRESADO ES:" + (num * 2) + " EL TRIPLE ES: " + (num * 3) + " Y LA RAIZ CUADRADA ES:" + Math.sqrt(num));

    }

}
