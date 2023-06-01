package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelEntradaDatos extends JPanel
{
    //
    // Atributos
    //

    private JLabel lbEmpleados;
    private JComboBox<String> cbEmpleados;
    private Font fontLabel = new Font("Arial", Font.BOLD, 20);

    //
    // Métodos
    //

    // Método constructor
    public PanelEntradaDatos()
    {
        // Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(new Color(31,31,31));

        // Creación y adición de etiqueta
        lbEmpleados = new JLabel("Empleados: ", JLabel.RIGHT);
        lbEmpleados.setFont(fontLabel);
        lbEmpleados.setForeground(Color.WHITE);
        lbEmpleados.setBounds(0,90,130,20);
        this.add(lbEmpleados);

        // Crear y agregar combo box de empleados
        cbEmpleados = new JComboBox<>();
        cbEmpleados.setBounds(130,90,200,20);
        this.add(cbEmpleados);
    }

    // Métodos de acceso
    public String getEmpleado()
    {
        return (String)cbEmpleados.getSelectedItem();
    }

    public int getIndexEmpleado()
    {
        return cbEmpleados.getSelectedIndex();
    }

    public void setEmpleado(String emp)
    {
        cbEmpleados.addItem(emp); // Agregar empleado al combo box
    }
}
