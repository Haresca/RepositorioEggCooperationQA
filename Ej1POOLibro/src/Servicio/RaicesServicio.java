/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class RaicesServicio {

    Scanner leer = new Scanner(System.in);

    public double getDiscriminante(Raices r) {
        return Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC());
    }

    public boolean tieneRaices(double d) {  //2 soluciones
        return d >= 0;
    }

    public boolean tieneRaiz(double d) {  //1 solución
        return d == 0;
    }
    
    public void obtenerRaices(Raices r){
        double solu1=0;
        double solu2=0;    
        if(tieneRaices(getDiscriminante(r))){
            solu1 = (-r.getB()+Math.sqrt(getDiscriminante(r)))/(2*r.getA());
            solu2 = (-r.getB()-Math.sqrt(getDiscriminante(r)))/(2*r.getA());           
        }
        System.out.println("Solución 1="+solu1);
        System.out.println("Solución 2="+solu2);
    }
    
    public void obtenerRaiz(Raices r){
        double solu1=0;
        if(tieneRaiz(getDiscriminante(r))){
            solu1 = -r.getB()/(2*r.getA());
        }
        System.out.println("Solución 1="+solu1);
    }    
    
    public void calcular(Raices r){
        if(tieneRaices(getDiscriminante(r))){
            obtenerRaices(r);
        } else if(tieneRaiz(getDiscriminante(r))){
            obtenerRaiz(r);
        } else System.out.println("No existen soluciones reales para la ecuación.");
    }  
    
}


