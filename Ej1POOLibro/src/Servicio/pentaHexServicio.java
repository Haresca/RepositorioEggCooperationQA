package Servicios;

import Entidades.PentaHex;

import java.util.Scanner;

public class pentaHexServicio {

    public static PentaHex crearObjeto(){
        Scanner r = new Scanner(System.in);
        System.out.println("Ingrese uno de los lados (Todos van a ser iguales)");
        double lado = r.nextDouble();
        System.out.println("Ingrese la apotema");
        double apotema = r.nextDouble();
        return new PentaHex(lado, apotema);
    }
    public double calcPerim(PentaHex ph, String tipo){
        double p;
        if(tipo.equalsIgnoreCase("pentagono")){
            p = ph.getLado()*5;
        }else{
            p = ph.getLado()*6;
        }


        System.out.println("El perimetro es: "+ p);
        return p;

    }
    //ph.calcArea(ph1,"pentagono",ph.calcPerim(ph1,"pentagono"));
    public void calcArea(PentaHex ph, String tipo){
        double p;
        if(tipo.equalsIgnoreCase("pentagono")){

        }

    }

}
