package cvo.vista;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

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
    private JLayeredPane capa;
    
    private String rutaImagen = "cvo/Recursos/Diagramas/";
    private String rutaGif;
    private ImageIcon icon; 
    private JLabel label;
        
    private Point initialClick;

    private JLabel lbCerrar;




    
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
        moverVentana();
        this.setUndecorated(true);
        this.setTitle("Objetos en RAM");
        this.setSize(ancho, alto);
        this.setResizable(false);
        this.setBackground(Color.WHITE);
        this.setVisible(true);

        
    }

    public DialogoExplicacion(String imagen, boolean esGif, int tiempo){
        //Layout
        this.setLayout(null);

        rutaGif = "cvo/Recursos/Gifs/" + imagen + ".gif";
        rutaImagen = "cvo/Recursos/Gifs/" + imagen + ".png";
        icon = new ImageIcon(rutaGif);
        
        ancho = icon.getIconWidth();
        alto = icon.getIconHeight();
        
        this.capa = new JLayeredPane();
        capa.setBounds(0, 0, ancho, alto);

        label = new JLabel(icon);
        label.setBounds(0, 0, ancho, alto);
        capa.add(label, JLayeredPane.DEFAULT_LAYER);

        lbCerrar = new JLabel("Cerrar");
        lbCerrar.setBounds(0, 0, 100, 30);
        lbCerrar.setForeground(Color.WHITE);
        capa.add(lbCerrar, JLayeredPane.PALETTE_LAYER);

        this.add(capa);
        
        desactivarGif(rutaImagen, tiempo);
        
        // Caracteristicas del diálogo 
        moverVentana();
        this.setUndecorated(true);
        this.setTitle("Objetos en RAM");
        this.setSize(ancho, alto);
        this.setResizable(false);
        this.setVisible(true);
    }

    private void desactivarGif(String rutaImagen, int tiempo){
        icon = new ImageIcon(rutaImagen);

        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                label.setIcon(icon);
            }
        }, tiempo * 1000);
    }


    public void moverVentana(){
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint(); // Guarda la posición inicial del click
            }
        });

        // Agrega un MouseMotionListener para detectar eventos de movimiento del mouse
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                // Calcula la nueva ubicación de la ventana al arrastrar el mouse
                int x = getLocation().x + e.getX() - initialClick.x;
                int y = getLocation().y + e.getY() - initialClick.y;
                setLocation(x, y); // Establece la nueva ubicación de la ventana
            }
        });
    }

    
}
