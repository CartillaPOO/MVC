package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class DialogoAgregarVendedor extends JDialog
{
    //
    // Atributos
    //

    private JPanel colorFondo;
    private JLabel lbNombreVendedor;
    private JTextField tfNombreVendedor;
    private JLabel lbCedulaVendedor;
    private JTextField tfCedulaVendedor;
    private JButton btAgregar;

    private Font fontLabel = new Font("Arial", Font.BOLD, 20);
    private Font fontField = new Font("Arial", Font.BOLD, 15);

    //
    // Metodos
    //

    // Método constructor
    public DialogoAgregarVendedor()
    {
        // Definición del contenedor de la ventana
        this.setLayout(null);

        // Creación y adición de elementos
        lbNombreVendedor = new JLabel("Vendedor: ");
        lbNombreVendedor.setBounds(10,50,140,20);
        this.add(lbNombreVendedor);

        tfNombreVendedor = new JTextField();
        tfNombreVendedor.setBounds(150,50,100, 25);
        this.add(tfNombreVendedor);

        lbCedulaVendedor = new JLabel("Cédula: ");
        lbCedulaVendedor.setBounds(10,90,140,20);
        this.add(lbCedulaVendedor);

        tfCedulaVendedor = new JTextField();
        tfCedulaVendedor.setBounds(150,90,100, 25);
        this.add(tfCedulaVendedor);



        btAgregar = new JButton("Agregar");
        btAgregar.setBounds(20,140,260,25);
        btAgregar.setActionCommand("agregar");
        this.add(btAgregar);

        // Características de la ventana
        this.setTitle("Agregar Vendedor");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
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
    }

    public void cerrarDialogoAgregarVendedor()
    {
        this.dispose();
    }
}
