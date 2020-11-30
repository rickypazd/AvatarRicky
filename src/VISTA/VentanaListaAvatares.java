package VISTA;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import AVATAR.Avatar;
import MODELO.Usuario;

public class VentanaListaAvatares extends JFrame {

    private JMenu menu;
    private JMenuItem usuarios, listas, avatares;
    public VentanaListaAvatares(VentanaInicio ventanaInicio) {
        // this.setDefaultCloseOperation(DI);
        this.setTitle("Lista de avatares");
        this.setSize(400, 600);
        this.setLayout(null);

        this.setResizable(false);
        this.setVisible(true);
        mostrarPanel(new PanelAvatarList(ventanaInicio));

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
