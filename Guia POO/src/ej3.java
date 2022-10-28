
import guia.poo.entidades.Operacion;
import java.util.Scanner;

public class ej3 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Bienvenido a la calculadora");
        System.out.println(" escriba dos numeros por favor");
        
        Operacion op = new Operacion();
        
        op.setNum1(leer.nextInt());
        op.setNum2(leer.nextInt());
     
        
        System.out.println("Elija la operacion \n (s) Sumar \n (r) Restar \n (m) Multiplicar \n (d) Dividir");
       
        String opcion = leer.next();
        
        switch (opcion) {
            case "s":
                System.out.println(op.getSumar());
                break;
            
            case "r":
                System.out.println(op.getRestar());
                
                break;
            
            case "m":
                System.out.println(op.getMultiplicar());
                break;            
            
            case "d":
                System.out.println(op.getDividir());
                break;
        }
    }
}
