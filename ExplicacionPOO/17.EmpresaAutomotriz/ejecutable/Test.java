package ejecutable;

import controlador.Controlador;
import modelo.EmpresaAutomotriz;
import vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        EmpresaAutomotriz miEmpresa = new EmpresaAutomotriz();
        Controlador miControlador = new Controlador(miVentana, miEmpresa);
    }
}
