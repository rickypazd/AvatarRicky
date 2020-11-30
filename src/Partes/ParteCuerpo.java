package Partes;

import java.util.ArrayList;

import Estilo.Estilo;
import java.awt.Graphics;
import java.io.Serializable;

public class ParteCuerpo implements Comparable, Serializable{

    private int index;
    private String nombre;
    private int zIndex;
    private ArrayList<Estilo> DATA;

    public ParteCuerpo(String nombre, int zIndex) {
        this.nombre = nombre;
        this.zIndex = zIndex;
        DATA = new ArrayList<>();
        ListaPartesCuerpo.setDATA(this);
    }

    public int getIndex() {
        return index;
    }

    public String getNombre() {
        return nombre;
    }

    public int getzIndex() {
        return zIndex;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setzIndex(int zIndex) {
        this.zIndex = zIndex;
    }

    public void setEstilo(Estilo estilo) {
        estilo.setIndex(this.DATA.size());
        this.DATA.add(estilo);
        estilo.setParteCuerpo(this);
       
    }

    public ArrayList<Estilo> getDATA() {
        return DATA;
    }
    public void setDATA(ArrayList<Estilo> dATA) {
        DATA = dATA;
    }


    @Override
    public int compareTo(Object o) {
        ParteCuerpo parteCuerpo = (ParteCuerpo)o;       
        return parteCuerpo.getzIndex();
    }
}
