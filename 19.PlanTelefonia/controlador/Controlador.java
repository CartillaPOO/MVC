package controlador;

import modelo.PlanTelefonia;
import vista.VentanaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener
{

    //Atributos

    private VentanaPrincipal venPrin;
    private PlanTelefonia plan;

    //Metodos
    public Controlador(VentanaPrincipal pVenPrin, PlanTelefonia pPlan)
    {
        this.venPrin = pVenPrin;
        this.plan = pPlan;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        this.venPrin.miPanelResultados.mostrarResultado("Bienvenido otra vez\n");
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        //Abrir ventana calcularPlan
        if(comando.equals("calcularPlan"))
        {
            String operador = venPrin.miPanelEntradaDatos.getOperador();
            String numero = venPrin.miPanelEntradaDatos.getNumero();
            int minutos = Integer.parseInt(venPrin.miPanelEntradaDatos.getMinutos());

            plan = new PlanTelefonia(numero, operador, minutos);

            venPrin.miPanelResultados.mostrarResultado("El plan para el número " + plan.getNumeroCelular() + " tiene un costo de " + plan.calcularCostoPlan());
        }

        //Salir
        if(comando.equals("salir"))
        {
            System.exit(0);
        }  
    }
}