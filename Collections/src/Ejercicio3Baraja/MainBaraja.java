/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3Baraja;

import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class MainBaraja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioBaraja sb = new ServicioBaraja();
        sb.crearBaraja();
        sb.barajar();

        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido al juego de cartas contra la computadora!");

        while (sb.cartasDisponibles() > 0) {
            System.out.println("Presiona Enter para tomar una carta...");
            scanner.nextLine();

            Carta cartaJugador = sb.siguienteCarta();
            System.out.println("Tu carta:"+cartaJugador);

            Carta cartaComputadora = sb.siguienteCarta();
            System.out.println("Carta de la computadora:"+cartaComputadora);

            if (cartaJugador.getNumero() > cartaComputadora.getNumero()) {
                System.out.println("¡Ganaste!");
            } else if (cartaJugador.getNumero() < cartaComputadora.getNumero()) {
                System.out.println("¡La computadora ganó!");
            } else {
                System.out.println("Empate");
            }

            System.out.println("Cartas restantes en la baraja: " + sb.cartasDisponibles());
            System.out.println("Presiona Enter para continuar o escribe 'salir' para terminar.");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("salir")) {
                break;
            }
        }

        System.out.println("¡Gracias por jugar!");
    }
}
