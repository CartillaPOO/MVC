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
        this.setBackground(new Color(235, 219, 178));

        // Creación y adición del area de texto
        taResultado = new JTextArea();
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10,20,160,195);
        taResultado.setEditable(false); // No se puede editar el area de texto
        taResultado.setBackground(Color.WHITE);
        taResultado.setForeground(Color.BLACK);
        taResultado.setCaretColor(taResultado.getBackground());
        this.add(spResultado);

        // Añadiendo borde
        TitledBorder borde = BorderFactory.createTitledBorder("Resultados");
        borde.setTitleColor(Color.black);
        this.setBorder(borde);
    }

    // Método de acceso a la información
    public void mostrarResultado(double area, double perimetro)
    {
        taResultado.append("Area: " + area + "\nPerimetro: " + perimetro + "\n"); //
    }

    // Método para borrar el área de texto
    public void borrar()
    {
        taResultado.setText("");
    }
}