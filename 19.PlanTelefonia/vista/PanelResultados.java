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
    // Metodos
    //

    //Constructor
    public PanelResultados()
    {
        // Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(new Color(31,31,31));

        // Creación y adición del área de texto
        taResultado = new JTextArea();
        taResultado.setBackground(new Color(59,59,59));
        taResultado.setForeground(Color.WHITE);
        taResultado.setCaretColor(taResultado.getBackground());
        taResultado.setEditable(false);
        spResultado = new JScrollPane(taResultado);
        spResultado.setBorder(null);
        spResultado.setBounds(10,10,190,210);
        this.add(spResultado); 
    }

    // Métodos de acceso
    public void mostrarResultado(String msj)
    {
        taResultado.append(msj + "\n\n");
    }

    public void borrar()
    {
        taResultado.setText("");
    }
}