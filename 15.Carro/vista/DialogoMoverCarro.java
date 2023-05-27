package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DialogoMoverCarro extends JDialog
{
    //
    // Atributos
    //

    private JPanel colorFondo;
    private JLabel lbTitulo;
    private JLabel lbPosX;
    private JLabel lbPosY;
    private JTextField tfPosX;
    private JTextField tfPosY;
    private JButton btAceptar;

    private Font fontLabel = new Font("Arial", Font.BOLD, 20);
    private Font fontField = new Font("Arial", Font.BOLD, 15);

    //
    // Métodos
    //
    
    // Método constructor
    public DialogoMoverCarro()
    {
        // Definición del contenedor de la ventana
        this.setLayout(null);
        
        // Creación y adición del elementos
        lbTitulo = new JLabel("Mover Carro", JLabel.CENTER); // JLabel.CENTER: Centra el texto
        lbTitulo.setBounds(0,10,340,20);
        lbTitulo.setFont(fontLabel);
        lbTitulo.setForeground(Color.WHITE);
        this.add(lbTitulo);
        
        lbPosX = new JLabel("X =", JLabel.RIGHT); // JLabel.RIGHT: Alinea el texto a la derecha
        lbPosX.setBounds(0,50,150,20);
        lbPosX.setFont(fontLabel);
        lbPosX.setForeground(Color.WHITE);
        this.add(lbPosX);
        
        lbPosY = new JLabel("Y =", JLabel.RIGHT);
        lbPosY.setBounds(0,90,150,20);
        lbPosY.setFont(fontLabel);
        lbPosY.setForeground(Color.WHITE);
        this.add(lbPosY);
        
        tfPosX = new JTextField();
        tfPosX.setBounds(160,50,60,20);
        tfPosX.setFont(fontField);
        tfPosX.setBorder(null);
        tfPosX.setForeground(Color.WHITE);
        tfPosX.setCaretColor(Color.WHITE);
        tfPosX.setBackground(new Color(59,59,59));
        this.add(tfPosX);
        
        tfPosY = new JTextField();
        tfPosY.setBounds(160,90,60,20);
        tfPosY.setFont(fontField);
        tfPosY.setBorder(null);
        tfPosY.setForeground(Color.WHITE);
        tfPosY.setCaretColor(Color.WHITE);
        tfPosY.setBackground(new Color(59,59,59));
        this.add(tfPosY);
        
        btAceptar = new JButton("Aceptar");
        btAceptar.setBounds(40,140,260,20);
        btAceptar.setFont(fontField);
        btAceptar.setActionCommand("aceptar");
        btAceptar.setForeground(Color.WHITE);
        btAceptar.setBackground(new Color(59,59,59));
        this.add(btAceptar);
               
        // Características de la ventana
        this.setTitle("Carro");
        this.setSize(340,230);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

        // Color de fondo
        colorFondo = new JPanel();
        colorFondo.setBackground(new Color(31,31,31));
        colorFondo.setBounds(0,0,340,230);
        this.add(colorFondo);
    }
    
    public String getPosX()
    {
        return tfPosX.getText();
    }
    
    public String getPosY()
    {
        return tfPosY.getText();
    }
    
    public void agregarOyentesBotones(ActionListener pAL)
    {
        btAceptar.addActionListener(pAL);
    }
    
    public void cerrarDialogo()
    {
        this.dispose();
    }   
}