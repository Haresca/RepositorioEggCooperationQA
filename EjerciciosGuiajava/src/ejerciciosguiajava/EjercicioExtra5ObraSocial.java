/*  Ejercicio 5
 Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
package ejerciciosguiajava;

import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class EjercicioExtra5ObraSocial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String category;
        do {            
        System.out.print("Ingrese la letra de la categoría de socio: ");
        category = read.next();  
        category=category.toUpperCase();
        if(!category.equals("A") && !category.equals("B") && !category.equals("C")){
            System.out.println("Categoría incorrecta. Vuelva a intentarlo.");
        }else{
            System.out.print("Ingrese el costo del tratamiento: ");
            double cosTratam = read.nextDouble();
            double payment;
            switch (category) {
                case "A":
                    payment= cosTratam*(1-0.50);
                    break;
                case "B":
                    payment= cosTratam*(1-0.35);
                    break;
                case "C":
                    payment=cosTratam;
                    break;
                default:
                    payment=0;
            }
            System.out.println("Debido a su categoría tipo " + category+", debe pagar $" + payment);
        }
        }while(!category.equalsIgnoreCase("A") && !category.equalsIgnoreCase("B") && !category.equalsIgnoreCase("C"));
       }
}
