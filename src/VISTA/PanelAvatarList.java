package VISTA;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.event.MouseInputAdapter;

import AVATAR.Avatar;

public class PanelAvatarList extends JPanel {

    private PanelAvatarList miInstancia;
    public static PanelAvatarList INSTANCE;


    private VentanaInicio ventanaInicio;
    private JList lista;

    public PanelAvatarList(VentanaInicio ventanaInicio) {
        this.ventanaInicio= ventanaInicio;
        this.setBackground(Color.GRAY);
        this.setBounds(0, 0, 400, 600);
        this.setVisible(true);
        this.setLayout(null);
        miInstancia = this;

        lista = new JList();
        lista.setBounds(0, 0, 400, 600);
        lista.setModel(lista());
        lista.addMouseListener(new MouseInputAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Avatar value = (Avatar)lista.getModel().getElementAt(lista.locationToIndex(e.getPoint()));
                ventanaInicio.mostrarPanel(new PanelAvatar(ventanaInicio,value));
            }
        });
        this.add(lista);
    }

    private DefaultListModel lista() {
        DefaultListModel model = new DefaultListModel();
        String url = "./avatares/";
        File folder = new File(url);
        Avatar avatar;
        for (File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
            } else {
                FileInputStream file;
                try {
                    file = new FileInputStream(url + fileEntry.getName());
                    ObjectInputStream in = new ObjectInputStream(file);
                    // Method for deserialization of object
                    avatar = (Avatar) in.readObject();
                    model.addElement(avatar);
                    in.close();
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
        return model;
    }

    public void listFilesForFolder(final File folder) {

    }

    public void setVentanaInicio(VentanaInicio ventanaInicio) {
        this.ventanaInicio = ventanaInicio;
    }
    

}
