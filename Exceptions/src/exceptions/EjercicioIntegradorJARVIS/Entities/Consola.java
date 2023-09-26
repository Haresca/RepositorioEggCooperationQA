package Entities;

public class Consola extends Dispositivo {

    private String informacion;

    public Consola() {
    }

    public Consola(int consumoEnergiaAsociado, boolean daniado) {
        super(consumoEnergiaAsociado, daniado);
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }
    
    

    @Override
    public int usar(String intensidad, int tiempo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
