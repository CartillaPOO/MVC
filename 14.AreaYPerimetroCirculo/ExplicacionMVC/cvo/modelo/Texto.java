package cvo.modelo;

import javax.swing.JLabel;

public class Texto extends JLabel{
    private String mouseComand;

    public Texto(String texto){
        this.setText(texto);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.getText();
    }
}
