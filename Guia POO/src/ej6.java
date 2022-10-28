
import guia.poo.entidades.Cafetera;
import java.util.Scanner;

public class ej6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Cafetera cafetera1 = new Cafetera();

        System.out.println("Hola, que tal. Vamos a servir café");
       
        int op ;
        
        do {

            System.out.println(" 1) Servir café \n 2) Counsultar cuanto café hay \n 3) Llenar cafetera \n 4) Vaciar cafetera \n 5) Salir");
          
            op = leer.nextInt();
            
            switch (op) {
                case 1:
                    cafetera1.servirTaza();
                    
                    break;

                case 2:
                    cafetera1.consultarCafetera();
                    break;

                case 3:
                    cafetera1.llenarCafetera();
                    break;

                case 4:
                    cafetera1.vaciarCafetera();
                    break;
            }
        
            System.out.println("¿Que quiere hacer ahora?");
      
        } while (op != 5) ;
        System.out.println();
            System.out.println("Adios, gracias");
        

    
    }
}