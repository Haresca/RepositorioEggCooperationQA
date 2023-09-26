package Servicio;

import Entidades.Circulo;

import java.util.Scanner;

public class circuloServicio {

    public static Circulo crearObjeto(){
        Scanner r = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        int radio = r.nextInt();
        return new Circulo(radio);
    }
    public void perimetro(Circulo c){
        float p = (float) (2 * Math.PI * c.getRadio());
        System.out.print("El perimetro de la circunferencia es: ");
        System.out.print(p+"\n");
    }

    public void area (Circulo c){
        float a = (float) (Math.PI*c.getRadio()*c.getRadio());
        System.out.print("El area de la circunferencia es:");
        System.out.print(a+"\n");
    }
}
