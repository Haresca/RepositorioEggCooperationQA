package Main;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
/*
Cuadrado = base^2
Rect�ngulo = basexaltura
Triangulo = (basexaltura)/2
Circulo = pi*(radio^2)
Hex�gono = lado*6 // la apotema es para el area
Pent�gono = lado*5 // la apotema es para el area
Rombo = (diagonalMayor*diagonalMenor)/2
 */
public class desafio2 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int opt;

        System.out.println("**********************");
        System.out.println("Bienvenido a esta calculadura que seguro funciona muy bien");
        System.out.println("Ingrese la figura geom�trica con la que nos quiere torturar");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rect�ngulo");
        System.out.println("3. Triangulo");
        System.out.println("4. C�rculo");
        System.out.println("5. Pentagono");
        System.out.println("6. Hexagono");
        System.out.println("7. Rombo");
        System.out.println("0. Salir");
        opt = r.nextInt();

        switch (opt){
            case 1:

        }
    }

}
