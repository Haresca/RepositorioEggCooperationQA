package Main;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
/*
Cuadrado = base^2
Rectángulo = basexaltura
Triangulo = (basexaltura)/2
Circulo = pi*(radio^2)
Hexágono = lado*6 // la apotema es para el area
Pentágono = lado*5 // la apotema es para el area
Rombo = (diagonalMayor*diagonalMenor)/2
 */
public class desafio2 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int opt;

        System.out.println("**********************");
        System.out.println("Bienvenido a esta calculadura que seguro funciona muy bien");
        System.out.println("Ingrese la figura geométrica con la que nos quiere torturar");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectángulo");
        System.out.println("3. Triangulo");
        System.out.println("4. Círculo");
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
