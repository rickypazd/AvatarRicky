package VISTA;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import MODELO.Usuario;

import static javax.swing.JOptionPane.showMessageDialog;

public class PanelGuardarAvatar extends JPanel {

    public static PanelGuardarAvatar INSTANCE;
    Usuario Dato;

    public static JPanel getInstance(VentanaGuardar ventana) {
        INSTANCE = new PanelGuardarAvatar(ventana);
        return INSTANCE;
    }

    private VentanaGuardar ventanaGuardar;
    private JLabel lbusuario;
    private JLabel lbcontra;
    private JTextField usuario;
    private JTextField password;
    private JButton btnIniciar;
    private JButton btnRegistro;

    public PanelGuardarAvatar(VentanaGuardar ventanaGuardar) {

        this.ventanaGuardar = ventanaGuardar;
        this.setBackground(Color.GRAY);
        this.setBounds(0, 0, 400, 400);
        this.setVisible(true);
        this.setLayout(null);

        lbusuario = new JLabel("NOMBRE DE AVATAR");
        lbusuario.setBounds(10, 20, 300, 50);
        this.add(lbusuario);
        
        usuario = new JTextField();
        usuario.setBounds(10, 80, 300, 50);
        usuario.setText(ventanaGuardar.getAVATAR().getNombre());
        this.add(usuario);


        btnIniciar = new JButton("GUARDAR");
        btnIniciar.setBounds(10, 260, 200, 50);

        btnRegistro = new JButton("CERRAR SESION");
        btnRegistro.setBounds(10, 310, 200, 50);

        this.add(btnIniciar);
        this.add(btnRegistro);

        btnIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                //guardar
                String usr = usuario.getText();
                ventanaGuardar.getAVATAR().setNombre(usr);
                ventanaGuardar.getAVATAR().save(Usuario.Usuariolog);
                ventanaGuardar.dispose();
                

            }
        });

        btnRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                    //cerrar

            }
        });
        this.repaint();
    }

    public void setDato(String dato) {
        Usuario usr = Usuario.DATA.get(dato);
        Dato = usr;
    }

    public Usuario getDato() {
        return Dato;
    }

    private boolean login(String pass) {

        // Usuario usuario = Usuario.DATA.get(usr);
        // showMessageDialog(null, usuario);
        Usuario usuario = getDato();
        if (usuario == null) {
            return false;
        }
        if (!usuario.getPass().equals(pass)) {
            return false;
        }
        return true;
    }

}
