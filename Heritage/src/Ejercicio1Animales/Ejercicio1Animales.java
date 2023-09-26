/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1Animales;

/**
 *
 * @author hesca
 */
public class Ejercicio1Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro1 = new Perro ("Stitch", "Carnívoro", 15, "Doberman");
        perro1.Alimentarse();
        
        Animal perro2 = new Perro ("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.Alimentarse();
        
        Animal gato1 = new Gato ("Pelusa", "Galletas", 15, "Siamés");
        gato1.Alimentarse();

        Animal caballo1 = new Caballo ("Spark", "Pasto", 25, "Fino");
        caballo1.Alimentarse();
    }
    
}
