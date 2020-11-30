package VISTA;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import AVATAR.Avatar;

public class VentanaInicio extends JFrame {

    private JMenu menu;
    private JMenuItem usuarios, listas, avatares;
    VentanaInicio ventana;

    public VentanaInicio() {

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setLayout(null);
        this.setLocationRelativeTo(null);

        this.setResizable(false);
        this.setVisible(true);

        this.ventana = this;
        
        mostrarPanel(new PanelAvatar(this,new Avatar("MyAbatar")));
    }

    private JPanel selected;

    public void mostrarPanel(JPanel panel) {
        if (selected != null) {
            this.remove(selected);
        }
        selected = panel;
        this.add(panel);
        this.repaint();

    }

}
