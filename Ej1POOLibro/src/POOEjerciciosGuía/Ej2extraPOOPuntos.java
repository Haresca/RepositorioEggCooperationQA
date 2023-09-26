/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOEjerciciosGuía;

import Entidades.Puntos;
import Servicio.PuntosServicio;

/**
 *
 * @author hesca
 */
public class Ej2extraPOOPuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PuntosServicio ps =new PuntosServicio();
        Puntos p =ps.crearPuntos();
        System.out.println("La distancia entre los puntos señalados es de "+ps.calcular(p));
    }
    
}

/* Distancia entre puntos (-3,0) y (-4,6) = raíz de 37
   Distancia entre puntos (1,2) y (-3,4)  = 2*raíz de 5
*/