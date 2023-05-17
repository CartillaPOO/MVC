package ejecutable;

import controlador.Controlador;
import modelo.PlanTelefonia;
import vista.VentanaPrincipal;

public class Test
{
    public static void main(String[] args)
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        PlanTelefonia miPlan = null;
        Controlador miControlador = new Controlador(miVentana, miPlan);
    }
}
