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
public class ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean exit = false;
        System.out.println("INGRESAR 2 NUMEROS");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        System.out.println("MENU\n"
                + "1. Sumar\n"
                + "2. Restar\n"
                + "3. Multiplicar\n"
                + "4. Dividir\n"
                + "5. Salir\n"
                + "Elija opción:");
        do {
            int eleccion = leer.nextInt();
            switch (eleccion) {
                case 1:
                    System.out.println("SUMA = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("RESTA = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("MULTIPLICACION = " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("DIVISION = " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String confirmacion = leer.next();
                    if (confirmacion.equalsIgnoreCase("s")) {
                        exit = true;
                        break;
                    } else;
                    exit = false;
                    break;
                default:
                    System.out.println("LA OPCION INGRESADA NO ES VALIDA");
                    break;
            }
        } while (exit == false);
    }
}
