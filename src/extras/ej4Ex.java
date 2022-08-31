/*
 * @author NeuenMartinez
 */
package extras;

import java.util.Scanner;

public class ej4Ex {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESAR UN NUMERO DEL 1 AL 10");
        int num = leer.nextInt();
        switch (num) {
            case 1:
                System.out.println("En romano es I");
                break;
            case 2:
                System.out.println("En romano es II");
                break;
            case 3:
                System.out.println("En romano es III");
                break;
            case 4:
                System.out.println("En romano es IV");
                break;
            case 5:
                System.out.println("En romano es V");
                break;
            case 6:
                System.out.println("En romano es VI");
                break;
            case 7:
                System.out.println("En romano es VII");
                break;
            case 8:
                System.out.println("En romano es VIII");
                break;
            case 9:
                System.out.println("En romano es IX");
                break;
            case 10:
                System.out.println("En romano es X");
                break;
            default:
                System.out.println("El numero ingresado no está todavia en nuestro programa");
        }
    }
}

