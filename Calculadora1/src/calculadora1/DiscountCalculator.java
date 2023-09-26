/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora1;

import java.util.HashMap;

/**
 *
 * @author hesca
 */


public class DiscountCalculator {
    public static void main(String[] args) {
        HashMap<Integer, String> personas = new HashMap();
        String n1 = "Albus";
        String n2 = "Severus";
        int k1 = 1;
        int k2 = 2;
        personas.put(k1,n1);
    }
    
    
    nombreArrayList.forEach(System.out::println);
    
    
    
    import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Supongamos que tienes una lista de números enteros
        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);

        // Utilizamos forEach con una referencia a un método para aplicar una operación matemática a cada número y luego imprimir los resultados
        numeros.forEach(Main::operacionMatematica);
    }

    // Método que realiza una operación matemática en un número y lo imprime
    private static void operacionMatematica(int numero) {
        int resultado = numero * 2 + 3;
        System.out.println("Resultado para " + numero + ": " + resultado);
    }
}
    
    
}
