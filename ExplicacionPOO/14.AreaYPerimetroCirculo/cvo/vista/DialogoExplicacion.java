package cvo.vista;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import cvo.clases.Colores;
import cvo.clases.SFX;
import cvo.clases.Texto;

import java.util.Timer;
import java.util.TimerTask;

public class DialogoExplicacion extends JDialog{
    //----------------------
    // Atributos
    //----------------------
    //Caracteristicas de la ventana
    private int posX;
    private int posY;
    private int alto;
    private int ancho;
    private JLayeredPane capa;
    private JPanel colorFondo;
    
    //Imagen
    private String rutaImagen = "cvo/Recursos/Diagramas/";
    private String rutaGif;
    private ImageIcon icon; 
    private JLabel label;
    
    //Movimiento de la ventana
    private Point initialClick;

    //Label Cerrar
    public Texto lbCerrar;
    private Mouse escuchador;





    
    public DialogoExplicacion(String imagen){
        //Layout
        this.setLayout(null);



        rutaImagen += imagen;
        icon = new ImageIcon(rutaImagen);

        ancho = icon.getIconWidth();
        alto = icon.getIconHeight();

        
        this.capa = new JLayeredPane();
        capa.setBounds(0, 0, ancho, alto);
 
        colorFondo = new JPanel();
        colorFondo.setBackground(Color.BLACK);
        colorFondo.setBounds(0, 0, ancho, alto);       
        capa.add(colorFondo, JLayeredPane.DEFAULT_LAYER);
        
        label = new JLabel(icon);
        label.setBounds(0, 0, ancho, alto);
        capa.add(label, JLayeredPane.PALETTE_LAYER);

        lbCerrar = new Texto("Cerrar");
        lbCerrar.setBounds(5, alto - 30, 50, 30);
        lbCerrar.setForeground(Colores.CERRAR);
        capa.add(lbCerrar, JLayeredPane.PALETTE_LAYER);
        

        this.add(capa);
        
        escuchador = new Mouse(lbCerrar);
        
        // Caracteristicas del diálogo


        moverVentana();
        this.setUndecorated(true);
        this.setTitle("Objetos en RAM");
        this.setSize(ancho, alto);
        this.setResizable(false);
        
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

        lbCerrar = new Texto("Cerrar");
        lbCerrar.setBounds(5, alto - 30, 50, 30);
        lbCerrar.setForeground(Colores.CERRAR);
        capa.add(lbCerrar, JLayeredPane.PALETTE_LAYER);

        this.add(capa);
        
        escuchador = new Mouse(lbCerrar);

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


    class Mouse implements MouseListener {
        //---Atributos---
        //Efectos SFX
        private SFX sonidos;

        public Mouse(Texto lbCerrar){
            sonidos = new SFX();
            lbCerrar.addMouseListener(this);
        }

        @Override
        public void mouseClicked(MouseEvent event) {
            // TODO Auto-generated method stub
            if(event.getSource() == lbCerrar){
                sonidos.sonidoLabelClic();
                dispose();
            }
        }

        @Override
        public void mouseEntered(MouseEvent event) {
            // TODO Auto-generated method stub
            lbCerrar.setForeground(Colores.RESALTADO);
            lbCerrar.setFont(new Font("Consolas", Font.BOLD, 15));
            sonidos.sonidoLabel();
        }

        @Override
        public void mouseExited(MouseEvent event) {
            //La fuente vuelve a la normalidad
            lbCerrar.setForeground(Colores.CERRAR);
            lbCerrar.setFont(new Font("Consolas", Font.BOLD, 12));
            
        }

        @Override
        public void mousePressed(MouseEvent event) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void mouseReleased(MouseEvent event) {
            // TODO Auto-generated method stub
           
        }

    }

    
}
