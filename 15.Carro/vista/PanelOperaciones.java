package vista;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelOperaciones extends JPanel
{
    //
    // Atributos
    //

    public JButton btCrear;
    public JButton btMover;
    public JButton btAcelerar;
    public JButton btFrenar;
    
    //
    // Métodos
    //
    
    // Método constructor
    public PanelOperaciones()
    {
        // Definición del contendor del panel
        this.setLayout(null);
        this.setBackground(new Color(31,31,31));
        
        // Creación y adición de los botones
        btCrear = new JButton("Crear");
        btCrear.setBackground(new Color(59,59,59));
        btCrear.setForeground(Color.WHITE);
        btCrear.setActionCommand("crear");
        btCrear.setBounds(67,40,90,20);
        this.add(btCrear);
        
        btMover = new JButton("Mover");
        btMover.setBackground(new Color(59,59,59));
        btMover.setForeground(Color.WHITE);
        btMover.setActionCommand("mover");
        btMover.setBounds(179,40,90,20);
        btMover.setEnabled(false); // Permanece desactivado hasta que se cree un carro
        this.add(btMover);
        
        btAcelerar = new JButton("Acelerar");
        btAcelerar.setBackground(new Color(59,59,59));
        btAcelerar.setForeground(Color.WHITE);
        btAcelerar.setActionCommand("acelerar");
        btAcelerar.setBounds(291,40,90,20);
        btAcelerar.setEnabled(false);
        this.add(btAcelerar);
        
        btFrenar = new JButton("Frenar");
        btFrenar.setBackground(new Color(59,59,59));
        btFrenar.setForeground(Color.WHITE);
        btFrenar.setActionCommand("frenar");
        btFrenar.setBounds(403,40,80,20);
        btFrenar.setEnabled(false);
        this.add(btFrenar);
    }

    public void agregarOyentesBotones(ActionListener pAL) // Los eventos de los botones se manejan en la clase Controlador
    {
        btCrear.addActionListener(pAL);
        btMover.addActionListener(pAL);
        btAcelerar.addActionListener(pAL);
        btFrenar.addActionListener(pAL);
    }
    
    public void desactivarBotonCrear()
    {
        btCrear.setEnabled(false);
    }
    
    public void activarBotones()
    {
        btMover.setEnabled(true);
        btAcelerar.setEnabled(true);
        btFrenar.setEnabled(true);
    }
}