/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOEjerciciosGuía;

import java.util.Arrays;

/**
 *
 * @author hesca
 */
public class Ej10POOArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double arrayA[] = new double [50];
        double arrayB[] = new double [20];
        Arrays.fill(arrayA, (double) Math.random());
       // fillArray(arrayA);
    }

    private static void fillArray(double[] arrayA) {    //static para no crear objeto de clase y acceder directamente al método
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
