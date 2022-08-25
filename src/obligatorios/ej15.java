/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorios;

/**
 *
 * @author NeuenMartinez
 */
public class ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[100];
        relleno(vector);

    }

    public static void relleno(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i + 1;
        }
        for (int i = 99; i >= 0; i--) {
            System.out.println(" " + vector[i]);
        }
    }
}
