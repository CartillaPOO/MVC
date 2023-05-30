package ejecutable;

import controlador.Controlador;
import modelo.EmpresaAutomotriz;
import vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args) 
    {
        EmpresaAutomotriz empresa = new EmpresaAutomotriz();
        VentanaPrincipal venPrin = new VentanaPrincipal();
        Controlador controlador = new Controlador(venPrin, empresa);
    }
}
