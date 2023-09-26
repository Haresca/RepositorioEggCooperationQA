package Ejercicio2RuletaRusaAgua;

public class Revolver {

	private int posicionTambor;
	private int posicionAgua;
	private int[] posiciones;

	public Revolver() {
	}

	public Revolver(int posicionTambor, int posicionAgua, int[] posiciones) {
		super();
		this.posicionTambor = posicionTambor;
		this.posicionAgua = posicionAgua;
		this.posiciones = posiciones;
	}

	public int getPosicionTambor() {
		return posicionTambor;
	}

	public void setPosicionTambor(int posicionTambor) {
		this.posicionTambor = posicionTambor;
	}

	public int getPosicionAgua() {
		return posicionAgua;
	}

	public void setPosicionAgua(int posicionAgua) {
		this.posicionAgua = posicionAgua;
	}

	public int[] getPosiciones() {
		return posiciones;
	}

	public void setPosiciones(int[] posiciones) {
		this.posiciones = posiciones;
	}

	@Override
	public String toString() {
		return "Revolver [posicionTambor=" + posicionTambor + ", posicionAgua=" + posicionAgua + "]";
	}

}
