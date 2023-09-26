/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mains;

import Servicios.PaisServicio;

/**
 *
 * @author hesca
 */
public class MainPaises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaisServicio pas = new PaisServicio(); 
        pas.crearPais();
        System.out.println("---PAÍSES ORDENADOS---");
        pas.mostrarPaisesOrdenados();
        System.out.println("----------");
        pas.eliminarPais();
        System.out.println("---LISTA ACTUALIZADA---");
        pas.mostrarPaisesOrdenados();
    }
}
