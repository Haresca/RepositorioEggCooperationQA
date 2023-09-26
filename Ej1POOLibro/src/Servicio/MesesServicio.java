/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Meses;
import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class MesesServicio {
    Scanner leer =new Scanner(System.in).useDelimiter("\n");
    String mespropuesto = "";   
    
        public void adivinarMes(){
            Meses m = new Meses();
            do {
            System.out.println("Intente adivinar el mes secreto, ingresando el mes en minúsculas:");
            String mespropuesto=leer.next();      
            if (mespropuesto.equals(m.getMesSecreto())) {
                System.out.println("Excelente, ha adivinado el mes. ***FIN DEL JUEGO***");    
                break;
            } else System.out.println("No ha adivinado el mes. Pruebe de nuevo...");
            } while (!mespropuesto.equalsIgnoreCase(m.getMesSecreto()));
        }
}
