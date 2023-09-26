/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOEjerciciosGuía;

import Entidades.NIF;
import Servicio.NIFServicio;

/**
 *
 * @author hesca
 */
public class Ej4extraPOONIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NIFServicio ns = new NIFServicio();
        NIF n = ns.crearNif();
        ns.mostrar(n);
    }
}
