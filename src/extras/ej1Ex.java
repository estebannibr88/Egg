/*
 * @author NeuenMartinez
 */
package extras;

import java.util.Scanner;

public class ej1Ex {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESAR EL TIEMPO EN MINUTOS");
        int tiempo = leer.nextInt();
        int horas = tiempo / 60;
        int dias = horas / 24;
        int hora = horas - (dias *24);
        System.out.println("EQUIVALE A " + dias + " DIAS Y " + hora + " HORAS." );
        
    }

}