package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //
    // Atributos
    //

    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;
    
    //
    // Métodos
    //

    // Constructor
    public VentanaPrincipal()
    {
        // Definimos contendor para la ventana
        this.setLayout(null);

        // Agregando el PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,370,230);
        this.add(miPanelEntradaDatos);

        // Agregando el PanelOPeraciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,250,560,100);
        this.add(miPanelOperaciones);

        // Agregando el PanelResultados
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(390,10,180,230);
        this.add(miPanelResultados);
        
        // Características de la ventana
        this.setTitle("Area y perimetro del circulo");
        this.setSize(600, 400);
        //this.setLocation(500, 500); // Posicion respecto a la pantalla
        this.setLocationRelativeTo(null);// Posiciona en el centro la ventana
        this.setResizable(false); // Hace que no se pueda maximizar
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);; // Termina el programa al cerrar la ventana, es como System.exit(0) pero para ventanas
        this.setVisible(true); // Hace visible la ventana
    }
}