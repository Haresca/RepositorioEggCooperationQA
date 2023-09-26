/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relations;

import Entities.DNI;
import Entities.Persona;

/**
 *
 * @author hesca
 */
public class MainPersonaDNI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DNI d1 = new DNI();
        d1.setSerie('t');
        d1.setNumero(154567);
        Persona pers = new Persona();
        pers.setNombre("Juanito");
        pers.setApellido("Alimaña");
        pers.setDni(d1);
        //pers.getDni().setSerie('W');
        pers.getDni().setNumero(79894456);
        
        System.out.println(pers);
        
        DNI d2 = new DNI();
        d2.setSerie('t');
        d2.setNumero(154567);
        Persona person = new Persona();
        person.setNombre("Señor");
        person.setApellido("X");
        person.setDni(d2);
        person.getDni().setSerie('W');
        person.getDni().setNumero(103437);
        
        System.out.println(person);
    }

}
