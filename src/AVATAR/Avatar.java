package AVATAR;

import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import Estilo.Estilo;
import MODELO.Usuario;

import java.awt.Graphics;

public class Avatar implements Serializable {
    // private BufferedImage image;
    private HashMap<String, Estilo> estilos;
    private String nombre;
    private Usuario usr;
    
    public Avatar(String nombre) {
        this.nombre = nombre;
        estilos = new HashMap<>();

    }

    public void paint(Graphics g) {
        BufferedImage image;
        try {
            image = ImageIO.read(new File("./img/personasinRopa.png"));
            g.drawImage(image, 20, 70, 300, 411, null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Map.Entry me : estilos.entrySet()) {
            estilos.get(me.getKey()).paint(g);
        }
    }

    public void setEstilo(Estilo estilo) {
        estilos.put(estilo.getParteCuerpo().getNombre(), estilo);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void save(Usuario usr) {
        this.usr = usr;
        String filename = "./avatares/" + usr.getNombre() + "_" + this.nombre + ".rava";
        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(this);
            out.close();
            file.close();
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }
    }

    public Usuario getUsr() {
        return usr;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "File : "+this.getNombre() + " USR: "+ this.getUsr();
    }
}
