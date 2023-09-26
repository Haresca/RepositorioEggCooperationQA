package Entidades;

public class PentaHex {
    private double lado;
    private double apotema;

    public PentaHex(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    public PentaHex() {
    }

    public double getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(int apotema) {
        this.apotema = apotema;
    }
}
