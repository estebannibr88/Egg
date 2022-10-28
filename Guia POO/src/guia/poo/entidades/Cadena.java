package guia.poo.entidades;

public class Cadena {

    String frase;

    int longitud ;

 
    public Cadena() {
    }
//---------------------------------------------------------------------------------------------------------

    public void setFrase(String frase) {
        this.frase = frase;
        longitud = frase.length();
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }



//---------------------------------------------------------------------------------------------------------
    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }

   
    
    
    
}
