/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hesca
 */

package extras;


import java.util.ArrayList;
import java.util.Collections;
//import org.apache.commons.lang3.time.StopWatch;


/**
 *
 * 
 */
public class CollectionsTime {

    public static void main(String[] args) {

        //Cliente[] clientes = {new Cliente("Carlitos"), new Cliente("Pablo")};
       // Arrays.asList(clientes).forEach(System.out::println);
        ArrayList<Integer> intAL = new ArrayList();  // WRAPPER      BOxing / unboxing

        int[] enteros = new int[1000];
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = i + 1;
            intAL.add(new Integer(i + 1));
        }

        StopWatch watch = new StopWatch(); //org.apache.commons  commons-lang3  3.120
        watch.start();
        int sumArray = 0;
        for (int i = 0; i < enteros.length; i++) {
            sumArray += enteros[i];
        }
        watch.stop();
        long timeArray =watch.getNanoTime();
        System.out.println("EXECUTION TIME (StopWatch - Suma total: " + sumArray + " ): " +timeArray );
        watch.reset();
        watch.start();
        int sumAL = 0;
        for (Integer integer : intAL) {
            sumAL += integer;

        }
        watch.stop();
        long timeAL =watch.getNanoTime();
        System.out.println("EXECUTION TIME (StopWatch - Suma total: " + sumAL + " ): " + timeAL);
        System.out.println("INCREMENT: "+(( timeAL-timeArray)/timeArray));
    }
    
    
}