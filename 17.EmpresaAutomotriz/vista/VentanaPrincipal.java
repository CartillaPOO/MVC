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
    public DialogoAgregarVendedor miDialogoAgregarVendedor = null;
    public DialogoVenderCarro miDialogoVenderCarro = null;
    
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
        miPanelEntradaDatos.setBounds(10,10,340,230);
        this.add(miPanelEntradaDatos);
        
        // Creación y adición del PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,250,560,100);
        this.add(miPanelOperaciones);
        
        // Creación y adición del PanelResultados
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(360,10,210,230);
        this.add(miPanelResultados);
        miDialogoVenderCarro = null;
        
        // Características de la ventana
        this.setTitle("Carro");
        this.setSize(600,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }

    // Crear diálogo AgregarVendedor
    public void crearDialogoAgregarVendedor()
    {
        miDialogoAgregarVendedor = new DialogoAgregarVendedor();
    }

    // Crear diálogo VenderCarro
    public void crearDialogoVenderCarro()
    {
        miDialogoVenderCarro = new DialogoVenderCarro(miPanelEntradaDatos.getEmpleado());
    }
}
