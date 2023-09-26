/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class RectanguloServicio {
    
  
    

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Rectangulo crearRectangulo() {
        Rectangulo r1 = new Rectangulo();
        System.out.println("Ingrese el tamaño de la base: ");
        r1.setBase(leer.nextInt());
        System.out.println("Ingrese el tamaño de la altura: ");
        r1.setAltura(leer.nextInt());

        return r1;
    }

    public int calcularSuperficie(Rectangulo r1) {
        return (r1.getBase() * r1.getAltura());
    }
    
  /*  public void calcularSuperficie(Rectangulo r1) {
        System.out.println(r1.getAltura());
        System.out.println(r1.getBase());
        int superficie = r1.getBase() * r1.getAltura();
        System.out.println("La superficie del rectángulo es de " + superficie + " unidades cuadradas.");
    }  */

    public int calcularPerimetro(Rectangulo r1) {
        return (r1.getBase() * 2) + (r1.getAltura() * 2);
    }
    
    /*public void calcularPerimetro(Rectangulo r1) {
        int perimetro = (r1.getBase() * 2) + (r1.getAltura() * 2);
        System.out.println("El perímetro del rectángulo es de " + perimetro + " unidades.");
    }  */

    public void dibujarRectangulo(Rectangulo r1) {
        for (int i = 0; i < r1.getAltura(); i++) {
            for (int j = 0; j < r1.getBase(); j++) {
                if (i == 0 || i == r1.getAltura() - 1 || j == 0 || j == r1.getBase() - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

}
