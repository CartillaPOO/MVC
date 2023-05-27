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

    // Método constructor   
    public PanelResultados()
    {
        this.setLayout(null); // Desactivar el diseño por defecto
        this.setBackground(new Color(31,31,31)); // Color de fondo

        // Creación y adición del area de texto
        taResultado = new JTextArea();
        taResultado.setBackground(new Color(59,59,59));
        spResultado.setBorder(null); // Eliminar el borde
        taResultado.setForeground(Color.WHITE); // Color de la letra
        taResultado.setCaretColor(taResultado.getBackground()); // Color del cursor (Se pone el mismo color que el fondo para que no se vea)
        spResultado = new JScrollPane(taResultado);
        taResultado.setEditable(false); // No se puede editar el area de texto
        spResultado.setBounds(10,10,190,210); // Posición y tamaño
        this.add(spResultado);
    }

    // Método de acceso a la información
    public void mostrarResultado(double area, double perimetro)
    {
        taResultado.append("Área: " + area + "\nPerímetro: " + perimetro + "\n"); // Agrega el mensaje al area de texto
    }

    // Método para borrar el área de texto
    public void borrar()
    {
        taResultado.setText("");
    }
}