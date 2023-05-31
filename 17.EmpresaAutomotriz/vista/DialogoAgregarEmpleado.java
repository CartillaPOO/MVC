package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class DialogoAgregarEmpleado extends JDialog
{
    //
    // Atributos
    //

    private JLabel lbTitulo;
    private JPanel colorFondo1;
    private JPanel colorFondo2;
    private JLabel lbNombreVendedor;
    private JTextField tfNombreVendedor;
    private JLabel lbCedulaVendedor;
    private JTextField tfCedulaVendedor;
    private JButton btAgregar;
    private JButton btCancelar;

    private Font fontLabel = new Font("Arial", Font.BOLD, 20);
    private Font fontField = new Font("Arial", Font.BOLD, 15);

    //
    // Metodos
    //

    // Método constructor
    public DialogoAgregarEmpleado()
    {
        // Definición del contenedor de la ventana
        this.setLayout(null);

        // Creación y adición de elementos
        lbTitulo = new JLabel("Agregar empleado", JLabel.CENTER); // JLabel.CENTER: Centra el texto
        lbTitulo.setFont(fontLabel);
        lbTitulo.setForeground(Color.WHITE);
        lbTitulo.setBounds(0,20,340,25);
        this.add(lbTitulo);

        lbNombreVendedor = new JLabel("Vendedor: ", JLabel.RIGHT);
        lbNombreVendedor.setFont(fontField);
        lbNombreVendedor.setForeground(Color.WHITE);
        lbNombreVendedor.setBounds(0,70,150,20);
        this.add(lbNombreVendedor);

        tfNombreVendedor = new JTextField();
        tfNombreVendedor.setBorder(null);
        tfNombreVendedor.setFont(fontField);
        tfNombreVendedor.setForeground(Color.WHITE);
        tfNombreVendedor.setCaretColor(Color.WHITE);
        tfNombreVendedor.setBackground(new Color(59, 59, 59));
        tfNombreVendedor.setBounds(160,70,100, 20);
        this.add(tfNombreVendedor);

        lbCedulaVendedor = new JLabel("Cédula: ", JLabel.RIGHT);
        lbCedulaVendedor.setFont(fontField);
        lbCedulaVendedor.setForeground(Color.WHITE);
        lbCedulaVendedor.setBounds(0,100,150,20);
        this.add(lbCedulaVendedor);

        tfCedulaVendedor = new JTextField();
        tfCedulaVendedor.setBorder(null);
        tfCedulaVendedor.setFont(fontField);
        tfCedulaVendedor.setForeground(Color.WHITE);
        tfCedulaVendedor.setCaretColor(Color.WHITE);
        tfCedulaVendedor.setBackground(new Color(59, 59, 59));
        tfCedulaVendedor.setBounds(160,100,100, 20);
        this.add(tfCedulaVendedor);

        btAgregar = new JButton("Agregar");
        btAgregar.setBackground(new Color(59,59,59));
        btAgregar.setForeground(Color.WHITE);
        btAgregar.setActionCommand("agregar");
        btAgregar.setBounds(40,150,260,20);
        this.add(btAgregar);

        btCancelar = new JButton("Cancelar");
        btCancelar.setBackground(new Color(59,59,59));
        btCancelar.setForeground(Color.WHITE);
        btCancelar.setActionCommand("cancelarDialogoAgregarEmpleado");
        btCancelar.setBounds(40,180,260,20);
        this.add(btCancelar);

        // Características de la ventana
        this.setTitle("Carro");
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

    //Metodos de acceso
    public String getNombreVendedor()
    {
        return tfNombreVendedor.getText();
    }

    public String getCedulaVendedor()
    {
        return tfCedulaVendedor.getText();
    }

    public void agregarOyenteBoton(ActionListener pAL)
    {
        btAgregar.addActionListener(pAL);
        btCancelar.addActionListener(pAL);
    }

    public void cerrarDialogoAgregarEmpleado()
    {
        this.dispose();
    }
}
