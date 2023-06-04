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

    private JPanel colorFondo1;
    private JPanel colorFondo2;
    private JLabel lbTitulo;
    private JLabel lbPosX;
    private JLabel lbPosY;
    private JTextField tfPosX;
    private JTextField tfPosY;
    private JButton btAceptar;
    private JButton btCancelar;

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
        
        // Creación y adición de elementos
        lbTitulo = new JLabel("Mover Carro", JLabel.CENTER); // JLabel.CENTER: Centra el texto
        lbTitulo.setFont(fontLabel);
        lbTitulo.setForeground(Color.WHITE);
        lbTitulo.setBounds(0,20,340,25);
        this.add(lbTitulo);
        
        lbPosX = new JLabel("X =", JLabel.RIGHT); // JLabel.RIGHT: Alinea el texto a la derecha
        lbPosX.setFont(fontLabel);
        lbPosX.setForeground(Color.WHITE);
        lbPosX.setBounds(0,60,150,20);
        this.add(lbPosX);
        
        lbPosY = new JLabel("Y =", JLabel.RIGHT);
        lbPosY.setFont(fontLabel);
        lbPosY.setForeground(Color.WHITE);
        lbPosY.setBounds(0,100,150,20);
        this.add(lbPosY);
        
        tfPosX = new JTextField("5");
        tfPosX.setEditable(false);
        tfPosX.setBackground(new Color(59,59,59));
        tfPosX.setBorder(null);
        tfPosX.setFont(fontField);
        tfPosX.setForeground(Color.WHITE);
        tfPosX.setCaretColor(Color.WHITE);
        tfPosX.setBounds(160,60,60,20);
        this.add(tfPosX);
        
        tfPosY = new JTextField("1");
        tfPosY.setEditable(false);
        tfPosY.setBackground(new Color(59,59,59));
        tfPosY.setBorder(null);
        tfPosY.setFont(fontField);
        tfPosY.setForeground(Color.WHITE);
        tfPosY.setCaretColor(Color.WHITE);
        tfPosY.setBounds(160,100,60,20);
        this.add(tfPosY);
        
        btAceptar = new JButton("Aceptar");
        btAceptar.setBackground(new Color(59,59,59));
        btAceptar.setFont(fontField);
        btAceptar.setForeground(Color.WHITE);
        btAceptar.setActionCommand("aceptar");
        btAceptar.setBounds(40,150,260,20);
        this.add(btAceptar);

        btCancelar = new JButton("Cancelar");
        btCancelar.setBackground(new Color(59,59,59));
        btCancelar.setFont(fontField);
        btCancelar.setForeground(Color.WHITE);
        btCancelar.setActionCommand("cancelar");
        btCancelar.setBounds(40,180,260,20);
        this.add(btCancelar);
               
        // Características de la ventana
        this.setUndecorated(true);
        this.setSize(340,230);
        this.setResizable(false);
        this.setVisible(true);

        // Color de fondo
        colorFondo1 = new JPanel();
        colorFondo1.setBackground(new Color(31,31,31));
        colorFondo1.setBounds(10,10,320,210);
        this.add(colorFondo1);

        colorFondo2 = new JPanel();
        colorFondo2.setBackground(new Color(24,24,24));
        colorFondo2.setBounds(0,0,340,230);
        this.add(colorFondo2);
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
        btCancelar.addActionListener(pAL);
    }
    
    public void cerrarDialogo()
    {
        this.dispose();
    }   
}