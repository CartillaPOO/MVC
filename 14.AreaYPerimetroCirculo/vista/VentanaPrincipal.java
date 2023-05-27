package vista;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame
{
    //
    // Atributos
    //

    private JPanel colorFondo;
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;
    
    //
    // Métodos
    //

    // Método constructor
    public VentanaPrincipal()
    {
        // Definición del contenedor de la ventana
        this.setLayout(null); 

        // Creación y adición del PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,340,230); // Posición y tamaño
        this.add(miPanelEntradaDatos);

        // Creación y adición del PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,250,560,100);
        this.add(miPanelOperaciones);

        // Creación y adición del PanelResultados
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(360,10,210,230);
        this.add(miPanelResultados);

        
        // Características de la ventana
        this.setTitle("Area y perímetro del circulo"); // Título de la ventana
        this.setSize(600, 400);
        //this.setLocation(500, 500); // Posicion respecto a la pantalla
        this.setLocationRelativeTo(null);// Posiciona en el centro la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Termina el programa al cerrar la ventana, es como System.exit(0) pero para ventanas
        this.setResizable(false); // Hace que no se pueda maximizar
        this.setVisible(true); // Hace visible la ventana

        colorFondo = new JPanel();
        colorFondo.setBackground(new Color(24, 24, 24));
        colorFondo.setBounds(0,0,600,400);
        this.add(colorFondo);
    }
}