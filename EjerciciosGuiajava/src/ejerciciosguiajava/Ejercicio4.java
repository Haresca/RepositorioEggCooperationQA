/* Ejercicio 4 
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejerciciosguiajava;

import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float gradosC, gradosF;
        System.out.println("Ingrese la temperatura en grados centígrados: ");
        gradosC= leer.nextFloat();
        gradosF = 32 + (9 * gradosC / 5);                                                        
        System.out.println("La temperatura en grados Faherenheit es equivalente a " +  gradosF + " °F");
    }
    
}
