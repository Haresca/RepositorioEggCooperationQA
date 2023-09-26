package Entities;

public class Bota extends Dispositivo {

    public Bota() {
    }

    public Bota(int consumoEnergiaAsociado, boolean daniado) {
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
    public void repararDanios() {
        super.repararDanios();
    }

    
    @Override
    public int usar(String intensidad, int tiempo) {
        int multiplicador=0;
        switch (intensidad) {
            case "básico":
                multiplicador=1;
            case "normal":
                multiplicador=2;
            case "intensivo":
                multiplicador=3;
        }
        return this.consumoEnergiaAsociado*tiempo*multiplicador;
    }
}
