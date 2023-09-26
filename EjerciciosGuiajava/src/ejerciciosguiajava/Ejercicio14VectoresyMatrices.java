/* Ejercicio 14
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package ejerciciosguiajava;

import java.util.Scanner;

/**
 * @author hesca
 */
public class Ejercicio14VectoresyMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);
           System.out.println("Ingrese la moneda final de conversión -dólar, yen o libra-: ");
           String divisa = leer.nextLine();
           System.out.println("Ingrese el monto en euros: ");
           double canteuro = leer.nextDouble();
           convertir(canteuro, divisa);
    }
    public static void convertir(double canteuro, String divisa) {
        divisa = divisa.toLowerCase();
        double cant;
        switch (divisa.substring(0,1)) {
            case "d": //dólares
                cant = canteuro*1.28611;
                break;
            case "y":  //yenes
                cant = canteuro*129.852;
                break;
            case "l":  //libras
                cant = canteuro*0.86;
                break;
            default:
                cant=0;
                System.out.println("Moneda desconocida.");;
        }
        System.out.println("La cantidad de " +canteuro+ " euros equivale a " + Math.round(cant)+" " + divisa); 
    }
}

