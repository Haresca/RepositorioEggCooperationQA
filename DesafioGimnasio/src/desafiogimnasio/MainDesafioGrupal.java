/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package desafiogimnasio;

import Servicios.ClienteServicio;
import Servicios.RutinaServicio;

/**
 *
 * @author jmlucero
 */
public class MainDesafioGrupal {

    public static void main(String[] args) {
        ClienteServicio clServicio = new ClienteServicio();
        RutinaServicio ruServicio = new RutinaServicio();
        
       /* clServicio.inicializarClientes();
        clServicio.registrarCliente();
        clServicio.obtenerClientes();
        clServicio.actualizarCliente();
        clServicio.obtenerClientes();
        clServicio.eliminarCliente(); */


        ruServicio.inicializarRutinas();
        ruServicio.registrarRutina();
        ruServicio.obtenerRutinas();
        ruServicio.actualizarRutina();
        ruServicio.obtenerRutinas();
        ruServicio.eliminarRutina();

    }

}
