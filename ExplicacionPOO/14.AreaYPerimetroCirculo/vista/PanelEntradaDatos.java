package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelEntradaDatos extends JPanel
{
    //
    // Atributos
    //

    private JLabel lbImagen; 
    private ImageIcon iImagen;
    private JLabel lbRadio; 
    private JTextField tfRadio; 

    private Font fontLabel = new Font("Arial", Font.BOLD, 20);
    private Font fontField = new Font("Arial", Font.BOLD, 15);

    //
    // Métodos
    //
    
    // Constructor
    public PanelEntradaDatos()
    {
        this.setLayout(null); // Desactivar el diseño por defecto
        this.setBackground(new Color(31,31,31)); // Color de fondo

        // Creación y adición de la imagen al panel
        iImagen = new ImageIcon(getClass().getResource("/vista/circulo.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10,35,160,160); // Posición y tamaño
        this.add(lbImagen);

        // Creación y adición de etiqueta lbRadio
        lbRadio = new JLabel("Radio:");
        lbRadio.setBounds(190, 115, 70, 20);
        lbRadio.setFont(fontLabel); // Tipo de letra
        lbRadio.setForeground(Color.WHITE); // Color de la letra
        this.add(lbRadio);

        // Creación y adición de caja de texto para el radio
        tfRadio = new JTextField();
        tfRadio.setBounds(260, 115, 60, 20);
        tfRadio.setFont(fontField);
        tfRadio.setBorder(null); // Eliminar el borde
        tfRadio.setForeground(Color.WHITE);
        tfRadio.setCaretColor(Color.WHITE); // Color del cursor
        tfRadio.setBackground(new Color(59,59,59));
        this.add(tfRadio);
    }

    // Método de acceso a la información de la caja de texto
    public String getRadio()
    {
        return tfRadio.getText();
    }

    // Borrar el contenido de la caja de texto
    public void borrar()
    {
        tfRadio.setText("");
    }
}