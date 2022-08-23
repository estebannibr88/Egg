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
public class ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESAR LA PALABRA CONTRASEÑA");
        String palabra = leer.nextLine();
        if (palabra.equals("eureka")) {
            System.out.println("CONTRASEÑA CORRECTA");
        } else {
            System.out.println("CONTRASEÑA INCORRECTA");
        }
    }
}
