/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class PuntosServicio {
    Scanner leer =new Scanner(System.in).useDelimiter("\n");
    
    public Puntos crearPuntos(){
        
        System.out.println("Ingrese la coordenada X del punto 1: ");
        double X1 = leer.nextDouble();
        System.out.println("Ingrese la coordenada Y del punto 1: ");
        double Y1 = leer.nextDouble();      
        System.out.println("Ingrese la coordenada X del punto 2: ");
        double X2 = leer.nextDouble();
        System.out.println("Ingrese la coordenada X del punto 2: ");
        double Y2 = leer.nextDouble();
        
        Puntos P = new Puntos();

        P.setX1(X1);
        P.setY1(Y1);
        P.setX2(X2);
        P.setY2(Y2);
        
        return P;
    }
    
    public double calcular(Puntos p){
        return Math.sqrt((Math.pow((p.getX2()-p.getX1()),2))+(Math.pow((p.getY2()-p.getY1()),2)));
    }
}

