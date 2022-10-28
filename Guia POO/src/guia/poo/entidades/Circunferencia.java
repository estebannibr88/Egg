package guia.poo.entidades;

public class Circunferencia {

    private double radio;

    public double area;

    public double perimetro;

    public void setRadio(double radio) {

        this.radio = radio;
    }

   
    public double getRadio() {
        return radio;
    }

    public void setArea(double area) {
      this.area = area ;
    }

    public void setPerimetro (double perimetro) {
        this.perimetro = perimetro;
    }
    
    public double getArea() {
        this.area = Math.PI * radio * radio;
        return area;
    }

    public double getPerimetro() {
    this.perimetro = 2 * Math.PI * radio; 
    
    return perimetro;
   
            }
    
   
    }

  

