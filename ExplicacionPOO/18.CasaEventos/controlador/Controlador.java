package controlador;

import modelo.Salon;
import modelo.CasaEventos;
import vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener
{
    //
    // Atributos
    //

    private VentanaPrincipal venPrin;
    private CasaEventos casa;

    //
    // Métodos
    //

    // Método constructor
    public Controlador(VentanaPrincipal pVenPrin, CasaEventos pcasa)
    {
        this.venPrin = pVenPrin;
        this.casa = pcasa;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        this.venPrin.miPanelResultados.mostrarResultado("Sistema de registro de salones\nde la casa de eventos\n\nPor favor, registre un salón");
        this.venPrin.crearDialogoReservarSalon(); // Para agregar elementos al combobox del diálogo, se debe crear antes de agregarlos
        this.venPrin.miDialogoReservarSalon.setVisible(false); // Se oculta para que no se vea el diálogo
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        if(comando.equals("registrar"))
        {
            String nombre = venPrin.miPanelEntradaDatos.getNombreSalon();
            int capacidad = venPrin.miPanelEntradaDatos.getCapacidadSalon();
            String recargo = "";

            casa.agregarSalon(new Salon(nombre, capacidad));
            venPrin.miDialogoReservarSalon.setSalon(nombre);
            
            if(capacidad > 50)
            {
                recargo = "\nSe cobra un recargo del 40%";
            }
            else
            {
                recargo = "\nSe cobra un recargo del 20%";
            }
            
            venPrin.miPanelResultados.mostrarResultado("Nuevo salón registrado\n\nNombre: " + nombre + "\nCapacidad: " + capacidad + "\n" + recargo);
            venPrin.miPanelEntradaDatos.borrar();
            venPrin.miPanelOperaciones.activarBotones();
        }
        
        if(comando.equals("reservar"))
        {
            venPrin.miDialogoReservarSalon.setVisible(true); // Se muestra el diálogo
            venPrin.miDialogoReservarSalon.agregarOyenteBoton(this);
        }

        if(comando.equals("aceptar"))
        {
            int indexSalon = venPrin.miDialogoReservarSalon.getIndexSalon();
            Salon sal = casa.getSalon(indexSalon);
            int numPersonas = venPrin.miDialogoReservarSalon.getNumPersonas();
            int horasReserva = venPrin.miDialogoReservarSalon.getHorasReserva();
            
            if (numPersonas > sal.getCapacidadSalon() || numPersonas < 0 || horasReserva <= 0)
            {
                venPrin.miPanelResultados.mostrarResultado("Ha ocurrido un error\nSe ha ingresado un valor inválido");
                venPrin.miDialogoReservarSalon.setVisible(false); // Se oculta el diálogo nuevamente
            }

            else
            {
                sal.setNumPersonas(numPersonas);
                sal.setHorasReserva(horasReserva);
                venPrin.miPanelResultados.mostrarResultado("Salón: " + sal.getNombreSalon() + "\nEstado: " + sal.estadoSalon());
                venPrin.miDialogoReservarSalon.setVisible(false);
            }

            venPrin.miDialogoReservarSalon.borrar(); // Se borran los datos del diálogo para que no se vean al volver a abrirlo
        }
        
        if(comando.equals("cancelar"))
        {
            venPrin.miDialogoReservarSalon.setVisible(false);
            venPrin.miDialogoReservarSalon.borrar();
        }
        
        if (comando.equals("lista"))
        {
            Salon sal; // Variable temporal para almacenar el salón actual
            String listaSalones = "";

            for (int i = 0; i < casa.getNumSalones(); i++) 
            {
                sal = casa.getSalon(i); 

                listaSalones += "\nSalón: " + sal.getNombreSalon() + "\nCapacidad: " + sal.getCapacidadSalon() + "\nEstado: " + sal.estadoSalon() + "\n";
            }

            venPrin.miPanelResultados.mostrarResultado("Salones registrados:\n" + listaSalones);
        }


        if(comando.equals("salir"))
        {
            System.exit(0);
        }
    }
}