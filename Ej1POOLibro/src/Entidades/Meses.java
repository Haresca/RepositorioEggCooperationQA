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
public class Meses {
    private static String [] mesesanio = {"enero","febrero","marzo","abril","mayo","junio",
    "julio","agosto","septiembre","octubre","noviembre","diciembre"};
    private String mesSecreto= mesesanio[11];

    public static String[] getMesesanio() {
        return mesesanio;
    }

    public static void setMesesanio(String[] mesesanio) {
        Meses.mesesanio = mesesanio;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    
}
