package Entities;

public abstract class Dispositivo {

    protected int consumoEnergiaAsociado;

    public boolean daniado;

    
    public Dispositivo() {
    }

    
    public Dispositivo(int consumoEnergiaAsociado, boolean daniado) {
        this.consumoEnergiaAsociado = consumoEnergiaAsociado;
        this.daniado = daniado;
    }

    
    public abstract int usar(String intensidad, int tiempo);

    public boolean isDaniado() {
        return daniado;
    }

    public void setDaniado(boolean daniado) {
        this.daniado = daniado;
    }
    
    public void sufriendoDanios() {
        double probabilidadReparar = Math.random();
        if (probabilidadReparar<=0.3 && !daniado){
            setDaniado(true);
        }
    }
    
    public void repararDanios() {
        double probabilidadReparar = Math.random();
        if (probabilidadReparar<=0.4 && daniado){
            setDaniado(false);
        }
    }
    
    public boolean revisarDispositivo() {
        
        if(isDaniado()) {
            double probabilidadReparar;
            do {
                probabilidadReparar = Math.random();
                repararDanios();
            } while (probabilidadReparar>0.3 && isDaniado());
        } 
        return isDaniado();
    }
        
    
    
    
}
