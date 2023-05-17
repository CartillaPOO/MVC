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
        this.setLayout(null);
        this.setBackground(new Color(31,31,31));

        // Creación y adición de la imagen al panel
        iImagen = new ImageIcon(getClass().getResource("/vista/circulo.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10,35,160,160);
        this.add(lbImagen);

        // Creación y adición de etiqueta lbRadio
        lbRadio = new JLabel("Radio:");
        lbRadio.setFont(fontLabel);
        lbRadio.setForeground(new Color(216, 56, 249));
        lbRadio.setBounds(200, 115, 70, 20);
        this.add(lbRadio);

        // Creación y adición de caja de texto para el radio
        tfRadio = new JTextField();
        tfRadio.setForeground(Color.WHITE);
        tfRadio.setBorder(null);
        tfRadio.setCaretColor(Color.WHITE);
        tfRadio.setBackground(new Color(59,59,59));
        tfRadio.setFont(fontField);
        tfRadio.setBounds(270, 115, 60, 20);
        this.add(tfRadio);
    }

    // Método de acceso a la información
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