/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploentrada;

import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class EjemploEntrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // Creamos el Scanner
        
        System.out.println("Ingrese una cadena");
        String cadena = leer.nextLine(); // Leer una cadena

        System.out.println("Ingrese un numero entero");
        int numEntero = leer.nextInt(); // Leer un entero

     //  System.out.println("Ingrese un numero real");
     //   double numReal = leer.nextDouble(); // Leer un real. Se pone con punto el numero
        

        System.out.println("Ingrese un booleano");
        boolean logico = leer.nextBoolean(); // Leer un lógico 

        System.out.println("Numero Entero " + numEntero); // Se imprime el entero

   //  System.out.println("Numero Real " + numReal); // Se imprime el real

        System.out.println("Cadena " + cadena);

        System.out.println("Logico " + logico);
    }
    
}