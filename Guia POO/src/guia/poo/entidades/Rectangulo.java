package guia.poo.entidades;

public class Rectangulo {

    private int ladoA;

    private int ladoB;

    

    public Rectangulo() {
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public void superficie() {
        int superficie;

        superficie = ladoA * ladoB;
        System.out.println(superficie);
    }

    public void perimetro() {
        int perimetro;

        perimetro = (ladoA + ladoB) * 2;

        System.out.println(perimetro);

    }

    public int getLadoA() {
        return ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }


}
