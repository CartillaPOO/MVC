package ejecutable;

import controlador.Controlador;
import modelo.Circulo;
import vista.VentanaPrincipal;

public class Test
{
    // Método principal
    public static void main(String[] args)
    {
        VentanaPrincipal miVentana = new VentanaPrincipal(); // Se crea un objeto de la clase VentanaPrincipal
        Circulo miCirculo = new Circulo(); // Se crea un objeto de la clase Circulo
        Controlador miControlador = new Controlador(miVentana, miCirculo); // Se crea un objeto de la clase Controlador, pasando como parámetros los objetos miVentana y miCirculo
    }
}