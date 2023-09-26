/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author hesca
 */
public class Cuenta {
    private int numeroCuenta;
    private long DNIcliente;
    private int saldoActual;
    private double interes;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long DNIcliente, int saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.DNIcliente = DNIcliente;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNIcliente() {
        return DNIcliente;
    }

    public void setDNIcliente(long DNIcliente) {
        this.DNIcliente = DNIcliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "Número de Cuenta:" + numeroCuenta + ", DNI de cliente:" + DNIcliente + ", Saldo Actual: $" + saldoActual + ", Interés:" + interes + "% "+'}';
    }
    
    
}
