package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaPrincipal  extends JFrame
{
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;

    
    public VentanaPrincipal()
    {
        //Definición del layout de la ventana
        this.setLayout(null);

         //Creación y adición del PanelEntradaDatos
         miPanelEntradaDatos = new PanelEntradaDatos();
         miPanelEntradaDatos.setBounds(10,10,380,160);
         this.add(miPanelEntradaDatos);
 
         //Creación y adición del PanelOperaciones
         miPanelOperaciones = new PanelOperaciones();
         miPanelOperaciones.setBounds(10,190,380,90);
         this.add(miPanelOperaciones);
 
         //Creación y adición del PanelResultados
         miPanelResultados = new PanelResultados();
         miPanelResultados.setBounds(10,310,380,220);
         this.add(miPanelResultados);

         //Caracteristicas de la ventana
         this.setTitle("Casa Eventos");
         this.setSize(400,600);
         this.setLocationRelativeTo(null);
         this.setDefaultCloseOperation(EXIT_ON_CLOSE);
         this.setResizable(false);
         this.setVisible(true);

    }

    
    
}
