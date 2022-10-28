
import guia.poo.entidades.Cuenta;
import java.util.Scanner;

public class ej5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Cuenta cuenta1 = new Cuenta();

        System.out.println("Bienvenido a Banco SanDross ");

        System.out.println("Ingrese sus datos por favor");

        System.out.println("DNI");
        cuenta1.DNI = leer.nextInt();
        System.out.println("Saldo");
        cuenta1.Saldo = leer.nextDouble();
        System.out.println("CBU");
        cuenta1.CBU = leer.next();
        System.out.println("Interes");
        cuenta1.Interes = leer.nextInt();

//---------------------------------------------------------------------------------------------------------
        int op;

        do {
            System.out.println("\n ¿Que operacion desea realizar? \n 1) Ingreso \n 2) Retiro \n 3) Retiro rapido \n 4) Consultar saldo \n 5) Consultar Datos \n 6) Salir");

            op = leer.nextInt();

            switch (op) {
                case 1:

                    System.out.println("¿Cuanto quiere ingresar?");
                    cuenta1.setIngreso(leer.nextDouble());
                    cuenta1.getIngreso();

                    break;

                case 2:

                    System.out.println("¿Cuanto quiere retirar?");
                    cuenta1.setRetiro(leer.nextDouble());
                    cuenta1.getRetiro();

                    break;

                case 3:

                    cuenta1.retiroRapido();

                    break;
                case 4:

                    System.out.println(" Su saldo actual es " + cuenta1.Saldo);

                    break;
                    
                case 5:

                    cuenta1.consultarDatos();

                    break;
            }

        } while (op != 6);
        System.out.println("Gracias, Hasta luego");
    }

}
