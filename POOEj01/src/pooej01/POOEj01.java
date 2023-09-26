/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Persona;

/**
 
 * @author hesca
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona001 = new Persona();
        Persona persona002 = new Persona("Pablo","Masculino",35467567);
        Persona persona003 = new Persona("Juana","Jara","Femenino",28,1045376857);

        System.out.println(persona003.getNombre());
        System.out.println(persona003.getID());

    }
    
}
