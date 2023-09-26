/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mains;

import Servicios.AppTiendaService;

/**
 *
 * @author hesca
 */
public class MainAppTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AppTiendaService ats = new AppTiendaService(); 
        ats.menu();
//        System.out.println("----------");
//        ats.eliminarArticulo();
//        System.out.println("---LISTA ACTUALIZADA---");
//        ats.mostrarArticulos();
    }
    
}
