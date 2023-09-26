/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Ahorcado;
//import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class AhorcadoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {
        Ahorcado ah = new Ahorcado();
        System.out.print("Ingrese la palabra que se intentará adivinar: ");
        String palabra = leer.nextLine();
        System.out.print("Ingrese la cantidad de intentos permitidos para adivinar: ");
        int intentosmaximos = leer.nextInt();
        int letrashalladas = 0;
        String[] palabraclave = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            palabraclave[i] = palabra.substring(i, i + 1);
        }
//       System.out.println(Arrays.toString(palabraclave));
//       ah.setPalabraclave(palabra.split(""));
//       for (String object : "cualquierA".split("")) {
//           System.out.println(object);
//       }
        return ah;
    }

    public void longitud(Ahorcado ah) {
        System.out.println("La longitud de la palabra a encontrar es: " + ah.getPalabraclave().length);
    }

    public boolean buscar(Ahorcado ah, String letra) {
        System.out.println("Ingresa una letra: ");
        letra = leer.next();
        int encontradas = 0;
        boolean exito = false;
        for (String object : ah.getPalabraclave()) {
            if (letra.equalsIgnoreCase(object)) {
                exito = true;
            }
            System.out.println(object);
        }
        return exito;
    }
}

/*
 Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
 Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
 Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
 Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
 */
