/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchejemplos;

import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class FuncionEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = 5;
        int num2 = 7;
        
        //Puedo invocar el retorno de esta función de esta forma:
        System.out.println("La suma de ambos números es: " + sumar(num1,num2));
        
        //Pero recomendamos hacerlo de esta manera, ya que los retornos deben alojarse
        //en variables para su posterior uso
        
        int retorno = sumar(num1,num2);
        System.out.println("La suma de ambos números es " + retorno);
    }
    
    public static int sumar(int num1, int num2) {
        int suma;
        suma = num1 + num2;
        return suma;
    }
    
}
