package vista;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelOperaciones extends JPanel
{
    // 
    // Atributos
    //

    public JButton btCalcular;
    public JButton btBorrar;
    public JButton btSalir;

    //
    // Métodos
    //
    
    // Constructor   
    public PanelOperaciones()
    {
        this.setLayout(null);
        this.setBackground(new Color(31,31,31));

        // Creación y adición del botón calcular
        btCalcular = new JButton("Calcular");
        btCalcular.setBounds(56, 40, 120, 25);
        btCalcular.setForeground(Color.WHITE);
        btCalcular.setBackground(new Color(59,59,59));
        this.add(btCalcular);
        btCalcular.setActionCommand("Calcular");

        // Creación y adición del botón borrar
        btBorrar = new JButton("Borrar");
        btBorrar.setBounds(224, 40, 120, 25);
        btBorrar.setForeground(Color.WHITE);
        btBorrar.setBackground(new Color(59,59,59));
        this.add(btBorrar);
        btBorrar.setActionCommand("Borrar");

        // Creación y adición del botón salir
        btSalir = new JButton("Salir");
        btSalir.setBounds(392, 40, 120, 25);
        btSalir.setForeground(Color.WHITE);
        btSalir.setBackground(new Color(59,59,59));
        this.add(btSalir);
        btSalir.setActionCommand("Salir");
    }
}