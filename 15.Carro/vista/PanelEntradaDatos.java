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
    private JLabel lbColor;
    private JLabel lbPosX;
    private JLabel lbPosY;
    private JTextField tfColor;
    private JTextField tfPosX;
    private JTextField tfPosY;

    private Font fontLabel = new Font("Arial", Font.BOLD, 20);
    private Font fontField = new Font("Arial", Font.BOLD, 15);
    
    //
    // Metodos
    //
    
    // Método constructor
    public PanelEntradaDatos()
    {
        // Definición del contendor del panel
        this.setLayout(null);
        this.setBackground(new Color(31,31,31));
        
        // Creación y adición de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/carro.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10,25,160,160);
        this.add(lbImagen);
        
        // Creación y adición de etiquetas Color, PosX y PosY
        lbColor = new JLabel("Color:");
        lbColor.setFont(fontLabel);
        lbColor.setForeground(Color.WHITE);
        lbColor.setBounds(190,65,60,20);
        this.add(lbColor);
        
        lbPosX = new JLabel("PosX:");
        lbPosX.setFont(fontLabel);
        lbPosX.setForeground(Color.WHITE);
        lbPosX.setBounds(190,105,60,20);
        this.add(lbPosX);
        
        lbPosY = new JLabel("PosY:");
        lbPosY.setFont(fontLabel);
        lbPosY.setForeground(Color.WHITE);
        lbPosY.setBounds(190,145,60,20);
        this.add(lbPosY);
        
        
        // Creación y adición de campos de texto
        tfColor = new JTextField("Rojo");
        tfColor.setBackground(new Color(59,59,59));
        tfColor.setBorder(null);
        tfColor.setFont(fontField);
        tfColor.setForeground(Color.WHITE);
        tfColor.setCaretColor(Color.WHITE);
        tfColor.setBounds(260, 65, 60, 20);
        this.add(tfColor);
        
        tfPosX = new JTextField("10");
        tfPosX.setBackground(new Color(59,59,59));
        tfPosX.setBorder(null);
        tfPosX.setFont(fontField);
        tfPosX.setForeground(Color.WHITE);
        tfPosX.setCaretColor(Color.WHITE);
        tfPosX.setBounds(260, 105, 60, 20);
        this.add(tfPosX);
        
        tfPosY = new JTextField("10");
        tfPosY.setBackground(new Color(59,59,59));
        tfPosY.setBorder(null);
        tfPosY.setFont(fontField);
        tfPosY.setForeground(Color.WHITE);
        tfPosY.setCaretColor(Color.WHITE);
        tfPosY.setBounds(260, 145, 60, 20);
        this.add(tfPosY);
    }
    
    // Métodos de acceso a la información de las cajas de texto
    public String getColor()
    {
        return tfColor.getText();
    }
    
    public String getPosX()
    {
        return tfPosX.getText();
    }
    
    public String getPosY()
    {
        return tfPosY.getText();
    }
    
    // Metodo para borrar cajas de texto
    public void borrar()
    {
        tfColor.setText("");
        tfPosX.setText("");
        tfPosY.setText("");
    }
}