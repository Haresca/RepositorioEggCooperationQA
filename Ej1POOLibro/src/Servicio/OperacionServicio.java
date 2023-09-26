/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class OperacionServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearOperacion() {
        System.out.println("Ingrese el primer número:");
        double numero1 = leer.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double numero2 = leer.nextDouble();
        Operacion op = new Operacion(numero1, numero2);
        // op.setNumero1(numero1);
        // op.setNumero2(numero2);    
    }

    //double numero1, double numero2
    public double sumar(Operacion op) {
        return op.getNumero1() + op.getNumero2();
    }

    public double restar(Operacion op) {
        return op.getNumero1() - op.getNumero2();
    }

    public double multiplicar(Operacion op) {
        if (op.getNumero1() == 0 || op.getNumero2() == 0) {
            System.out.println("Se requiere que los números sean distintos a cero. ERROR.");
            return 0;
        } else {
            return op.getNumero1() * op.getNumero2();
        }
    }

    public double dividir(Operacion op) {
        if (op.getNumero1() == 0 || op.getNumero2() == 0) {
            System.out.println("Se requiere que los números sean distintos a cero. ERROR.");
            return 0;
        } else {
            return op.getNumero1() / op.getNumero2();
        }
    }
}
