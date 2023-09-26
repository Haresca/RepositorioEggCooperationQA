/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class NIFServicio {

    Scanner leer = new Scanner(System.in);

    public NIF crearNif() {
        String letras[] = new String[]{"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D",
            "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        long DNI = 0;
        do {
            System.out.println("Ingrese su DNI correspondiente:");
            DNI = leer.nextLong();
            if (String.valueOf(DNI).length() > 8) {
                System.out.println("El DNI debe contener máximo ocho dígitos. Vuelva a digitarlo.");
            }
        } while (String.valueOf(DNI).length() > 8);

        int res = (int) DNI % 23;
        String letra = letras[res];
        NIF n = new NIF();
        n.setDNI(DNI);
        n.setLetra(letra);

        return n;
    }

    public void mostrar(NIF n) {
        System.out.print("El NIF generado es ");
        if (String.valueOf(n.getDNI()).length() < 8) {
            for (int i = 0; i < 8 - String.valueOf(n.getDNI()).length(); i++) {
                System.out.print("0");
            }
        }
        System.out.println(n.getDNI()+"-"+n.getLetra()); 
    }
}
