package Entities;

import Enums.Material;
import Interfaces.Acciones;
import java.util.ArrayList;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

public class Armadura implements Acciones {

    private String colorPrimario;

    private String colorSecundario;

    private int nivelResistencia;

    private int nivelSalud;

    private int bateria;

    private Generador generador;

    private ArrayList<Dispositivo> listaDispositivos;

    private Casco casco;

    private Material material;

    public Armadura() {
        listaDispositivos = new ArrayList<>();
        this.generador = new Generador();
        this.bateria = generador.getEnergiaDisponible();
        this.listaDispositivos.add(new Bota(100, false));
        this.listaDispositivos.add(new Bota(100, false));
        this.listaDispositivos.add(new Guante(50, true));
        this.listaDispositivos.add(new Guante(50, false));
        this.casco = new Casco(new Consola(30, false), new Sintetizador(20, false));
        this.colorPrimario = "Rojo";
        this.colorSecundario = "Dorado";
        this.material = Material.ACERO;
        this.nivelSalud = 100;
        this.nivelResistencia = 60;
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public int getNivelResistencia() {
        return nivelResistencia;
    }

    public void setNivelResistencia(int nivelResistencia) {
        this.nivelResistencia = nivelResistencia;
    }

    public int getNivelSalud() {
        return nivelSalud;
    }

    public void setNivelSalud(int nivelSalud) {
        this.nivelSalud = nivelSalud;
    }

    public int getBateria() {
        return generador.getEnergiaDisponible();
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public Generador getGenerador() {
        return generador;
    }

    public void setGenerador(Generador generador) {
        this.generador = generador;
    }

    public ArrayList<Dispositivo> getListaDispositivos() {
        return listaDispositivos;
    }

    public void setListaDispositivos(ArrayList<Dispositivo> listaDispositivos) {
        this.listaDispositivos = listaDispositivos;
    }

    public Casco getCasco() {
        return casco;
    }

    public void setCasco(Casco casco) {
        this.casco = casco;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void informarAlGenerador(int energiaConsumida) {
        generador.setEnergiaDisponible(generador.getEnergiaDisponible() - energiaConsumida);
    }

    @Override
    public void caminar(int tiempo) {
        for (Dispositivo dispositivo : listaDispositivos) {
            if (dispositivo instanceof Bota) {
                informarAlGenerador(((Bota) dispositivo).getConsumoEnergiaAsociado() * tiempo);
                dispositivo.sufriendoDanios();
            }
        }

    }

    @Override
    public void correr(int tiempo) {
        for (Dispositivo dispositivo : listaDispositivos) {

            if (dispositivo instanceof Bota && !dispositivo.revisarDispositivo()) {
                informarAlGenerador(((Bota) dispositivo).getConsumoEnergiaAsociado() * tiempo * 2);
                dispositivo.sufriendoDanios();
            }
        }
    }

    @Override
    public void propulsar(int tiempo) {
        for (Dispositivo dispositivo : listaDispositivos) {
            if (dispositivo instanceof Bota && !dispositivo.revisarDispositivo()) {
                informarAlGenerador(((Bota) dispositivo).getConsumoEnergiaAsociado() * tiempo * 3);;
                dispositivo.sufriendoDanios();
            }
        }

    }

    @Override
    public void volar(int tiempo) {
        for (Dispositivo dispositivo : listaDispositivos) {
            if (dispositivo instanceof Bota && !dispositivo.revisarDispositivo()) {
                informarAlGenerador(((Bota) dispositivo).getConsumoEnergiaAsociado() * tiempo * 3);
                dispositivo.sufriendoDanios();
            }
            if (dispositivo instanceof Guante && !dispositivo.revisarDispositivo()) {
                informarAlGenerador(((Guante) dispositivo).getConsumoEnergiaAsociado() * tiempo * 2);
                dispositivo.sufriendoDanios();
            }
        }

    }

    @Override
    public void disparar(int tiempo) {
        for (Dispositivo dispositivo : listaDispositivos) {
            if (dispositivo instanceof Guante && !dispositivo.revisarDispositivo()) {
                informarAlGenerador(((Guante) dispositivo).getConsumoEnergiaAsociado() * tiempo * 3);
                dispositivo.sufriendoDanios();
            }
        }
    }

    @Override
    public void escribir() {
        if (!casco.getConsola().revisarDispositivo()) {
            informarAlGenerador(casco.getConsola().consumoEnergiaAsociado);
            casco.getConsola().sufriendoDanios();
        }
    }

    @Override
    public void leer() {
        if (!casco.getSintetizador().revisarDispositivo()) {
            informarAlGenerador(casco.getSintetizador().consumoEnergiaAsociado);
            casco.getSintetizador().sufriendoDanios();
        }
    }

    @Override
    public String toString() {
        return "Armadura{" + "colorPrimario=" + colorPrimario + ", colorSecundario=" + colorSecundario + ", nivelResistencia=" + nivelResistencia + ", nivelSalud=" + nivelSalud + ", bateria=" + bateria + ", generador=" + generador + ", listaDispositivos=" + listaDispositivos + ", casco=" + casco + ", material=" + material + '}';
    }
    
    
}
