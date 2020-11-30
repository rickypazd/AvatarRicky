package VISTA;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import AVATAR.Avatar;
import Estilo.Estilo;
import Partes.ListaPartesCuerpo;
import Partes.ParteCuerpo;

public class PanelAvatar extends JPanel {

    private VentanaInicio ventanaInicio;
    private PanelEstilos PanelEstilo;
    private Avatar AVATAR;
    private JButton btnGuardar;

    private ParteCuerpo parteCuerpoSelect;

    public PanelAvatar(VentanaInicio ventanaInicio,Avatar avatar) {
        this.ventanaInicio = ventanaInicio;
        this.setBackground(Color.GRAY);
        this.setBounds(0, 0, 800, 600);
        this.setVisible(true);
        this.setLayout(null);
        parteCuerpoSelect = ListaPartesCuerpo.getDATA().get("Polera");



        AVATAR =avatar;
        PanelEstilo = new PanelEstilos(this);
        this.add(PanelEstilo);
        this.repaint();

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        pintarFondo(g);
        AVATAR.paint(g);

    }

    public void pintarFondo(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        Color color1 = Color.decode("#6A9113");
        Color color2 = Color.decode("#141517");
        GradientPaint gp = new GradientPaint(0, 0, color1, 0, h, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
        PanelEstilo.repaint();
    }

    public void setVentanaInicio(VentanaInicio ventanaInicio) {
        this.ventanaInicio = ventanaInicio;
    }

    public void setParteCuerpoSelect(ParteCuerpo parteCuerpoSelect) {
        this.parteCuerpoSelect = parteCuerpoSelect;
    }

    public ParteCuerpo getParteCuerpoSelect() {
        return parteCuerpoSelect;
    }
    public void setAVATAR(Avatar aVATAR) {
        AVATAR = aVATAR;
    }
    public Avatar getAVATAR() {
        return AVATAR;
    }

    public VentanaInicio getVentanaInicio() {
        return ventanaInicio;
    }
    public void ChangeEstilo(Estilo estilo) {
        AVATAR.setEstilo(estilo);
        this.repaint();
    }
}
