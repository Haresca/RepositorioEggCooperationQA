package Services;


import Entities.Armadura;

public class JarvisService {

    public JarvisService() {
    }

    

    public void mostrandoEstado(Armadura armadura) {
    }

    public void estadoBateria(Armadura armadura) {
        
        String mgs=Double.toString((armadura.getGenerador().getEnergiaDisponible()/armadura.getGenerador().getCapacidadTotalBateria())*100);
        armadura.getCasco().getConsola().setInformacion("Nivel de Batería= "+mgs+"%");
        
    }

    public void estadoReactor(Armadura armadura) {
        String mgs=Double.toString(armadura.getGenerador().getEnergiaDisponible()*0.00134);
        armadura.getCasco().getConsola().setInformacion("Nivel de Batería= "+mgs+" caballos de fuerza");
        mgs=Double.toString(armadura.getGenerador().getEnergiaDisponible()/1000);
        armadura.getCasco().getConsola().setInformacion("Nivel de Batería= "+mgs+" KiloWatts");
        
    }

    public void revisarDispositivos(Armadura armadura) {
    }
}
