package ejecutable;

import cvo.eventos.EventosBoton;
import cvo.eventos.EventosMouse;
import cvo.vista.FrameTest;

public class test {
    public static void main(String[] args) {
       FrameTest miTest = new FrameTest("Circulo", 15);
       EventosMouse eventosMouse = new EventosMouse(miTest);
       EventosBoton eventosBoton = new EventosBoton(miTest);
    }
}
