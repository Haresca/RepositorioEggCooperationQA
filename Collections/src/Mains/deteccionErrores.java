/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mains;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author hesca
 */
public class deteccionErrores {

    static ArrayList<String> bebidas = new ArrayList<>();

    public static void main(String[] args) {
        bebidas.add("café");
        bebidas.add("té");

        Iterator<String> it = bebidas.iterator();

        for (String b : bebidas) {
            System.out.println("Bebida:" + b);
        }
        
        while (it.hasNext()) {
            if (it.next().equals("café")) {
                it.remove();
            }

        }
        
        for (String b : bebidas) {
            System.out.println("Bebida:" + b);
        }
    }
}
