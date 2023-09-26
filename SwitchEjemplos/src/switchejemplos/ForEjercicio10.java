/* Ejercicio 10
 Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **

 */
package switchejemplos;

import java.util.Scanner;

/**
 * @author hesca
 */
public class ForEjercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 4;) {              //for(int i=500;i<=1000;i+=2)
           System.out.println("Ingrese un número positivo no mayor a 20: ");
           int num = leer.nextInt(); 
            if (num>0 && num<20) {
                i++;
                System.out.print(num + "");
                for (int j = 0; j < num; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
        
    }
    
}
