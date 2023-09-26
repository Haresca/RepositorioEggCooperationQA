/*   Ejercicio 4
 Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
package ejerciciosguiajava;

import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class EjercicioExtra4ConversorRomanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        //System.out.print("Ingrese el número entero entre 1 y 10: ");
        int numbint;
        do {            
        System.out.print("Ingrese el número entero entre 1 y 10: ");
        numbint = read.nextInt();    
        if(numbint<1 || numbint>10){
            System.out.println("Número incorrecto. Vuelva a intentarlo.");
        }else{
            String romanos[]={"I","II","III","IV","V","VI","VII","VIII","IX","X"};
            System.out.println("El número "+numbint+" equivale al número romano " + romanos[numbint-1]);
        }
        } while (numbint<1 || numbint>10);
        

        
        
  } 
}
