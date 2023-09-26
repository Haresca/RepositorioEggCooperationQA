/* Ejercicio 11
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.

a e i o u
@ # $ % *

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package switchejemplos;

import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class CodigoEjercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String frase;
        do {        
            System.out.println("Ingrese una frase: ");
            frase = scan.nextLine();
            System.out.println("La frase ingresada es: ");
            System.out.println(frase);
            String subs = frase.substring(frase.length()-1);
          if (subs.equals(".")) {            
            System.out.println("La frase modificada es: ");
            System.out.println(modifica(frase)); 
            break;
            }  else { 
            System.out.println("¡La frase debe terminar en punto(.)!");  
          }
        } while (!frase.equals(""));
    }
    
    public static String modifica(String frase) {
        String salida = "";
       // for (int i = 0; i < frase.length(); i++) {
       //     salida = salida + cambio(frase.substring(i,i+1));
       // }
        for (int i = 0; i < frase.length(); i++) {
            salida = salida.concat(cambio(frase.substring(i,i+1)));
        }
        return salida;
    }
    
    public static String cambio(String letra) {
        letra = letra.toLowerCase();
        switch (letra) {
            case "a":
                letra = "@";
                break;
            case "e":
                letra = "#";
                break;
            case "i":
                letra = "$";
                break;
            case "o":
                letra = "%";
                break;
            case "u":
                letra = "*";
                break;
            default:
                
        }
        return letra;
    }
    
}
