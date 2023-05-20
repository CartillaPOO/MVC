package cvo.vista;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class DialogoExplicacion extends JDialog{
    //----------------------
    // Atributos
    //----------------------
    private int posX;
    private int posY;
    private int alto;
    private int ancho;
    private String ruta = "cvo/Recursos/Diagramas/";


    private ImageIcon icon; 
    private JLabel label;

    
    public DialogoExplicacion(String imagen){
        //Layout
        this.setLayout(null);

        ruta += imagen;
        icon = new ImageIcon(ruta);
        ancho = icon.getIconWidth();
        alto = icon.getIconHeight();

        label = new JLabel(icon);
        label.setBounds(0, 0, ancho, alto);
        this.add(label);
        
        //Caracteristicas de la ventana
        this.setTitle("Objetos en RAM");
        this.setSize(ancho, alto);
        this.setResizable(false);
        this.setBackground(Color.WHITE);
        this.setVisible(true);

        
    }

    public DialogoExplicacion(String gif, boolean isGif){
        //Layout
        this.setLayout(null);

        ruta = "cvo/Recursos/Gifs/" + gif;
        icon = new ImageIcon(ruta);
        ancho = icon.getIconWidth();
        alto = icon.getIconHeight();

        label = new JLabel(icon);
        label.setBounds(0, 0, ancho, alto);
        this.add(label);
        
        //Caracteristicas de la ventana
        this.setTitle("Objetos en RAM");
        this.setSize(ancho, alto);
        this.setResizable(false);
        this.setBackground(Color.WHITE);
        this.setVisible(true);

        
    }

    
}
