package VISTA;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;

import AVATAR.Avatar;
import Estilo.Estilo;
import Partes.ListaPartesCuerpo;
import Partes.ParteCuerpo;

public class PanelEstiloItem extends JPanel implements MouseListener {

    private PanelEstilos PanelEstilo;

    private ParteCuerpo parteCuerpoSelect;

    private Estilo estilo;
    public PanelEstiloItem(PanelEstilos panelEstilos,Estilo estilo) {
        this.estilo = estilo;
        this.PanelEstilo = panelEstilos;
        this.setVisible(true);
        this.setLayout(null);
        this.repaint();
        this.setBackground(Color.decode("#FFFFFF"));
        this.addMouseListener(this);
  
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(estilo.getImage(),0, 0, 80,80, null);
    }

	@Override
	public void mouseClicked(MouseEvent e) {
		PanelEstilo.onClickEstilo(this.estilo);
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
