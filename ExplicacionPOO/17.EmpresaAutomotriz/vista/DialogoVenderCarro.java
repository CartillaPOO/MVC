package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

public class DialogoVenderCarro extends JDialog
{
    //
    // Atributos
    //

    private JLabel lbTitulo;
    private JPanel colorFondo1;
    private JPanel colorFondo2;
    private JLabel lbEmpleado;
    private JLabel lbPrecioCarro;
    private JTextField tfPrecioCarro;
    private JLabel lbMarcaCarro;
    private JTextField tfMarcaCarro;
    private JLabel lbModeloCarro;
    private JTextField tfModeloCarro;
    private JButton btVenderCarro;
    private JButton btCancelar;
    private Font fontLabel = new Font("Arial", Font.BOLD, 20);
    private Font fontField = new Font("Arial", Font.BOLD, 15);

    //
    // Métodos
    //

    public DialogoVenderCarro(String nom)
    {
        // Definición del layout del Dialogo
        this.setLayout(null);

        // Crear y agregar elementos
        lbTitulo = new JLabel("Venta de Carro", JLabel.CENTER); // JLabel.CENTER: Centra el texto
        lbTitulo.setFont(fontLabel);
        lbTitulo.setForeground(Color.WHITE);
        lbTitulo.setBounds(0,20,340,25);
        this.add(lbTitulo);

        lbEmpleado = new JLabel("Empleado: " + nom, JLabel.CENTER);
        lbEmpleado.setFont(fontField);
        lbEmpleado.setForeground(Color.WHITE);
        lbEmpleado.setBounds(0,50,340,20);
        this.add(lbEmpleado);

        lbPrecioCarro = new JLabel("Precio:", JLabel.RIGHT);
        lbPrecioCarro.setFont(fontField);
        lbPrecioCarro.setForeground(Color.WHITE);
        lbPrecioCarro.setBounds(0,80,160,20);
        this.add(lbPrecioCarro);

        tfPrecioCarro = new JTextField("5000");
        tfPrecioCarro.setBackground(new Color(59,59,59));
        tfPrecioCarro.setBorder(null);
        tfPrecioCarro.setFont(fontField);
        tfPrecioCarro.setForeground(Color.WHITE);
        tfPrecioCarro.setCaretColor(Color.WHITE);
        tfPrecioCarro.setBounds(170,80,80,20);
        this.add(tfPrecioCarro);

        lbMarcaCarro = new JLabel("Marca:", JLabel.RIGHT);
        lbMarcaCarro.setFont(fontField);
        lbMarcaCarro.setForeground(Color.WHITE);
        lbMarcaCarro.setBounds(0,110,160,20);
        this.add(lbMarcaCarro);

        tfMarcaCarro = new JTextField("Ford");
        tfMarcaCarro.setBackground(new Color(59, 59, 59));
        tfMarcaCarro.setBorder(null);
        tfMarcaCarro.setFont(fontField);
        tfMarcaCarro.setForeground(Color.WHITE);
        tfMarcaCarro.setCaretColor(Color.WHITE);
        tfMarcaCarro.setBounds(170,110,80,20);
        this.add(tfMarcaCarro);

        lbModeloCarro = new JLabel("Modelo:", JLabel.RIGHT);
        lbModeloCarro.setFont(fontField);
        lbModeloCarro.setForeground(Color.WHITE);
        lbModeloCarro.setBounds(0,140,160,20);
        this.add(lbModeloCarro);

        tfModeloCarro = new JTextField("2013");
        tfModeloCarro.setBackground(new Color(59, 59, 59));
        tfModeloCarro.setBorder(null);
        tfModeloCarro.setFont(fontField);
        tfModeloCarro.setForeground(Color.WHITE);
        tfModeloCarro.setCaretColor(Color.WHITE);
        tfModeloCarro.setBounds(170,140,30,20);
        this.add(tfModeloCarro);

        btVenderCarro = new JButton("Vender");
        btVenderCarro.setBackground(new Color(59,59,59));
        btVenderCarro.setForeground(Color.WHITE);
        btVenderCarro.setActionCommand("vender");
        btVenderCarro.setBounds(35,180,120,20);
        this.add(btVenderCarro);

        btCancelar = new JButton("Cancelar");
        btCancelar.setBackground(new Color(59,59,59));
        btCancelar.setForeground(Color.WHITE);
        btCancelar.setActionCommand("cerrarDialogoVenderCarro");
        btCancelar.setBounds(185,180,120,20);
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
    public String getPrecioCarro()
    {
        return tfPrecioCarro.getText();
    }

    public String getMarcaCarro()
    {
        return tfMarcaCarro.getText();
    }

    public String getModeloCarro()
    {
        return tfModeloCarro.getText();
    }

    public void agregarOyenteBoton(ActionListener pAL)
    {
        btVenderCarro.addActionListener(pAL);
        btCancelar.addActionListener(pAL);
    }

    public void cerrarDialogoVenderCarro()
    {
        this.dispose();
    }
}
