package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

public class DialogoVenderCarro extends JDialog
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbEmpleado;
    private JLabel lbPrecioCarro;
    private JTextField tfPrecioCarro;
    private JLabel lbMarcaCarro;
    private JTextField tfMarcaCarro;
    private JLabel lbModeloCarro;
    private JTextField tfModeloCarro;
    private JButton btVenderCarro;

    //----------------------
    // Metodos
    //----------------------
    public DialogoVenderCarro(String nom)
    {
        //Definición del layout del Dialogo
        this.setLayout(null);

        //Crear y agregar elementos
        lbEmpleado = new JLabel("Empleado: " + nom, JLabel.CENTER);
        lbEmpleado.setBounds(0,10,280,20);
        this.add(lbEmpleado);



        lbPrecioCarro = new JLabel("Precio Carro: ");
        lbPrecioCarro.setBounds(10,50,140,20);
        this.add(lbPrecioCarro);

        tfPrecioCarro = new JTextField();
        tfPrecioCarro.setBounds(150,50,100, 25);
        this.add(tfPrecioCarro);


        lbMarcaCarro = new JLabel("Marca Carro: ");
        lbMarcaCarro.setBounds(10,70,140,20);
        this.add(lbMarcaCarro);

        tfMarcaCarro = new JTextField();
        tfMarcaCarro.setBounds(150,70,100, 25);
        this.add(tfMarcaCarro);


        lbModeloCarro = new JLabel("Modelo Carro: ");
        lbModeloCarro.setBounds(10,90,140,20);
        this.add(lbModeloCarro);

        tfModeloCarro = new JTextField();
        tfModeloCarro.setBounds(150,90,100, 25);
        this.add(tfModeloCarro);



        btVenderCarro = new JButton("Vender");
        btVenderCarro.setBounds(20,140,260,25);
        btVenderCarro.setActionCommand("vender");
        this.add(btVenderCarro);

        //Caracteristicas de la ventana
        this.setTitle("Vender Carro");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    //Metodos de acceso
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
    }

    public void cerrarDialogoVenderCarro()
    {
        this.dispose();
    }
}
