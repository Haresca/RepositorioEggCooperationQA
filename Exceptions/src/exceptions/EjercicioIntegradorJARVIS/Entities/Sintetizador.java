package Entities;


import Entities.Dispositivo;

public class Sintetizador extends Dispositivo {

    private String susurro;

    public Sintetizador() {
    }

    public Sintetizador(int consumoEnergiaAsociado, boolean daniado) {
        super(consumoEnergiaAsociado, daniado);
    }

    @Override
    public int usar(String intensidad, int tiempo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
