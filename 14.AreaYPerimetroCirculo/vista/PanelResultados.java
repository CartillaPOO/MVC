package vista;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


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
        this.setBackground(new Color(31,31,31));

        // Creación y adición del area de texto
        taResultado = new JTextArea();
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10,20,160,195);
        spResultado.setBorder(null);

        taResultado.setForeground(Color.WHITE);
        taResultado.setEditable(false); // No se puede editar el area de texto
        taResultado.setBackground(new Color(59,59,59));
        taResultado.setCaretColor(taResultado.getBackground());
        this.add(spResultado);
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