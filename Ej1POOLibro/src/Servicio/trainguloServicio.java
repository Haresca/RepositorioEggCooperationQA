package Servicios;

import Entidades.Triangulo;

import java.util.Scanner;

public class trainguloServicio {

    public static Triangulo crearObjeto(){
        Scanner r = new Scanner(System.in);
        System.out.println("Va a ser equilatero, largá el lado");
        int lado1 = r.nextInt();
        return new Triangulo(lado1);
    }

    public void calcSuperficie(Triangulo t){
        int p = ((t.getLado1()*t.getLado1())/2);
        System.out.println("El area es: "+p);
    }
    public void calcPerimetro(Triangulo t){
        int p = t.getLado1()*3;
        System.out.println("El perímetro es: "+p);
    }
}
