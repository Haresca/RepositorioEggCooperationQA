package Ejercicio2RuletaRusaAgua;


public class ServicioJugador {

	public boolean disparo(ServicioRevolver sr) {

		Jugador jugador = new Jugador();

		if (!sr.mojar()) {
			System.out.println("¡¡TE SALVASTE!!" +"\nSiguiente jugador:");
			sr.siguienteChorro();
		} else if(sr.mojar()){
			System.out.println("¡¡TE MOJASTE!!");
			jugador.setMojado(true);
		}

		return jugador.isMojado();

	}

}
