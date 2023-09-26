/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;  // paqu: contenedores de clases

import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se crea variable Scanner que leerá datos del usuario
        Scanner leer = new Scanner(System.in);
        // Se crea variable cadena que leerá datos del usuario
        String nombre;
        System.out.println("Ingresa tu nombre: ");
        //Leer el nombre de la persona en la variable nombre
        nombre = leer.next();
        System.out.println("¡Hola, mundo! Soy " + nombre + " y estoy programando en Java."); //Ctrl+espacio: asistente
    }
    
}
