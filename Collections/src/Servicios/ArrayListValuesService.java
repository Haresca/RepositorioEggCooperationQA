/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class ArrayListValuesService {

    Scanner leer;
    ArrayList<Integer> valores;
    Integer val, acum=0;  //Integer val, acum=0, cont=0; (sin usar size)
    

    public ArrayListValuesService() {
        this.leer= new Scanner(System.in).useDelimiter("\n");
        this.valores = new ArrayList();
    }

    public void guardarValor(){
        do {
            System.out.println("Ingrese el valor entero para almacenar:");
            val = leer.nextInt();
            if (val!=-99) {
                valores.add(val);
            }
        } while (val!=-99);
        System.out.print("Lectura de números finalizada. ");
    }


    public void mostrarValores(){
        System.out.println("Los "+ valores.size() +" valores actuales del array son:");
        for (Integer v : valores) {
            System.out.println("["+v+"]");
        }
    }
    
    public void mostrarSumayPromedio(){
        for (int i = 0; i < valores.size(); i++) {
            acum+=valores.get(i);
        }
        System.out.println("La suma de los valores actuales del array es de "+ acum);
      //  double prom= (double) acum/valores.size();  Alternativa e imprimir prom
        System.out.println("El promedio de los valores actuales del array es de "+ (double) acum/valores.size());
    }
    
}
