package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

public class DialogoReservarSalon extends JDialog
{
    //
    // Atributos
    //

    private JLabel lbTitulo;
    private JPanel colorFondo1;
    private JPanel colorFondo2;
    private JLabel lbSalones;
    private JComboBox<String> cbSalones;
    private JLabel lbNumpersonas;
    private JTextField tfNumpersonas;
    private JLabel lbHorasReserva;
    private JTextField tfHorasReserva;
    private JButton btAceptar;
    private JButton btCancelar;
    private Font fontLabel = new Font("Arial", Font.BOLD, 20);
    private Font fontField = new Font("Arial", Font.BOLD, 15);

    //
    // Métodos
    //

    // Método constructor
    public DialogoReservarSalon()
    {
        // Definición del contenedor de la ventana
        this.setLayout(null);

        // Creación y adición de elementos
        cbSalones = new JComboBox<>();
        cbSalones.setBounds(150,70,150,20);
        this.add(cbSalones);

        lbTitulo = new JLabel("Reservar salón", JLabel.CENTER);
        lbTitulo.setFont(fontLabel);
        lbTitulo.setForeground(Color.WHITE);
        lbTitulo.setBounds(0,20,340,25);
        this.add(lbTitulo);

        lbSalones = new JLabel("Salon: ", JLabel.RIGHT);
        lbSalones.setFont(fontField);
        lbSalones.setForeground(Color.WHITE);
        lbSalones.setBounds(0,70,150,20);
        this.add(lbSalones);

        lbNumpersonas = new JLabel("Personas: ", JLabel.RIGHT);
        lbNumpersonas.setFont(fontField);
        lbNumpersonas.setForeground(Color.WHITE);
        lbNumpersonas.setBounds(0,100,150,20);
        this.add(lbNumpersonas);

        tfNumpersonas = new JTextField();
        tfNumpersonas.setBorder(null);
        tfNumpersonas.setFont(fontField);
        tfNumpersonas.setForeground(Color.WHITE);
        tfNumpersonas.setCaretColor(Color.WHITE);
        tfNumpersonas.setBackground(new Color(59,59,59));
        tfNumpersonas.setBounds(150,100,50,20);
        this.add(tfNumpersonas);

        lbHorasReserva = new JLabel("Horas: ", JLabel.RIGHT);
        lbHorasReserva.setFont(fontField);
        lbHorasReserva.setForeground(Color.WHITE);
        lbHorasReserva.setBounds(0,130,150,20);
        this.add(lbHorasReserva);

        tfHorasReserva = new JTextField();
        tfHorasReserva.setBorder(null);
        tfHorasReserva.setFont(fontField);
        tfHorasReserva.setForeground(Color.WHITE);
        tfHorasReserva.setCaretColor(Color.WHITE);
        tfHorasReserva.setBackground(new Color(59,59,59));
        tfHorasReserva.setBounds(150,130,50,20);
        this.add(tfHorasReserva);

        btAceptar = new JButton("Aceptar");
        btAceptar.setBackground(new Color(59,59,59));
        btAceptar.setForeground(Color.WHITE);
        btAceptar.setActionCommand("aceptar");
        btAceptar.setBounds(50,170,100,20);
        this.add(btAceptar);

        btCancelar = new JButton("Cancelar");
        btCancelar.setBackground(new Color(59,59,59));
        btCancelar.setForeground(Color.WHITE);
        btCancelar.setActionCommand("cancelar");
        btCancelar.setBounds(200,170,100,20);
        this.add(btCancelar);

        // Características de la ventana
        this.setUndecorated(true);
        this.setSize(340,230);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

        colorFondo1 = new JPanel();
        colorFondo1.setBackground(new Color(31,31,31));
        colorFondo1.setBounds(10,10,320,210);
        this.add(colorFondo1);

        colorFondo2 = new JPanel();
        colorFondo2.setBackground(new Color(24,24,24));
        colorFondo2.setBounds(0,0,340,230);
        this.add(colorFondo2);
    }

    // Métodos de acceso
    public int getNumPersonas()
    {
        return Integer.parseInt(tfNumpersonas.getText());
    }

    public int getHorasReserva()
    {
        return Integer.parseInt(tfHorasReserva.getText());
    }

    public int getIndexSalon()
    {
        return cbSalones.getSelectedIndex();
    }

    public void setSalon(String sal)
    {
        cbSalones.addItem(sal);
    }

    public void borrar()
    {
        tfNumpersonas.setText("");
        tfHorasReserva.setText("");
    }
    
    public void agregarOyenteBoton(ActionListener pAl)
    {
        btAceptar.addActionListener(pAl);
        btCancelar.addActionListener(pAl);
    }
}
