package guia.poo.services;

import guia.poo.entidades.Cadena;
import java.util.Scanner;

public class ServicioCadena {

    Scanner leer = new Scanner(System.in);
    Cadena c = new Cadena();
    int contador = 0;

    public Cadena Menu() {

        System.out.println("hola, escribre una frase");

        c.setFrase(leer.next());

        return c;
    }

    public Cadena mostrarVocales() {

        for (int i = 0; i < c.getLongitud(); i++) {

            if ((c.getFrase().charAt(i) == 'a') || (c.getFrase().charAt(i) == 'e') || (c.getFrase().charAt(i) == 'i') || (c.getFrase().charAt(i) == 'o') || (c.getFrase().charAt(i) == 'u')) {
                contador++;

            }
        }
        System.out.println("hay " + contador + " vocales en la frase");
        return c;

    }

    public Cadena vecesRepetido() {
        int cont = 0;

        System.out.println("Que letra deseas buscar");
        char letra = leer.next().charAt(0);

        for (int i = 0; i < c.getLongitud(); i++) {

            if (c.getFrase().charAt(i) == letra) {

                cont++;

            }

        }
        System.out.println("La letra " + "se encuentra " + cont + " veces");
        return c;
    }

    public Cadena invertirFrase() {
       String CadenaInvertida = "";
        for (int i = c.getLongitud() - 1; i >= 0; i--) {
             
            CadenaInvertida += c.getFrase().charAt(i);

        }

        System.out.println(CadenaInvertida);

        return c;
    }

}
