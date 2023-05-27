package controlador;

import modelo.Carro;
import modelo.Empleado;
import modelo.EmpresaAutomotriz;
import vista.VentanaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener
{
    //------------------
    // Atributos
    //------------------
    private VentanaPrincipal venPrin;
    private EmpresaAutomotriz empresa;

    //------------------
    // Metodos
    //------------------

    // Constructor
    public Controlador(VentanaPrincipal pVenPrin, EmpresaAutomotriz pEmpresa)
    {
        this.venPrin = pVenPrin;
        this.empresa = pEmpresa;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        this.venPrin.miPanelResultados.mostrarResultado("App lista para usar... \nSe han creado los siguientes tipos de objetos: \nVentanaPrincipal\nEmpresaAutomotriz\nControlador");
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        //Abrir ventana Agregar vendedor
        if(comando.equals("agregarVendedor"))
        {
            venPrin.crearDialogoAgregarVendedor();
            this.venPrin.miDialogoAgregarVendedor.agregarOyenteBoton(this);
        }

        //Agregar vendedor
        if(comando.equals("agregar"))
        {
            String nombre = venPrin.miDialogoAgregarVendedor.getNombreVendedor();
            int edad = venPrin.miDialogoAgregarVendedor.getEdadVendedor();
            int cedula = venPrin.miDialogoAgregarVendedor.getCedulaVendedor();
            empresa.agregarEmpleado(new Empleado(nombre, edad, cedula));
            venPrin.miPanelEntradaDatos.setEmpleado(nombre);
            venPrin.miPanelResultados.mostrarResultado("Se ha agreado un nuevo empleado. \nNombre: " + nombre + "\nEdad: " + edad + "\nCédula: " + cedula);
            venPrin.miDialogoAgregarVendedor.cerrarDialogoAgregarVendedor();
        }

        //Abrir ventana Vender un carro
        if(comando.equals("venderCarro"))
        {
            venPrin.crearDialogoVenderCarro();
            this.venPrin.miDialogoVenderCarro.agregarOyenteBoton(this);
        }

        //Vender carro
        if(comando.equals("vender"))
        {
            int indexVendedor = venPrin.miPanelEntradaDatos.getIndexEmpleado();

            double precio = Double.parseDouble(venPrin.miDialogoVenderCarro.getPrecioCarro());
            String marca = venPrin.miDialogoVenderCarro.getMarcaCarro();
            int modelo = Integer.parseInt(venPrin.miDialogoVenderCarro.getModeloCarro());

            Empleado emp = empresa.getEmpleado(indexVendedor);
            
            emp.venderCarro(new Carro(precio, marca, modelo));

            venPrin.miPanelResultados.mostrarResultado("El empleado: " + emp.getNombre() + " ha vendido un carro\nValor: " + precio + "\nMarca: " + marca + "\nModelo: " + modelo);
            venPrin.miDialogoVenderCarro.cerrarDialogoVenderCarro();
        }

        //Ver ventas
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

        //Calcular el sueldo de un vendedor
        if(comando.equals("calcularSueldo"))
        {
            int indexVendedor = venPrin.miPanelEntradaDatos.getIndexEmpleado();
            Empleado emple = empresa.getEmpleado(indexVendedor);
            emple.calcularSueldo();
            venPrin.miPanelResultados.mostrarResultado("El sueldo del empleado: " + emple.getNombre() + " es " + emple.getSueldo());
        }

        //Liquidar nomina total empresa
        if(comando.equals("liquidarNomina"))
        {
            double valorNomina = empresa.calcularNomina();
            String listaEmpleados = "";
            for(int i=0; i<empresa.getNumeroEmpleados(); i++)
            {
                listaEmpleados = listaEmpleados + empresa.getEmpleado(i).getNombre() + ": " + empresa.getEmpleado(i).getSueldo() + "\n";
            }
            venPrin.miPanelResultados.mostrarResultado("El valor total de la nómina es." + valorNomina + "\n" + listaEmpleados);
        }

        //Ver Empleado del mes
        if(comando.equals("empleadoDelMes"))
        {
            Empleado empleadoDelMes = empresa.getEmpleadoDelMes();
            venPrin.miPanelResultados.mostrarResultado("El empleado del mes es: " + empleadoDelMes.getNombre());
        }

        //Ver empleados sin ventas
        if(comando.equals("empleadosSinVentas"))
        {
            venPrin.miPanelResultados.mostrarResultado(empresa.verEmpleadosSinVentas());
        }

        //Salir
        if(comando.equals("salir"))
        {
            System.exit(0);
        }  
    }
}
