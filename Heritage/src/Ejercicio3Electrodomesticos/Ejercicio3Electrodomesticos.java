/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3Electrodomesticos;

import java.util.ArrayList;

/**
 *
 * @author hesca
 */
public class Ejercicio3Electrodomesticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Electrodomesticoej3> electrodomesticos= new ArrayList();
        Lavadoraej3 lavadora1 = new Lavadoraej3(1350000, "verde", 'd', 60, 20);
        Televisorej3 televisor1 = new Televisorej3(2500000, "blanco",'k', 10, 7000, true);
        Lavadoraej3 lavadora2 = new Lavadoraej3(3500000, "gfg", 'b', 30, 90);
        Televisorej3 televisor2 = new Televisorej3(4500000, "negro",'d', 20, 5000, true);
        electrodomesticos.add(lavadora1);
        electrodomesticos.add(lavadora2);
        electrodomesticos.add(televisor1);
        electrodomesticos.add(televisor2);
        for (Electrodomesticoej3 aux : electrodomesticos) {
            System.out.println(aux);
            aux.precioFinal();
        }
        System.out.println("---------------------");
        for (Electrodomesticoej3 aux : electrodomesticos) {
            System.out.println(aux);
        }
        
        double suma = electrodomesticos.stream().mapToDouble(Electrodomesticoej3::getPrecio).sum();
        
        double sumaLavadoras = electrodomesticos.stream()
                .filter(e -> e instanceof Lavadoraej3).mapToDouble(Electrodomesticoej3::getPrecio)
                .sum();
        double sumaTelevisores = suma - sumaLavadoras;
        
        double acumprecios=0;
        for (Electrodomesticoej3 aux : electrodomesticos) {
            acumprecios += aux.getPrecio();
        }
     //   System.out.println("SUMA TOTAL:"+(int)acumprecios);
        System.out.println("-----------------");
        System.out.println("SUMA DE ELECTRODOMÉSTICOS: "+(int)suma);
        System.out.println("SUMA DE LAVADORAS: "+(int)sumaLavadoras);
        System.out.println("SUMA DE TELEVISORES: "+(int)sumaTelevisores);
        
    }
    
}
