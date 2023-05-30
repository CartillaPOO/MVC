package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Carro;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    //
    // Atributos
    //
    
    private VentanaPrincipal venPrin;
    private Carro model;
    
    //
    // Métodos
    //

    // Método constructor
    public Controlador(VentanaPrincipal pVenPrin, Carro pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this); // Los eventos se escuchan desde aquí
    }
    
    // Método de atención a eventos
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        // Identificar el comando generado (calcular, borrar, salir)
        String comando = ae.getActionCommand();
        
        if(comando.equals("crear"))
        {   
            // Validar datos entrada
            try
            {
                String color = venPrin.miPanelEntradaDatos.getColor();
                int posX = Integer.parseInt(venPrin.miPanelEntradaDatos.getPosX());
                int poxY = Integer.parseInt(venPrin.miPanelEntradaDatos.getPosY());
            
                // Creación del objeto tipo Carro
                model = new Carro(color, posX, poxY); 
                
                venPrin.miPanelResultados.mostrarResultado("Se ha creado un objeto Carro");
                venPrin.miPanelResultados.mostrarResultado("Su número de ruedas son " + model.getNumRuedas());
                venPrin.miPanelResultados.mostrarResultado("Su color actual es " + model.getColor());
                venPrin.miPanelResultados.mostrarResultado("Su posición actual es (" + model.getPosX()+", " + model.getPosY()+")" );
                venPrin.miPanelResultados.mostrarResultado("Su velocidad actual es " + model.getVelocidad());
                
                // Desactivar boton crear
                venPrin.miPanelOperaciones.desactivarBotonCrear();
                // Activar botones
                venPrin.miPanelOperaciones.activarBotones();
            }
            catch(Exception e) // Error en datos de entrada
            
            {
                JOptionPane.showMessageDialog(null, "Error en datos de entrada", "Error", JOptionPane.ERROR_MESSAGE);
            }   
        }
        
        if(comando.equals("mover"))
        {   
            venPrin.crearDialogoMover();
            venPrin.miDialogoMoverCarro.agregarOyentesBotones(this);
        }
        
        if(comando.equals("aceptar"))
        {
            int x = Integer.parseInt(venPrin.miDialogoMoverCarro.getPosX());
            int y = Integer.parseInt(venPrin.miDialogoMoverCarro.getPosY());
            model.mover(x, y);
            venPrin.miPanelResultados.mostrarResultado("\nSe ha movido el carro\nSu posición actual es (" + model.getPosX()+", " + model.getPosY()+")"); // Se le pasa el mensaje al panel de resultados
            venPrin.miDialogoMoverCarro.cerrarDialogo();
        }
        
        if(comando.equals("acelerar"))
        {
            model.acelerar();
            venPrin.miPanelResultados.mostrarResultado("\nEl carro ha acelerado\nSu velocidad actual es " + model.getVelocidad());
        }
        
        if(comando.equals("frenar"))
        {
            model.frenar();
            venPrin.miPanelResultados.mostrarResultado("\nEl carro ha frenado\nSu velocidad actual es " + model.getVelocidad());
        }

        if(comando.equals("salir"))
        {
            System.exit(0);
        }
    }    
}