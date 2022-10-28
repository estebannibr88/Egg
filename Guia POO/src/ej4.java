
import guia.poo.entidades.Rectangulo;
import java.util.Scanner;

public class ej4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Rectangulo rec1 = new Rectangulo();

        System.out.println("Introduce los lados del rectangulo");

        System.out.println("Altura ");
        rec1.setLadoA(leer.nextInt());
        System.out.println("Base ");
        rec1.setLadoB(leer.nextInt());

        System.out.println("================================================");

        for (int a = 1; a <= rec1.getLadoA(); a++) {

            for (int b = 1; b <= rec1.getLadoB(); b++) {

                if (a > 1 && a < rec1.getLadoA() && b > 1 && b < rec1.getLadoB()) {
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }

            }
            System.out.println("");
        }

        System.out.println("================================================");

        System.out.println("La superficie es ");
        rec1.superficie();
        System.out.println("El perimetro es ");
        rec1.perimetro();

    }

}
