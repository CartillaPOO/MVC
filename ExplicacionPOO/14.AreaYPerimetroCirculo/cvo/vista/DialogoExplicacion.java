package cvo.vista;
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
    private String ruta = "/Imagenes/";


    private ImageIcon icon; 
    private JLabel label;

    
    public DialogoExplicacion(int posX, int posY, int ancho, int alto, String imagen){
        this.posX = posX;
        this.posY = posY;
        ruta += imagen;
        
        icon = new ImageIcon(getClass().getResource(ruta));
        label = new JLabel(icon);
        label.setBounds(0, 0, ancho, alto);
        this.add(label);
        //Layout
        this.setLayout(null);

        //Caracteristicas de la ventana
        this.setTitle("Objetos en RAM");
        this.setSize(ancho, alto);
        this.setLocation(posX, posY);
        this.setResizable(false);
        this.setVisible(true);

        
    }

}
