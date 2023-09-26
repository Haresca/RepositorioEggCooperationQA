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
public class ContinueEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            
            if(i == 4){
                
                continue; // El continue cuando se encuentra el 4, salta el 4 pero continua con el for
                
                
            }
            
            System.out.println("El numero es " + i);
            
            
        }
    }
    
}


        
        