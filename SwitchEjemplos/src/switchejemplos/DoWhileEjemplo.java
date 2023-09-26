/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchejemplos;

import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class DoWhileEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String respuesta;
        do {            
            System.out.println("¿Desea continuar?");
            respuesta = read.nextLine();
        } while (respuesta.equalsIgnoreCase("S"));
    }
  
}
