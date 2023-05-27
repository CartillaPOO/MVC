package vista;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelOperaciones extends JPanel
{
    //
    // Atributos
    //
    private JButton btAgregarVendedor;
    private JButton btVenderCarro;
    private JButton btCalcularSueldo;
    private JButton btLiquidarNomina;
    private JButton btVerVentas;
    private JButton btEmpleadoDelMes;
    private JButton btEmpleadosSinVentas;

    //
    // Metodos
    //

    // Constructor
    public PanelOperaciones()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(new Color(31,31,31));

        // Creación y adición de los botones
        btAgregarVendedor = new JButton("Agregar Vendedor");
        btAgregarVendedor.setBackground(new Color(59,59,59));
        btAgregarVendedor.setForeground(Color.WHITE);
        btAgregarVendedor.setActionCommand("agregarVendedor");
        btAgregarVendedor.setBounds(15,10,170,80);
        this.add(btAgregarVendedor);
        
        btVenderCarro = new JButton("Vender Carro");
        btVenderCarro.setBackground(new Color(59,59,59));
        btVenderCarro.setForeground(Color.WHITE);
        btVenderCarro.setActionCommand("venderCarro");
        btVenderCarro.setBounds(195,10,170,20); 
        this.add(btVenderCarro);

        btCalcularSueldo = new JButton("Calcular Sueldo");
        btCalcularSueldo.setBackground(new Color(59,59,59));
        btCalcularSueldo.setForeground(Color.WHITE);
        btCalcularSueldo.setActionCommand("calcularSueldo");
        btCalcularSueldo.setBounds(375,70,170,20);
        this.add(btCalcularSueldo);

        btLiquidarNomina = new JButton("Liquidar Nómina");
        btLiquidarNomina.setBackground(new Color(59,59,59));
        btLiquidarNomina.setForeground(Color.WHITE);
        btLiquidarNomina.setActionCommand("liquidarNomina");
        btLiquidarNomina.setBounds(375,10,170,20); 
        this.add(btLiquidarNomina);

        btVerVentas = new JButton("Ver ventas");
        btVerVentas.setBackground(new Color(59,59,59));
        btVerVentas.setForeground(Color.WHITE);
        btVerVentas.setActionCommand("verVentas");
        btVerVentas.setBounds(195, 70, 170, 20);
        this.add(btVerVentas);

        btEmpleadoDelMes = new JButton("Empleado del mes");
        btEmpleadoDelMes.setBackground(new Color(59,59,59));
        btEmpleadoDelMes.setForeground(Color.WHITE);
        btEmpleadoDelMes.setActionCommand("empleadoDelMes");
        btEmpleadoDelMes.setBounds(375, 40, 170, 20);
        this.add(btEmpleadoDelMes);

        btEmpleadosSinVentas = new JButton("Empleados sin ventas");
        btEmpleadosSinVentas.setBackground(new Color(59,59,59));
        btEmpleadosSinVentas.setForeground(Color.WHITE);
        btEmpleadosSinVentas.setActionCommand("empleadosSinVentas");
        btEmpleadosSinVentas.setBounds(195, 40, 170, 20);
        this.add(btEmpleadosSinVentas);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btAgregarVendedor.addActionListener(pAL);
        btVenderCarro.addActionListener(pAL);
        btCalcularSueldo.addActionListener(pAL);
        btLiquidarNomina.addActionListener(pAL);
        btVerVentas.addActionListener(pAL);
        btEmpleadoDelMes.addActionListener(pAL);
        btEmpleadosSinVentas.addActionListener(pAL);
    }
}
