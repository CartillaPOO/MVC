package ejecutable;

import controlador.Controlador;
import cvo.eventos.EventosBoton;
import cvo.eventos.EventosMouse;
import cvo.vista.FrameTest;
import modelo.Circulo;
import vista.VentanaPrincipal;

public class Test
{
    // Método principal
    public static void main(String[] args)
    {
        FrameTest miFrame = new FrameTest("Circulo", 15);
        EventosMouse eventosMouse = new EventosMouse(miFrame);
        EventosBoton eventosBoton = new EventosBoton(miFrame);
    }
}