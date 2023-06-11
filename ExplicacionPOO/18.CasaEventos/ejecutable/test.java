package ejecutable;

import controlador.Controlador;
import cvo.eventos.EventosBoton;
import cvo.eventos.EventosMouse;
import cvo.vista.FrameTest;
import modelo.CasaEventos;
import vista.VentanaPrincipal;

public class test {
    public static void main(String[] args) {
       FrameTest miTest = new FrameTest("CasaEventos", 15);
       EventosMouse eventosMouse = new EventosMouse(miTest);
       EventosBoton eventosBoton = new EventosBoton(miTest);
    }
}
