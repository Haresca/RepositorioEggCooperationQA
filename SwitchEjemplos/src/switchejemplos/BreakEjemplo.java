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
public class BreakEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            if (i == 4) {

                break; // El break cuando se encuentra el 4, corta el for y no sigue

            }

            System.out.println("El numero es " + i);
        }
    }
    
}
