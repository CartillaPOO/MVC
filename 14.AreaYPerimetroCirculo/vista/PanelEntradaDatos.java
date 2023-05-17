package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //
    // Atributos
    //

    private JLabel lbImagen;
    private ImageIcon iImagen;
    private JLabel lbRadio;
    private JTextField tfRadio;

    private Font fontLabel = new Font("Arial", Font.BOLD, 25);
    private Font fontField = new Font("Arial", Font.BOLD, 15);

    //
    // Métodos
    //
    
    // Constructor

    public PanelEntradaDatos()
    {
        this.setLayout(null);
        this.setBackground(Color.GRAY);

        // Creación y adición de la imagen al panel
        iImagen = new ImageIcon(getClass().getResource("/vista/circulo.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(20,15,200,200);
        this.add(lbImagen);

        // Creación y adición de etiqueta lbRadio
        lbRadio = new JLabel("Radio:");
        lbRadio.setFont(fontLabel);
        lbRadio.setForeground(new Color(216, 56, 249));
        lbRadio.setBounds(260, 115, 100, 20);
        this.add(lbRadio);

        // Creación y adición de caja de texto para el radio
        tfRadio = new JTextField();
        tfRadio.setBackground(Color.GRAY);
        tfRadio.setForeground(Color.BLACK);
        tfRadio.setFont(fontField);
        tfRadio.setBounds(340, 115, 100, 20);
        this.add(tfRadio);

        // Borde del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de entrada");
        borde.setTitleColor(Color.BLACK);
        this.setBorder(borde);
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