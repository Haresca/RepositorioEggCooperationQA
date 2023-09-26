/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2Electrodomesticos;

/**
 *
 * @author hesca
 */
public class Ejercicio2Electrodomesticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 /* Electrodomestico electrodomestico1 = new Electrodomestico();
        electrodomestico1.crearElectrodomestico();
        electrodomestico1.precioFinal();
        System.out.println(electrodomestico1.toString());*/
        System.out.println("---LAVADORA---");
        Lavadora lavadora1 = new Lavadora();
        lavadora1.crearLavadora();
        System.out.println(lavadora1.toString());

        System.out.println("---TELEVISOR---");
        Televisor televisor1 = new Televisor();
        televisor1.crearTelevisor();
        System.out.println(televisor1.toString());
    }
    
}
