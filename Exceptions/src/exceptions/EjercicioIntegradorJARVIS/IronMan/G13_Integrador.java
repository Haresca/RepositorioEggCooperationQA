/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package IronMan;

import Entities.Armadura;
import Services.JarvisService;

/**
 *
 * @author brian
 */
public class G13_Integrador {

    public static void main(String[] args) {
        
        Armadura IronMan = new Armadura();
        JarvisService Jarvis= new JarvisService();
        System.out.println(IronMan);
        System.out.println("-----------");
        IronMan.caminar(50);
        Jarvis.estadoBateria(IronMan);
        System.out.println(IronMan.getCasco().getConsola().getInformacion());
        IronMan.correr(10000);
        Jarvis.estadoBateria(IronMan);
        System.out.println(IronMan.getCasco().getConsola().getInformacion());
        IronMan.disparar(50000);
        Jarvis.estadoBateria(IronMan);
        System.out.println(IronMan.getCasco().getConsola().getInformacion());
        IronMan.volar(4890);
        Jarvis.estadoBateria(IronMan);
        System.out.println(IronMan.getCasco().getConsola().getInformacion());
        IronMan.propulsar(4821);
        Jarvis.estadoBateria(IronMan);
        System.out.println(IronMan.getCasco().getConsola().getInformacion());
        
        
        
    }
}
