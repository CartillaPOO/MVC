package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    // Atributos
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;

    // Métodos

    // Constructor
    public VentanaPrincipal()
    {
        // Definición del layout de la ventana
        this.setLayout(null);

        // Creación y adición del PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,0,390,180);
        this.add(miPanelEntradaDatos);

        //Creación y adición del PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,180,390,180);
        add(miPanelOperaciones);

        //Creación y adición del PanelResultados
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(400,0,380,360);
        this.add(miPanelResultados);

        //Caracteristicas de la ventana
        this.setTitle("Plan de telefonía");
        this.setSize(800,405);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
}
