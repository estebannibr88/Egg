package guia.poo.entidades;

import java.util.Scanner;

public class Cafetera {

    private int capacidadMax = 1000;

    private final int capacidadMin = 0;

    public Cafetera() {
    }

    public void llenarCafetera() {
        if (capacidadMax == 1000) {
            System.out.println("La cafetera está ya llena");
        } else {
            System.out.println("Se ha llenado la cafetera");
            this.capacidadMax = 1000;
        }
    }

    public void vaciarCafetera() {

        if (capacidadMax == 0) {
            System.out.println("La cafetera está ya vacia");
        } else {
            System.out.println("Se ha vaciado la cafetera");
            this.capacidadMax = capacidadMin;
        }
    }

    public void servirTaza() {

        Scanner leer = new Scanner(System.in);

        System.out.println(" Elija el tamaño de su taza \n 1) 150ml \n 2) 250ml \n 3) 400ml");

        int taza = leer.nextInt();

        switch (taza) {
            case 1:
                if (capacidadMax == capacidadMin ){
                    System.out.println("La cafetera esta vacia");
                    int op;
                    System.out.println("¿Desea llenarla? \n 1) Si \n 2) No");
                    op = leer.nextInt();
                    switch (op){
                        case 2: 
                            
                            break;
                        case 1:
                           llenarCafetera(); 
                           break;
                    }
                } else if (capacidadMax < 150) {
            
                System.out.println("Solo se ha servido " + capacidadMax +  "ml y la cafetera quedo vacia" );
                int op;
                    System.out.println("¿Desea llenarla? \n 1) Si \n 2) No");
                    op = leer.nextInt();
                    switch (op){
                        case 1: 
                            llenarCafetera();
                            break;
                        case 2: 
                            
                            break;
                    }
                    
                    
            }else {
                System.out.println("Se ha servido su taza de 150ml");
                this.capacidadMax -= 150;
                System.out.println("Quedan " + capacidadMax + "ml en su cafetera");
                System.out.println();}
                break;

            case 2: 
                if (capacidadMax == capacidadMin ){
                    System.out.println("La cafetera esta vacia");
                    int op;
                    System.out.println("¿Desea llenarla? \n 1) Si \n 2) No");
                    op = leer.nextInt();
                    switch (op){
                        case 1: 
                            llenarCafetera();
                            break;
                        case 2: 
                            
                            break;
                    }
                } else if (capacidadMax < 250) {
            
                System.out.println("Solo se ha servido " + capacidadMax +  "ml y la cafetera quedo vacia" );
                int op;
                    System.out.println("¿Desea llenarla? \n 1) Si \n 2) No");
                    op = leer.nextInt();
                    switch (op){
                        case 1: 
                            llenarCafetera();
                            break;
                        case 2: 
                            
                            break;
                    }
                    
            }else {
                System.out.println("Se ha servido su taza de 250ml");
                this.capacidadMax -= 250;
                System.out.println("Quedan " + capacidadMax + "ml en su cafetera");
                System.out.println();}
                break;

            case 3:
                if (capacidadMax == capacidadMin ){
                    System.out.println("La cafetera esta vacia");
                    int op;
                    System.out.println("¿Desea llenarla? \n 1) Si \n 2) No");
                    op = leer.nextInt();
                    switch (op){
                        case 1: 
                            llenarCafetera();
                            break;
                        case 2: 
                          
                            break;
                    }
                } else if (capacidadMax < 400) {
            
                System.out.println("Solo se ha servido " + capacidadMax +  "ml y la cafetera quedo vacia" );
                int op;
                    System.out.println("¿Desea llenarla? \n 1) Si \n 2) No");
                    op = leer.nextInt();
                    switch (op){
                        case 1: 
                            llenarCafetera();
                            break;
                        case 2: 
                          
                            break;
                    }
                    
            }else {
                System.out.println("Se ha servido su taza de 400ml");
                this.capacidadMax -= 400;
                System.out.println("Quedan " + capacidadMax + "ml en su cafetera");
                System.out.println();}
                break;

        }

    }

    public void consultarCafetera() {

        System.out.println("Quedan "+ capacidadMax + "ml en su cafetera");
        
    }
}

