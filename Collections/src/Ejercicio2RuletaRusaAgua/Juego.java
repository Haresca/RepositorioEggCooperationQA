package Ejercicio2RuletaRusaAgua;

import java.util.*;

public class Juego {

	private ServicioRevolver revolver;
	private ArrayList<Jugador> jugadores = new ArrayList<>();

	public Juego() {

	}

	public Juego(ServicioRevolver revolver, ArrayList<Jugador> jugadores) {
		super();
		this.revolver = revolver;
		this.jugadores = jugadores;
	}

	public ServicioRevolver getRevolver() {
		return revolver;
	}

	public void setRevolver(ServicioRevolver revolver) {
		this.revolver = revolver;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	@Override
	public String toString() {
		return "Juego [revolver=" + revolver + ", jugadores=" + jugadores + "]";
	}

}
