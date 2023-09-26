package Entities;

public class Guante extends Dispositivo {

    public Guante() {
    }

    public Guante(int consumoEnergiaAsociado, boolean daniado) {
        super(consumoEnergiaAsociado, daniado);
    }

    public int getConsumoEnergiaAsociado() {
        return consumoEnergiaAsociado;
    }

    public void setConsumoEnergiaAsociado(int consumoEnergiaAsociado) {
        this.consumoEnergiaAsociado = consumoEnergiaAsociado;
    }

    public boolean isDaniado() {
        return daniado;
    }

    public void setDaniado(boolean daniado) {
        this.daniado = daniado;
    }
    
    

    @Override
    public int usar(String intensidad, int tiempo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
