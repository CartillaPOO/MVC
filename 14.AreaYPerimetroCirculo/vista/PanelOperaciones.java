package vista;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

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
        this.setBackground(Color.DARK_GRAY);

        // Creación y adición del botón calcular
        btCalcular = new JButton("Calcular");
        btCalcular.setBounds(30, 45, 120, 25);
        this.add(btCalcular);
        btCalcular.setActionCommand("Calcular");

        // Creación y adición del botón calcular
        btBorrar = new JButton("Borrar");
        btBorrar.setBounds(180, 45, 120, 25);
        this.add(btBorrar);
        btBorrar.setActionCommand("Borrar");

        // Creación y adición del botón calcular
        btSalir = new JButton("Salir");
        btSalir.setBounds(330, 45, 120, 25);
        this.add(btSalir);
        btSalir.setActionCommand("Salir");

        // Creación del borde
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLACK);
        this.setBorder(borde);
    }
}