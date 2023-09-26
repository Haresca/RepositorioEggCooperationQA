package Ejercicio2RuletaRusaAgua;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class ServicioJuego {
	
	ArrayList<Jugador> jugadores = new ArrayList<>();
	
	ServicioRevolver serviceR = new ServicioRevolver();
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
	
	public void llenarJuego(ServicioRevolver sr) {

         
            System.out.println("Ingrese el número de jugadores:");
            int numjug = leer.nextInt();
            if (numjug <2 || numjug>6) {
                numjug=6;
            }
            
               for (int i = 0; i < numjug; i++) {
                   Random random = new Random();
                 //  char randomizedCharacter = (char) (random.nextInt(26) + ('b')*i);
                 //  System.out.println(randomizedCharacter1+i);
                  jugadores.add(new Jugador(i, "Jugador", false));
            }

		Juego juego = new Juego();

		juego.setJugadores(jugadores);
		
		juego.setRevolver(sr);
                
                //System.out.println(juego.toString());

	}
	
	public void ronda() {
            boolean otraronda = false;
             
                System.out.println("---BIENVENIDOS---");
		
		serviceR.llenarRevolver();
		
		ServicioJugador jugadorS = new ServicioJugador();
		for (int i = 0; i < jugadores.size(); i++) {
			System.out.println(jugadores.get(i).getNombre() + (i+1) +"...");
			if(jugadorS.disparo(serviceR)) {
				System.out.println("El juego ha terminado: el participante " + jugadores.get(i).getNombre()+(i+1) + 
						" ha recibido el disparo de agua X( ");
                                break;//return;
			} 
                }
        }
}
//                        if((!jugadorS.disparo(serviceR))&& i==(jugadores.size()-1)){
//                            System.out.println("Ronda terminada. ¿Desean jugar una nueva? S/N");
//                            String respuesta=leer.next();
//                            if (respuesta.equalsIgnoreCase("s")) {
//                                 otraronda=true;
//                            }
//}
//		} 
//            } while (otraronda);
            
		

	


