/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mains;

import Ejercicio1PersonayPerro.Perro;
import Ejercicio1PersonayPerro.Persona;

/**
 *
 * @author hesca
 */
public class MainPersonayPerro1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona pers1 = new Persona();
        Persona pers2 = new Persona();
        Perro can1 = new Perro("Canito", "Poodle", 4.5, "Medio");
        Perro can2 = new Perro("Chiquillo","Doberman", 6.6, "Grande");
        
        pers1.setNombre("Pietro");
        pers1.setApellido("Palacio");
        pers1.setDocumento(2345432);
        pers1.setEdad(40);
        pers1.setPerro(can1);
        
        
        pers2.setNombre("Juana");
        pers2.setApellido("La Cubana");
        pers2.setDocumento(45334567);
        pers2.setEdad(27.5);
        pers2.setPerro(can2);
        
        System.out.println(pers1.toString());
        System.out.println(pers2.toString());
    }
    
}
