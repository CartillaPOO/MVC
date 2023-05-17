package vista;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel
{
    //
    // Atributos
    //
    
    private JTextArea taResultado;
    private JScrollPane spResultado;

    //
    // Métodos
    //

    //Constructor   
    public PanelResultados()
    {
        this.setLayout(null);
        this.setBackground(Color.BLACK);

        // Creación y adición del area de texto
        taResultado = new JTextArea();
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10,20,460,85);
        this.add(spResultado);

        // Añadiendo borde
        TitledBorder borde = BorderFactory.createTitledBorder("Resultados");
        borde.setTitleColor(Color.white);
        this.setBorder(borde);
    }

    // Método de acceso a la información
    public void mostrarResultado(double area, double perimetro)
    {
        taResultado.append("Area: " + area + "\tperimetro: " + perimetro + "\n");
    }

    // Método para borrar el área de texto
    public void borrar()
    {
        taResultado.setText("");
    }
}