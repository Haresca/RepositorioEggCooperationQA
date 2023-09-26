/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchejemplos;

/**
 *
 * @author hesca
 */
public class ProcedimEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = "Harvey";
        int edad = 37;
        mostrarInfo(nombre, edad);
    }
    public static void mostrarInfo(String nombre, int edad) {
        System.out.println("El nombre del usuario es " + nombre + " y su edad es de "+ edad);
    }
}
