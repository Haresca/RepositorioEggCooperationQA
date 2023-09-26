/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mains;

import Servicios.ArrayListValuesService;

/**
 *
 * @author hesca
 */
public class MainArrayListValues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayListValuesService alv = new ArrayListValuesService();
        alv.guardarValor();
        alv.mostrarValores();
        alv.mostrarSumayPromedio();
    }
    
}
