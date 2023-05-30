package cvo.vista;
import java.awt.Color;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.util.Timer;
import java.util.TimerTask;

public class DialogoExplicacion extends JDialog{
    //----------------------
    // Atributos
    //----------------------
    private int posX;
    private int posY;
    private int alto;
    private int ancho;
    
    private String rutaImagen = "cvo/Recursos/Diagramas/";
    private String rutaGif;
    private ImageIcon icon; 
    private JLabel label;

    
    public DialogoExplicacion(String imagen){
        //Layout
        this.setLayout(null);

        rutaImagen += imagen;
        icon = new ImageIcon(rutaImagen);
        ancho = icon.getIconWidth();
        alto = icon.getIconHeight();

        label = new JLabel(icon);
        label.setBounds(0, 0, ancho, alto);
        this.add(label);
        
        // Caracteristicas del diálogo 
        this.setUndecorated(true);
        this.setTitle("Objetos en RAM");
        this.setSize(ancho, alto);
        this.setResizable(false);
        this.setBackground(Color.WHITE);
        this.setVisible(true);

        
    }

    public DialogoExplicacion(String imagen, boolean esGif){
        //Layout
        this.setLayout(null);

        rutaGif = "cvo/Recursos/Gifs/" + imagen + ".gif";
        rutaImagen = "cvo/Recursos/Gifs/" + imagen + ".png";
        icon = new ImageIcon(rutaGif);
        
        ancho = icon.getIconWidth();
        alto = icon.getIconHeight();

        label = new JLabel(icon);
        label.setBounds(0, 0, ancho, alto);
        this.add(label);

        desactivarGif(rutaImagen);
        
        // Caracteristicas del diálogo 
        this.setUndecorated(true);
        this.setTitle("Objetos en RAM");
        this.setSize(ancho, alto);
        this.setResizable(false);
        this.setVisible(true);
    }

    private void desactivarGif(String rutaImagen){
        icon = new ImageIcon(rutaImagen);

        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                label.setIcon(icon);
            }
        }, 15000);
    }

    
}
