package Entities;

public class Generador {

    private int energiaDisponible;
    private final float capacidadTotalBateria = Float.MAX_VALUE;

    public Generador() {
        this.energiaDisponible=(int)this.capacidadTotalBateria;
    }

    public Generador(int energiaDisponible) {
        this.energiaDisponible = energiaDisponible;
    }

    public int getEnergiaDisponible() {
        return energiaDisponible;
    }

    public void setEnergiaDisponible(int energiaDisponible) {
        this.energiaDisponible = energiaDisponible;
    }

    public float getCapacidadTotalBateria() {
        return capacidadTotalBateria;
    }

    

    
    
    
    
    
}
