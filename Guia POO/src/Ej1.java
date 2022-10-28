
import guia.poo.entidades.Libro;
import java.util.Scanner;



public class Ej1 {

    
    public static void main(String[] args) {
             Scanner leer = new Scanner (System.in);

             System.out.println("Ingrese los datos del Libro");

             
             Libro libro1 = new Libro(leer.nextLine(), leer.nextLine(), leer.nextInt(), leer.nextLine());
                                    // ( Titulo, Autor, NumeroPag, ISBN)
             
             System.out.println(libro1 + " ");
             
    }

}
