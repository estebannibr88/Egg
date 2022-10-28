
import guia.poo.entidades.Persona;
import guia.poo.services.ServicioPersona;
import java.util.Scanner;

public class ej7 {

    public static void main(String[] args) {

        ServicioPersona ps = new ServicioPersona();
        Scanner leer = new Scanner(System.in);
        double bajo = 0;
        double ideal = 0;
        double sobre = 0;
        int mayor = 0;
        int menor = 0;

        System.out.println("¿Cuantas personas son?");
        int op = leer.nextInt();

        for (int i = 0; i < op; i++) {

            Persona p = ps.crearPersona();

            ps.calcularIMC();
            ps.esMayordeEdad();

            switch (p.getImc()) {

                case -1:
                    System.out.println(p.getNombre() + " Está por debajo de su peso ideal");
                    bajo++;
                    break;

                case 0:
                    System.out.println(p.getNombre() + " Está en su peso peso ideal");
                    ideal++;

                    break;

                case 1:
                    System.out.println(p.getNombre() + " Está por encima de su peso ideal");
                    sobre++;

                    break;

            }

            if (p.getMayor() == true) {
                System.out.println(p.getNombre() + " Es mayor de edad");
                mayor++;
            } else {
                System.out.println(p.getNombre() + " Es menor de edad");
                menor++;

            }

        }
        //double bajo = 0;double ideal = 0;double sobre = 0;
        System.out.println((bajo * (100 / op)) + "% se encuentra por debajo de su peso ideal");

        System.out.println((ideal * (100 / op)) + "% se encuentra en su peso ideal");

        System.out.println((sobre * (100 / op)) + "% se encuentra por encima de su peso ideal");

        System.out.println((mayor * (100 / op)) + "% son mayores de edad");

        System.out.println((menor * (100 / op)) + "% son menores");
    }

}
