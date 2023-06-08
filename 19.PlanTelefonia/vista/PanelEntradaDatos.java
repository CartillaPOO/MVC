package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class PanelEntradaDatos extends JPanel
{
    //
    // Atributos
    //

    private JRadioButton rbWom; // RadioButton es un botón de selección
    private JRadioButton rbOtro; // Este y el anterior serán las opciones de operador
    private ButtonGroup grupo; // Grupo de botones de selección
    private JLabel lbOperadores;
    private JLabel lbNumeroCelular;
    private JLabel lbCantidadMinutos;
    private JLabel lbValorMinuto;
    private JTextField tfNumeroCelular;
    private JTextField tfCantidadMinutos;
    private JTextField tfValorMinuto;
    private Font fontLabel = new Font("Arial", Font.BOLD, 20);
    private Font fontField = new Font("Arial", Font.BOLD, 15);
    
    //
    // Métodos
    //

    public PanelEntradaDatos()
    {
        // Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(new Color(31,31,31));
        
        lbOperadores = new JLabel("Operadores", JLabel.CENTER);
        lbOperadores.setFont(fontLabel);
        lbOperadores.setForeground(Color.WHITE);
        lbOperadores.setBounds(0,30,340,20);
        this.add(lbOperadores);

        // Creación y adición de elementos
        rbWom = new JRadioButton("Wom");
        rbWom.setBackground(new Color(31,31,31));
        rbWom.setFont(fontField);
        rbWom.setForeground(Color.WHITE);
        rbWom.setBounds(100,60,60,20);
        this.add(rbWom);

        rbOtro = new JRadioButton("Otro");
        rbOtro.setBackground(new Color(31,31,31));
        rbOtro.setFont(fontField);
        rbOtro.setForeground(Color.WHITE);
        rbOtro.setSelected(true); // Está seleccionado por defecto
        rbOtro.setBounds(190,60,60,20);
        this.add(rbOtro);

        grupo = new ButtonGroup(); // Se crea el grupo de botones de selección y se agregan los botones para que solo se pueda seleccionar uno a la vez
        this.grupo.add(rbWom);
        this.grupo.add(rbOtro);
        
        lbNumeroCelular = new JLabel("Número de celular: ", JLabel.RIGHT);
        lbNumeroCelular.setFont(fontLabel);
        lbNumeroCelular.setForeground(Color.WHITE);
        lbNumeroCelular.setBounds(0,110,220,20);
        this.add(lbNumeroCelular);

        lbCantidadMinutos = new JLabel("Cantidad de minutos: ", JLabel.RIGHT);
        lbCantidadMinutos.setFont(fontLabel);
        lbCantidadMinutos.setForeground(Color.WHITE);
        lbCantidadMinutos.setBounds(0,140,220,20);
        this.add(lbCantidadMinutos);

        lbValorMinuto = new JLabel("Valor del minuto: ", JLabel.RIGHT);
        lbValorMinuto.setFont(fontLabel);
        lbValorMinuto.setForeground(Color.WHITE);
        lbValorMinuto.setBounds(0,170,220,20);
        this.add(lbValorMinuto);

        tfNumeroCelular = new JTextField();
        tfNumeroCelular.setBackground(new Color(59,59,59));
        tfNumeroCelular.setBorder(null);
        tfNumeroCelular.setFont(fontField);
        tfNumeroCelular.setForeground(Color.WHITE);
        tfNumeroCelular.setCaretColor(Color.WHITE);
        tfNumeroCelular.setBounds(220, 110, 90, 20);
        this.add(tfNumeroCelular);

        tfCantidadMinutos = new JTextField();
        tfCantidadMinutos.setBackground(new Color(59,59,59));
        tfCantidadMinutos.setBorder(null);
        tfCantidadMinutos.setFont(fontField);
        tfCantidadMinutos.setForeground(Color.WHITE);
        tfCantidadMinutos.setCaretColor(Color.WHITE);
        tfCantidadMinutos.setBounds(220, 140, 40, 20);
        this.add(tfCantidadMinutos);

        tfValorMinuto = new JTextField();
        tfValorMinuto.setBackground(new Color(59,59,59));
        tfValorMinuto.setBorder(null);
        tfValorMinuto.setFont(fontField);
        tfValorMinuto.setForeground(Color.WHITE);
        tfValorMinuto.setCaretColor(Color.WHITE);
        tfValorMinuto.setBounds(220, 170, 40, 20);
        this.add(tfValorMinuto);
    }

    // Métodos de acceso
    public String getOperador()
    {
        if(rbWom.isSelected())
        {
            return "Wom";
        }
        else
        {
            return "Otro";
        }
    }

    public String getNumero()
    {
        return tfNumeroCelular.getText();
    }

    public int getMinutos()
    {
        return Integer.parseInt(tfCantidadMinutos.getText());
    }

    public double getValorMinuto()
    {
        return Double.parseDouble(tfValorMinuto.getText());
    }

    public void borrar()
    {
        tfNumeroCelular.setText("");
        tfCantidadMinutos.setText("");
        tfValorMinuto.setText("");
        rbOtro.setSelected(false);
        rbWom.setSelected(false);
    }
}