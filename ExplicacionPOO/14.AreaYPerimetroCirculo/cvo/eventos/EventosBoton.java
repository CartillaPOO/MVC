package cvo.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import cvo.clases.SFX;
import cvo.vista.DialogoExplicacion;
import cvo.vista.FrameTest;

public class EventosBoton implements ActionListener {

    private FrameTest principal;
    private SFX sonidos;

    public EventosBoton(FrameTest principal){
        this.principal = principal;
        this.principal.panelTest.agregarEscuchadores(this);
        sonidos = new SFX();
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        String comando = event.getActionCommand();
        if(comando.equals("diagramaObjetos")){
            DialogoExplicacion miDialogoExplicacion = new DialogoExplicacion("diagramaObjetos", true, 35);
            miDialogoExplicacion.setLocation(principal.getX() + principal.getWidth(), principal.getY());
            sonidos.sonidoBoton();
            
        }

        if(comando.equals("salir")){
            System.exit(0);
        }
    }

    
}
