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
    
    // Método constructor   
    public PanelOperaciones()
    {
        this.setLayout(null); // Desactivar el diseño por defecto
        this.setBackground(new Color(31,31,31)); // Color de fondo

        // Creación y adición del botón calcular
        btCalcular = new JButton("Calcular");
        btCalcular.setToolTipText("btCalcular");
        btCalcular.setBackground(new Color(59,59,59));
        btCalcular.setForeground(Color.WHITE); // Color de la letra
        btCalcular.setActionCommand("calcular");
        btCalcular.setBounds(56, 40, 120, 25); // Posición y tamaño
        this.add(btCalcular);

        // Creación y adición del botón borrar
        btBorrar = new JButton("Borrar");
        btBorrar.setToolTipText("btBorrar");
        btBorrar.setBackground(new Color(59,59,59));
        btBorrar.setForeground(Color.WHITE);
        btBorrar.setActionCommand("borrar");
        btBorrar.setBounds(224, 40, 120, 25);
        this.add(btBorrar);

        // Creación y adición del botón salir
        btSalir = new JButton("Salir");
        btSalir.setToolTipText("btSalir");
        btSalir.setForeground(Color.WHITE);
        btSalir.setBackground(new Color(59,59,59));
        btSalir.setActionCommand("salir");
        btSalir.setBounds(392, 40, 120, 25);
        this.add(btSalir);
    }
}