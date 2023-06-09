package controlador;

import modelo.Carro;
import modelo.Empleado;
import modelo.EmpresaAutomotriz;
import vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener
{
    //
    // Atributos
    //

    private VentanaPrincipal venPrin;
    private EmpresaAutomotriz empresa;

    //
    // Métodos
    //

    // Método constructor
    public Controlador(VentanaPrincipal pVenPrin, EmpresaAutomotriz pEmpresa)
    {
        this.venPrin = pVenPrin;
        this.empresa = pEmpresa;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        this.venPrin.miPanelResultados.mostrarResultado("App lista para usar\n");
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        if(comando.equals("agregarEmpleado"))
        {
            venPrin.crearDialogoAgregarEmpleado();
            this.venPrin.miDialogoAgregarEmpleado.agregarOyenteBoton(this);
        }

        if(comando.equals("agregar"))
        {
            String nombre = venPrin.miDialogoAgregarEmpleado.getNombreVendedor();
            String cedula = venPrin.miDialogoAgregarEmpleado.getCedulaVendedor();

            empresa.agregarEmpleado(new Empleado(nombre, cedula));
            venPrin.miPanelEntradaDatos.setEmpleado(nombre);
            venPrin.miPanelResultados.mostrarResultado("Se ha agreado un empleado \nNombre: " + nombre + "\nCédula: " + cedula);
            venPrin.miPanelOperaciones.activarBotones();
            venPrin.miDialogoAgregarEmpleado.cerrarDialogoAgregarEmpleado();
        }

        if(comando.equals("cerrarDialogoAgregarEmpleado"))
        {
            venPrin.miDialogoAgregarEmpleado.cerrarDialogoAgregarEmpleado();
        }

        if(comando.equals("venderCarro"))
        {
            venPrin.crearDialogoVenderCarro();
            this.venPrin.miDialogoVenderCarro.agregarOyenteBoton(this);
        }

        if(comando.equals("vender"))
        {
            int indexEmpleado = venPrin.miPanelEntradaDatos.getIndexEmpleado();
            double precio = Double.parseDouble(venPrin.miDialogoVenderCarro.getPrecioCarro());
            String marca = venPrin.miDialogoVenderCarro.getMarcaCarro();
            int modelo = Integer.parseInt(venPrin.miDialogoVenderCarro.getModeloCarro());

            Empleado emp = empresa.getEmpleado(indexEmpleado);
            
            emp.venderCarro(new Carro(precio, marca, modelo));

            venPrin.miPanelResultados.mostrarResultado("Se ha realizado una venta" + "\nEmpleado: " + emp.getNombre() + "\nValor: " + precio + "\nMarca: " + marca + "\nModelo: " + modelo);
            venPrin.miDialogoVenderCarro.cerrarDialogoVenderCarro();
        }

        if(comando.equals("cerrarDialogoVenderCarro"))
        {
            venPrin.miDialogoVenderCarro.cerrarDialogoVenderCarro();
        }

        if(comando.equals("verVentas"))
        {
            int indexVendedor = venPrin.miPanelEntradaDatos.getIndexEmpleado();
            Empleado emple = empresa.getEmpleado(indexVendedor);

            emple.ordenarCarros();
            
            for (int i = 0; i < emple.getVentas(); i++)
            {
                venPrin.miPanelResultados.mostrarResultado(emple.verVentas());
            }
        }

        if(comando.equals("calcularSueldo"))
        {
            int indexVendedor = venPrin.miPanelEntradaDatos.getIndexEmpleado();
            Empleado emple = empresa.getEmpleado(indexVendedor);
            emple.calcularSueldo();
            venPrin.miPanelResultados.mostrarResultado("El sueldo del empleado: " + emple.getNombre() + " es " + emple.getSueldo());
        }

        if(comando.equals("liquidarNomina"))
        {
            double valorNomina = empresa.getNomina();
            String listaEmpleados = "";
            for(int i=0; i<empresa.getNumeroEmpleados(); i++)
            {
                listaEmpleados = listaEmpleados + empresa.getEmpleado(i).getNombre() + ": " + empresa.getEmpleado(i).getSueldo() + "\n";
            }
            venPrin.miPanelResultados.mostrarResultado("El valor total de la nómina es." + valorNomina + "\n" + listaEmpleados);
        }

        if(comando.equals("empleadoDelMes"))
        {
            Empleado empleadoDelMes = empresa.getEmpleadoDelMes();
            venPrin.miPanelResultados.mostrarResultado("El empleado del mes es: " + empleadoDelMes.getNombre());
        }

        if(comando.equals("empleadosSinVentas"))
        {
            venPrin.miPanelResultados.mostrarResultado(empresa.verEmpleadosSinVentas());
        }

        if(comando.equals("salir"))
        {
            System.exit(0);
        }
    }
}
