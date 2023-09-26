package Servicios;

import Entidades.CuaRecTri;

import java.util.Scanner;

public class cuaRecTriServicio {
    public static CuaRecTri crearObjeto(){
        Scanner r = new Scanner(System.in);
        System.out.println("Ingrese la base");
        int base = r.nextInt();
        System.out.println("Ingrese la altura");
        int altura = r.nextInt();
        return new CuaRecTri(base,altura);
    }

    public void calculoSuperficie(CuaRecTri r) {
        int p = (r.getBase() * r.getAltura());
        System.out.println("El area es: "+p);
    }

    public void calculoPerimetro(CuaRecTri r){
        int p;
        p = (r.getBase() + r.getAltura()) * 2;
        System.out.println("El perímetro es: ");
    }

}

