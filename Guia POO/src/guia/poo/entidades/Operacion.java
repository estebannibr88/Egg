package guia.poo.entidades;

public class Operacion {

    private int num1;

    private int num2;

    public int sumar;

    public int restar;

    public int multiplicar;

    public int dividir;

    public Operacion() {
       
    }

    public Operacion(int sumar, int restar, int multiplicar, int dividir) {
        this.sumar = sumar;
        this.restar = restar;
        this.multiplicar = multiplicar;
        this.dividir = dividir;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getSumar() {
        sumar = num1 + num2;
        return sumar;
    }

    public int getRestar() {
        restar = num1 - num2;
        return restar;
    }

    public int getMultiplicar() {
        if (num1 == 0 || num2 == 0) {

            System.out.println("error, todo numero multiplicado por '0' resulta en '0'");

        } else {
        multiplicar = num1 * num2;
        }
        return multiplicar;
    }

    public int getDividir() {
        if (num1 == 0 || num2 == 0) {

            System.out.println("error, no se puede dividir por '0'");

        } else{
        dividir = num1 / num2 ;
        }
        return dividir;

    }

}
