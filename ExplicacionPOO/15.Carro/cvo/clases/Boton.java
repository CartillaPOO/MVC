package cvo.clases;

import javax.swing.JButton;

public class Boton extends JButton{
    //TODO: Acabar clase Botón
    public Boton(String texto){
        setText(texto);
    }

    @Override
    public String toString() {
        return getText();
    }
}
