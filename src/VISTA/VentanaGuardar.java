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

public class VentanaGuardar extends JFrame {

    private JMenu menu;
    private JMenuItem usuarios, listas, avatares;
    VentanaGuardar ventana;
    private Avatar AVATAR;
    public VentanaGuardar(Avatar avatar) {
        this.AVATAR = avatar;
        // this.setDefaultCloseOperation(DI);
        this.setSize(400, 400);
        this.setLayout(null);
        this.setLocationRelativeTo(null);

        this.setResizable(false);
        this.setVisible(true);
        this.ventana = this;
        if(Usuario.Usuariolog==null){
            mostrarPanel(PanelLogin.getInstance(this));
        }else{
            mostrarPanel(PanelGuardarAvatar.getInstance(this));
        }

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

    public Avatar getAVATAR() {
        return AVATAR;
    }
}
