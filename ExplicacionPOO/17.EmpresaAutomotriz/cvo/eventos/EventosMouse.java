package cvo.eventos;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controlador.Controlador;
import cvo.clases.Colores;
import cvo.clases.SFX;
import cvo.vista.FrameTest;
import modelo.EmpresaAutomotriz;
import vista.VentanaPrincipal;

public class EventosMouse implements MouseListener{

    //TODO: Corregir nombre de la variable Evento a evento

    //---Atributos---
    private FrameTest miFrameTest;
    private String nombreModelo;

    //Efectos SFX
    private SFX sonidos;

    public EventosMouse(FrameTest principal){
        miFrameTest = principal;
        miFrameTest.panelTest.agregarEscuchadores(this);
        nombreModelo = miFrameTest.panelTest.getNombreModelo();

        sonidos = new SFX();

        
    }
    @Override
    public void mouseClicked(MouseEvent event) {
        String Evento = event.getSource().toString();
        String clase = event.getSource().getClass().getSimpleName();
        //Eventos primera linea
        if(Evento.equals("VentanaPrincipal ")){
        }

        if(Evento.equals("miVentana = ")){
            System.out.println("miVentana");
        }

        if(Evento.equals("new VentanaPrincipal();")){
            //Aqui se colocan las instancias del sistema MVC
            VentanaPrincipal miVentana = new VentanaPrincipal();
            EmpresaAutomotriz miEmpresaAutomotriz = new EmpresaAutomotriz();
            Controlador miControlador = new Controlador(miVentana, miEmpresaAutomotriz);

            setWindowPosition(miVentana);
        }

        //Eventos segunda linea
        if(Evento.equals(nombreModelo + " ")){
        }

        if(Evento.equals("mi" + nombreModelo + " = ")){
        }

        if(Evento.equals("new " + nombreModelo + "();")){
        }


        //Eventos tercera linea
        if(Evento.equals("Controlador ")){
        }

        if(Evento.equals("miControlador = ")){
        }

        if(Evento.equals("new Controlador(miVentana, " + "mi" + nombreModelo + ");")){
            
        }
        

        if(clase.equals("Texto")){
            sonidos.sonidoLabelClic();
        }
        //---Eventos Para VentanaPrincipal---

        System.out.println("Click en: " + Evento);
    }

    public void setWindowPosition(JFrame ventanaPrincipal){
        ventanaPrincipal.setLocation(miFrameTest.getWidthPOSX(), miFrameTest.getScreenPOSY());
    }
    
    public void setWindowPosition(JDialog dialogo){
        dialogo.setLocation(0, miFrameTest.getHeightPOSY());
    }


    @Override
    public void mouseEntered(MouseEvent event){
        String Evento = event.getSource().toString();
        String clase = event.getSource().getClass().getSimpleName();
        System.out.println(clase);

        //Resaltado para la primera linea
        if(Evento.equals("VentanaPrincipal ")){
            miFrameTest.panelTest.lbVentanaPrincipal.setForeground(Colores.RESALTADO);
        }

        if(Evento.equals("miVentana = ")){
            miFrameTest.panelTest.lbMiventana.setForeground(Colores.RESALTADO);
        }

        if(Evento.equals("new VentanaPrincipal();")){
            miFrameTest.panelTest.lbNewVentanaPrincipal.setForeground(Colores.RESALTADO);
        }

        //Resaltado para la segunda linea
        if(Evento.equals(nombreModelo + " ")){
            miFrameTest.panelTest.lbModelo.setForeground(Colores.RESALTADO);
        }

        if(Evento.equals("mi" + nombreModelo + " = ") || Evento.equals("new " + nombreModelo + "();")){
            miFrameTest.panelTest.lbMiModelo.setForeground(Colores.RESALTADO);
            miFrameTest.panelTest.lbNewModelo.setForeground(Colores.RESALTADO);
        }

        /*if(Evento.equals("new " + nombreModelo + "();")){
        }*/

        //Resaltado para la tercera linea
        if(Evento.equals("Controlador ")){
            miFrameTest.panelTest.lbControlador.setForeground(Colores.RESALTADO);
        }

        if(Evento.equals("miControlador = ") || Evento.equals("new Controlador(miVentana, " + "mi" + nombreModelo + ");")){
            miFrameTest.panelTest.lbMiControlador.setForeground(Colores.RESALTADO);
            miFrameTest.panelTest.lbNewControlador.setForeground(Colores.RESALTADO);
        }

        /*if(Evento.equals("new Controlador(miVentana, miEmpresa);")){
            miFrameTest.panelTest.lbNewControlador.setForeground(Colores.RESALTADO);
        }*/

        if(clase.equals("Texto")){
            sonidos.sonidoLabel();
        }

        //Eventos Boton

        if(Evento.equals("Diagrama de objetos")){
            miFrameTest.panelTest.btDiagramaObjetos.setForeground(Colores.RESALTADO);
        }

        System.out.println("Entrando a: " + Evento);
        //TODO: Hacer que se cambie el color del label cuando este encima
    }

    @Override
    public void mouseExited(MouseEvent event) {
        String Evento = event.getSource().toString();
        //TODO: Hacer que vuelva al color original cuando se salga

        // Color original primera linea
        if(Evento.equals("VentanaPrincipal ")){
            miFrameTest.panelTest.lbVentanaPrincipal.setForeground(Colores.ClASE);
        }

        if(Evento.equals("miVentana = ")){
            miFrameTest.panelTest.lbMiventana.setForeground(Colores.OBJETO);
        }

        if(Evento.equals("new VentanaPrincipal();")){
            miFrameTest.panelTest.lbNewVentanaPrincipal.setForeground(Colores.INSTANCIA);
        }

        //Color original segunda linea

        if(Evento.equals(nombreModelo + " ")){
            miFrameTest.panelTest.lbModelo.setForeground(Colores.ClASE);
        }

        if(Evento.equals("mi" + nombreModelo + " = ") || Evento.equals("new " + nombreModelo + "();")){
            miFrameTest.panelTest.lbMiModelo.setForeground(Colores.OBJETO);
            miFrameTest.panelTest.lbNewModelo.setForeground(Colores.INSTANCIA);
        }

        /*if(Evento.equals("new " + nombreModelo + "();")){
            miFrameTest.panelTest.lbNewModelo.setForeground(Colores.INSTANCIA);
        }*/

        //Color original tercera linea

        if(Evento.equals("Controlador ")){
            miFrameTest.panelTest.lbControlador.setForeground(Colores.ClASE);
        }

        if(Evento.equals("miControlador = ") || Evento.equals("new Controlador(miVentana, " + "mi" + nombreModelo + ");")){
            miFrameTest.panelTest.lbMiControlador.setForeground(Colores.OBJETO);
            miFrameTest.panelTest.lbNewControlador.setForeground(Colores.INSTANCIA);
        }

        /*if(Evento.equals("new Controlador(miVentana, miEmpresa);")){
            miFrameTest.panelTest.lbNewControlador.setForeground(Colores.INSTANCIA);
        }*/

        //Color original boton
        if(Evento.equals("Diagrama de objetos")){
            System.out.println("Entrando al boton");
            miFrameTest.panelTest.btDiagramaObjetos.setForeground(Colores.FUENTE_BOTON);
            
        }

        System.out.println("Saliendo de: " + Evento);
    }

    @Override
    public void mousePressed(MouseEvent event) {
    }

    @Override
    public void mouseReleased(MouseEvent event) {
    }
    
}
