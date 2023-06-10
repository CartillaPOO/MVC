package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelEntradaDatos extends JPanel
{
    //
    // Atributos
    //

    private JLabel lbTitulo;
    private JLabel lbNombreSalon;
    private JLabel lbCapacidadSalon;
    private JTextField tfNombreSalon;
    private JTextField tfCapacidadSalon;
    private Font fontLabel = new Font("Arial", Font.BOLD, 20);
    private Font fontField = new Font("Arial", Font.BOLD, 15);

    //
    // Métodos
    //

    // Método constructor
    public PanelEntradaDatos()
    {
        // Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(new Color(31,31,31));

        // Creación y adición de elementos
        lbTitulo = new JLabel("Registro de salón", JLabel.CENTER);
        lbTitulo.setFont(fontLabel);
        lbTitulo.setForeground(Color.WHITE);
        lbTitulo.setBounds(0,20,340,25);
        this.add(lbTitulo);

        lbNombreSalon = new JLabel("Salón: ", JLabel.RIGHT);
        lbNombreSalon.setFont(fontLabel);
        lbNombreSalon.setForeground(Color.WHITE);
        lbNombreSalon.setBounds(0,90,155,20);
        this.add(lbNombreSalon);

        lbCapacidadSalon = new JLabel("Capacidad: ", JLabel.RIGHT);
        lbCapacidadSalon.setFont(fontLabel);
        lbCapacidadSalon.setForeground(Color.WHITE);
        lbCapacidadSalon.setBounds(0,140,200,20);
        this.add(lbCapacidadSalon);

        tfNombreSalon = new JTextField();
        tfNombreSalon.setBackground(new Color(59,59,59));
        tfNombreSalon.setBorder(null);
        tfNombreSalon.setFont(fontField);
        tfNombreSalon.setForeground(Color.WHITE);
        tfNombreSalon.setCaretColor(Color.WHITE);
        tfNombreSalon.setBounds(155,90,95,20);
        this.add(tfNombreSalon);

        tfCapacidadSalon = new JTextField();
        tfCapacidadSalon.setBackground(new Color(59,59,59));
        tfCapacidadSalon.setBorder(null);
        tfCapacidadSalon.setFont(fontField);
        tfCapacidadSalon.setForeground(Color.WHITE);
        tfCapacidadSalon.setCaretColor(Color.WHITE);
        tfCapacidadSalon.setBounds(200,140,50,20);
        this.add(tfCapacidadSalon);
    }

    // Métodos de acceso
    public String getNombreSalon()
    {
        return tfNombreSalon.getText();
    }

    public int getCapacidadSalon()
    {
        return Integer.parseInt(tfCapacidadSalon.getText());
    }

    public void borrar()
    {
        tfNombreSalon.setText("");
        tfCapacidadSalon.setText("");
    }
}
