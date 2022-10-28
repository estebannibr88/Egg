package guia.poo.services;

import guia.poo.entidades.Persona;
import java.util.Scanner;

public class ServicioPersona {

    Scanner leer = new Scanner(System.in);
    Persona pc = new Persona();

    public Persona crearPersona() {

        System.out.println("\n Introduce tu nombre");
        pc.setNombre(leer.next());

        System.out.println("\n Bienvenido " + pc.getNombre() + ", a continuacion rellena el campo con tus datos");

        System.out.println("\n Introduce tu edad");
        pc.setEdad(leer.nextInt());

        System.out.println("\n Introduce tu sexo");
        boolean ok = true;
        String sexo = "";
        do {
            sexo = leer.next();

            if (sexo.equals("hombre") || sexo.equals("mujer") || sexo.equals("otro")) {

                pc.setSexo(sexo);
                ok = true;
            } else {
                System.out.println("Opcion incorrecta");
                ok = false;
            }
        } while (ok != true);

        System.out.println("\n Introduce tu peso");
        pc.setPeso(leer.nextDouble());

        System.out.println("\n Introduce tu altura");
        pc.setAltura(leer.nextDouble());

        return pc;
    }

    public void calcularIMC() {

        double resul;

        resul = pc.getPeso() / (pc.getAltura() * pc.getAltura());

        if (resul < 20) {

            resul = -1;

        } else if (resul > 20 && resul < 25) {
            resul = 0;

        } else if (resul > 25) {
            resul = 1;
        }

        pc.setImc(resul);

    }

    public void esMayordeEdad() {
        boolean mayor;

        if (pc.getEdad() > 18) {
            mayor = true;
            System.out.println(" Es mayor de edad");

        } else {

            System.out.println(" Es menor de edad");
            mayor = false;
            
        }
        pc.setMayor(mayor);

    }
}
