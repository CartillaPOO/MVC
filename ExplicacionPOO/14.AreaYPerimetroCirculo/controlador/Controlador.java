package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Circulo;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    // 
    // Atributos
    //

    private VentanaPrincipal venPrin; // Se crea un objeto de la clase VentanaPrincipal
    private Circulo model;

    //
    // Métodos
    //

    // Método constructor
    public Controlador(VentanaPrincipal pVenPrin, Circulo pModel) // Se pasan los objetos como parámetros
    {
        this.venPrin = pVenPrin; // venPrin es un objeto de la clase VentanaPrincipal
        this.model = pModel; // model es un objeto de la clase Circulo
        this.venPrin.miPanelOperaciones.btCalcular.addActionListener(this); // Los eventos se escuchan desde aquí
        this.venPrin.miPanelOperaciones.btBorrar.addActionListener(this);
        this.venPrin.miPanelOperaciones.btSalir.addActionListener(this);
    }

    // Método de atencion a eventos
    @Override // Sobreescribir el método actionPerformed de la interfaz ActionListener
    public void actionPerformed(ActionEvent ae) // Se crea un objeto de la clase ActionEvent
    {
        // Identificar el comando generado
        String comando = ae.getActionCommand();

        if(comando.equals("calcular"))
        {
            double radio = Double.parseDouble(venPrin.miPanelEntradaDatos.getRadio());
            model.setRadio(radio);
            model.calcularArea();
            double area = model.getArea();
            model.calcularPerimetro();
            double perimetro = model.getperimetro();
            venPrin.miPanelResultados.mostrarResultado(area, perimetro);
        }
        
        if(comando.equals("salir"))
        {
            System.exit(0);
        }

        if(comando.equals("borrar"))
        {
            this.venPrin.miPanelEntradaDatos.borrar(); // Limpiar los campos de texto
            this.venPrin.miPanelResultados.borrar();
        }
    }
}