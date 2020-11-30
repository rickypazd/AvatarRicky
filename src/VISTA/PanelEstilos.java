package VISTA;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Estilo.Estilo;
import Partes.ListaPartesCuerpo;

public class PanelEstilos extends JPanel {

    private PanelAvatar panelAvatar;

    private JButton btnGuardar;
    
    private JButton btnAtrasArriba;
    private JButton btnAdelanteArriba;
    private JLabel lblCategoria;
    private JButton btnVerLista;
    private int pcSelectIndex;

    public PanelEstilos(PanelAvatar panelAvatar) {
        this.panelAvatar = panelAvatar;
        this.setBounds(340, 0, 460, 600);
        this.setVisible(true);
        this.setLayout(null);
        // setBackground(Color.t);
        setMenuCategoria();
        setListaEstilos();
        this.repaint();

        btnGuardar = new JButton();
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBounds(100, 500, 80, 40);
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                new VentanaGuardar(panelAvatar.getAVATAR());
            }
        });
        this.add(btnGuardar);
        btnVerLista = new JButton();
        btnVerLista.setText("VER AVATARES");
        btnVerLista.setBounds(300, 500, 80, 40);
        btnVerLista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                new VentanaListaAvatares(panelAvatar.getVentanaInicio());
            }
        });
        this.add(btnVerLista);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

    }

    public void setMenuCategoria() {
        // boton atras arriba
        btnAtrasArriba = new JButton();
        btnAtrasArriba.setText("<");
        btnAtrasArriba.setBounds(10, 10, 80, 40);
        btnAtrasArriba.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                pcSelectIndex--;
                if (pcSelectIndex < 0) {
                    pcSelectIndex = ListaPartesCuerpo.size() - 1;
                }
                panelAvatar.setParteCuerpoSelect(ListaPartesCuerpo.get(pcSelectIndex));
                lblCategoria.setText(panelAvatar.getParteCuerpoSelect().getNombre());
                setListaEstilos();
                panelAvatar.repaint();

            }
        });
        this.add(btnAtrasArriba);
        // boton adelante arriba
        btnAdelanteArriba = new JButton();
        btnAdelanteArriba.setText(">");
        btnAdelanteArriba.setBounds(370, 10, 80, 40);
        btnAdelanteArriba.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                pcSelectIndex++;
                if (pcSelectIndex >= ListaPartesCuerpo.size()) {
                    pcSelectIndex = 0;
                }
                panelAvatar.setParteCuerpoSelect(ListaPartesCuerpo.get(pcSelectIndex));
                lblCategoria.setText(panelAvatar.getParteCuerpoSelect().getNombre());
                setListaEstilos();
                panelAvatar.repaint();
            }
        });
        this.add(btnAdelanteArriba);
        // etiqueta Categoria
        lblCategoria = new JLabel();
        pcSelectIndex = panelAvatar.getParteCuerpoSelect().getIndex();
        lblCategoria.setText(panelAvatar.getParteCuerpoSelect().getNombre());
        lblCategoria.setFont(new Font("Arial", Font.PLAIN, 20));
        lblCategoria.setHorizontalAlignment(SwingConstants.CENTER);
        lblCategoria.setVerticalAlignment(SwingConstants.CENTER);
        lblCategoria.setBounds(90, 10, 300, 40);
        this.add(lblCategoria);
        this.repaint();
    }

    private ArrayList<PanelEstiloItem> lbles;
    public void setListaEstilos() {
        ArrayList<Estilo> estilos = panelAvatar.getParteCuerpoSelect().getDATA();
        if(lbles!=null){
            for (PanelEstiloItem label : lbles) {
                this.remove(label);
            }
        }
        lbles= new ArrayList<>();
        int i = 0;
        int x = 10;
        int y = 10;
        for (Estilo estilo : estilos) {
            PanelEstiloItem lbl = new PanelEstiloItem(this,estilo);
            if (i % 4 == 0) {
                y += 100;
                x = 10;
            }
            lbl.setBounds(x, y, 90, 90);
            x += 100;
            lbles.add(lbl);
            this.add(lbl);
            i++;
        }
    }

    public void onClickEstilo(Estilo estilo){
        panelAvatar.ChangeEstilo(estilo);
    }
}
