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

    public JButton btRegistrarSalon;
    public JButton btReservar;
    public JButton btListaSalones;
    public JButton btSalir;
    
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
        btRegistrarSalon = new JButton("Registrar");
        btRegistrarSalon.setBackground(new Color(59,59,59));
        btRegistrarSalon.setForeground(Color.WHITE);
        btRegistrarSalon.setActionCommand("registrar");
        btRegistrarSalon.setBounds(20,40,100,20);
        this.add(btRegistrarSalon);
        
        btReservar = new JButton("Reservar");
        btReservar.setBackground(new Color(59,59,59));
        btReservar.setForeground(Color.WHITE);
        btReservar.setActionCommand("reservar");
        btReservar.setBounds(150,40,100,20);
        btReservar.setEnabled(false);
        this.add(btReservar);
        
        btListaSalones = new JButton("Lista de salones");
        btListaSalones.setBackground(new Color(59,59,59));
        btListaSalones.setForeground(Color.WHITE);
        btListaSalones.setActionCommand("lista");
        btListaSalones.setBounds(280,40,130,20);
        btListaSalones.setEnabled(false);
        this.add(btListaSalones);

        btSalir = new JButton("Salir");
        btSalir.setForeground(Color.WHITE);
        btSalir.setBackground(new Color(59,59,59));
        btSalir.setActionCommand("salir");
        btSalir.setBounds(440, 40, 100, 20);
        this.add(btSalir);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btRegistrarSalon.addActionListener(pAL);
        btReservar.addActionListener(pAL);
        btListaSalones.addActionListener(pAL);
        btSalir.addActionListener(pAL);
    }
    
    public void activarBotones()
    {
        btReservar.setEnabled(true);
        btListaSalones.setEnabled(true);
    }
}