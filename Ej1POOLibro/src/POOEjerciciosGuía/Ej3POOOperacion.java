/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOEjerciciosGuía;

import Entidades.Operacion;
import Servicio.OperacionServicio;
import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class Ej3POOOperacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperacionServicio os = new OperacionServicio();
        Scanner read = new Scanner(System.in);
        Operacion op = new Operacion();
        System.out.println("Ingrese el primer número: ");
        op.setNumero1(read.nextDouble());
        System.out.println("Ingrese el segundo número: ");
        op.setNumero2(read.nextDouble());
        System.out.println("La suma es igual a "+os.sumar(op));
        System.out.println("La resta es igual a "+os.restar(op));
        System.out.println("El producto es igual a "+os.multiplicar(op));
        System.out.println("El cociente es igual a "+os.dividir(op));

    }
    
}
