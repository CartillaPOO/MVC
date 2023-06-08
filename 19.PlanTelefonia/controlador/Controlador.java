package controlador;

import modelo.PlanTelefonia;
import vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener
{
    //
    // Atributos
    //

    private VentanaPrincipal venPrin;
    private PlanTelefonia plan;

    //
    // Métodos
    //

    public Controlador(VentanaPrincipal pVenPrin, PlanTelefonia pPlan)
    {
        this.venPrin = pVenPrin;
        this.plan = pPlan;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        this.venPrin.miPanelResultados.mostrarResultado("Gestión de plan de telefonía móvil\nCalcule el costo de su plan\n\nWom tiene un descuento del 50%\n¡Con Wom, habla más!");
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        if(comando.equals("calcularPlan"))
        {
            String operador = venPrin.miPanelEntradaDatos.getOperador();
            String numero = venPrin.miPanelEntradaDatos.getNumero();
            int minutos = venPrin.miPanelEntradaDatos.getMinutos();
            double valorMinuto = venPrin.miPanelEntradaDatos.getValorMinuto();

            if(operador.equals("Wom"))
            {
                plan = new PlanTelefonia(numero, operador, minutos, valorMinuto);
            }
            else if(operador.equals("Otro"))
            {
                plan = new PlanTelefonia(numero, minutos, valorMinuto); // Si no se selecciona operador, se asume que es "Otro"
            }

            venPrin.miPanelResultados.mostrarResultado("El plan con número " + plan.getNumeroCelular() + "\nTiene un costo de $" + plan.calcularCostoPlan());
        }

        if(comando.equals("borrar"))
        {
            venPrin.miPanelEntradaDatos.borrar();
            venPrin.miPanelResultados.borrar();
            venPrin.miPanelResultados.mostrarResultado("Siga con el cálculo de su plan\n¿Qué tal si prueba con Wom?\n¡Wom sólo cuesta la mitad!");
        }

        if(comando.equals("salir"))
        {
            System.exit(0);
        }  
    }
}