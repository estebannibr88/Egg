package guia.poo.entidades;

import java.util.Scanner;

public class Cuenta {

    Scanner leer = new Scanner(System.in);

    public int DNI;

    public double Saldo;

    public String CBU;

    public int Interes;

    private double ingreso;

    private double retiro;
//---------------------------------------------------------------------------------------------------------    

    public Cuenta() {
    }

    public Cuenta(int DNI, double Saldo, String CBU, int Interes) {

        this.DNI = DNI;
        this.Saldo = Saldo ;

        this.CBU = CBU;
        this.Interes = Interes;
    }

    public double getIngreso() {

        System.out.println("Su saldo actual es " + (ingreso + Saldo));
        if (ingreso > 0) {
        this.Saldo = Saldo + ingreso;
        }
        else {
        this.Saldo = Saldo;
        }
        return ingreso;
    }

    public double getRetiro() {
        
        System.out.println("Su saldo actual es " + (Saldo - retiro));
        if (retiro > 0) {
        this.Saldo = Saldo - retiro;
        }
        else {
        this.Saldo = Saldo;
        }
        
        return retiro;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
         
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
        
        
    }

    public void retiroRapido(){

        double por ;
        por = (Saldo * 20 / 100);
        
        
        System.out.println("has retirado " + por + "\n Su saldo actual es " + (Saldo - por));
        
        this.Saldo = Saldo - por;
        
}

    public void consultarDatos() {
    
        System.out.println("DNI: " + DNI + "\n CBU: " + CBU + "\n Saldo " + Saldo + "\n Interes: " + Interes );
    }
}
