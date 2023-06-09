package ejecutable;

import vista.VentanaPrincipal;
import controlador.Controlador;
import modelo.CasaEventos;

public class Test 
{
    public static void main(String[] args)
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        CasaEventos miCasaEventos = new CasaEventos();
        Controlador miControlador = new Controlador(miVentana,miCasaEventos);
    }
}
