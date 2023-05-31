package vista;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame
{
    //
    // Atributos
    //

    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;

    private JPanel colorFondo;
    
    //
    // Métodos
    //

    // Constructor
    public VentanaPrincipal()
    {
        // Desactivar el diseño por defecto
        this.setLayout(null); 

        // Agregando el PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,340,230); // Posición y tamaño
        this.add(miPanelEntradaDatos);

        // Agregando el PanelOPeraciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,250,560,100);
        this.add(miPanelOperaciones);

        // Agregando el PanelResultados
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(360,10,210,230);
        this.add(miPanelResultados);

        colorFondo = new JPanel();
        colorFondo.setBackground(new Color(24, 24, 24));
        colorFondo.setBounds(0,0,600,400);
        this.add(colorFondo);
        
        this.getRootPane().setWindowDecorationStyle(2);
        // Características de la ventana
        // Caracteristicas del diálogo 
        
        // Cambiar el color de la barra de título de la ventana
        this.getRootPane().setWindowDecorationStyle(2);

        // Quitar barra de título de la ventana
        this.setUndecorated(true);
        this.setTitle("Area y perímetro del circulo"); // Título de la ventana
        this.setSize(600, 400);
        //this.setLocation(500, 500); // Posicion respecto a la pantalla
        this.setLocationRelativeTo(null);// Posiciona en el centro la ventana
        this.setResizable(false); // Hace que no se pueda maximizar
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Termina el programa al cerrar la ventana, es como System.exit(0) pero para ventanas
        this.setVisible(true); // Hace visible la ventana
    }
}