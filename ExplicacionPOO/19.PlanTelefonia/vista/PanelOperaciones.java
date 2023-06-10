package vista;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;

public class PanelOperaciones extends JPanel
{
    // Atributos
    private JButton btCalcularPlan;
    private JButton btBorrar;
    private JButton btSalir;

    // Metodos

    // Constructor
    public PanelOperaciones()
    {
        // Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(new Color(31,31,31));

        // Creación y adición de los botones
        btCalcularPlan = new JButton("Calcular Plan");
        btCalcularPlan.setBackground(new Color(59,59,59));
        btCalcularPlan.setForeground(Color.WHITE);
        btCalcularPlan.setActionCommand("calcularPlan");
        btCalcularPlan.setBounds(18,40,150,20);
        this.add(btCalcularPlan);

        btBorrar = new JButton("Borrar");
        btBorrar.setBackground(new Color(59,59,59));
        btBorrar.setForeground(Color.WHITE);
        btBorrar.setActionCommand("borrar");
        btBorrar.setBounds(205,40,150,20);
        this.add(btBorrar);

        btSalir = new JButton("Salir");
        btSalir.setBackground(new Color(59,59,59));
        btSalir.setForeground(Color.WHITE);
        btSalir.setActionCommand("salir");
        btSalir.setBounds(392,40,150,20); 
        this.add(btSalir);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btCalcularPlan.addActionListener(pAL);
        btBorrar.addActionListener(pAL);
        btSalir.addActionListener(pAL);
    }
}