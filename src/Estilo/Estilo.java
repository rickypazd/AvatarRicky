package Estilo;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;

import javax.imageio.ImageIO;

import Partes.ParteCuerpo;

public class Estilo implements Serializable {
    private String nombre;
    private int index;
    private int x;
    private int y;
    private int width;
    private int height;
    private String url;
    private ParteCuerpo parteCuerpo;

    public Estilo(String nombre, int x, int y, int width, int height, String url) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.url = url;

    }

    public int getHeight() {
        return height;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUrl() {
        return url;
    }

    public int getWidth() {
        return width;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public BufferedImage getImage() {
        try {
            BufferedImage image = ImageIO.read(new File(this.getUrl()));
            return image;
        } catch (IOException e) {
        }
        return null;
    }

    public void setParteCuerpo(ParteCuerpo parteCuerpo) {
        this.parteCuerpo = parteCuerpo;
    }

    public ParteCuerpo getParteCuerpo() {
        return parteCuerpo;
    }

    public void paint(Graphics g) {
        try {
            BufferedImage image = ImageIO.read(new File(this.getUrl()));
            g.drawImage(image, this.getX(), this.getY(), this.getWidth(), this.getHeight(), null);

        } catch (IOException e) {
        }
    }

}
