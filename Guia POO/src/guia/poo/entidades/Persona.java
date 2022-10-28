package guia.poo.entidades;

import java.util.Scanner;

public class Persona {

    Scanner leer = new Scanner(System.in);
    String nombre;
    int edad;
    String sexo;
    double peso;
    double altura;
    int imc = 0;
    boolean mayor ;
   

//---------------------------------------------------------------------------------------------------------
    public Persona() {
    }

    public Persona(String nombre ,int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
      
    }
    public Persona (int imc){
    
    this.imc = imc;
    
    }
//---------------------------------------------------------------------------------------------------------

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {

        this.sexo = sexo;

    }

    public void setPeso(double peso) {
        this.peso = peso;

    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
   public void setImc (double imc){
   
   
   }
   public void setMayor ( boolean mayor){
   
   }
//---------------------------------------------------------------------------------------------------------

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public int getImc() {

        return imc;

    }
    public boolean getMayor(){
    
    return mayor;
    
    }

    
//---------------------------------------------------------------------------------------------------------


   

    }

  


