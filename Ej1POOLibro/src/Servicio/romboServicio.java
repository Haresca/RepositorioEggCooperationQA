package Servicios;

import Entidades.Rombo;

import java.util.Scanner;

public class romboServicio {

    public static Rombo crearObjeto(){
        Scanner r = new Scanner(System.in);
        System.out.println("Ingrese la longitud de un lado");
        double lado = r.nextDouble();
        System.out.println("Ingrese la diagonal mayor");
        double diagonalMayor = r.nextDouble();
        System.out.println("Ingrese la diagonal menor");
        double diagonalMenor = r.nextDouble();

        return new Rombo(lado,diagonalMayor, diagonalMenor);
    }

    public void calcularArea(Rombo r) {
        double p = (r.getDiagonalMayor() * r.getDiagonalMenor()) / 2;
        System.out.print("El área del rombo es: ");
        System.out.print(p +"\n");
    }

    public void calcularPerimetro(Rombo r){
        double p = (r.getLado()*4);
        System.out.print("El perímetro del rombo es: ");
        System.out.print(p+"\n");
    }
}
