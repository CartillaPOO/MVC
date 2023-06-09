package modelo;

public class Salon
{
    //
    // Atributos
    //

    public final static int COSTO_BASE = 150000;
    private String nombre;
    private int capacidad;
    private int numPersonas;
    private int horasReserva;
    private int numMeseros;
    private double costo;
    private String estado;
    
    //
    // Métodos
    //
    
    // Método constructor
    public Salon(String pnombre, int pcapacidad)
    {
        this.nombre = pnombre;
        this.capacidad = pcapacidad;
        this.estado = "Disponible";
    }

    public void setNumPersonas(int pNumPersonas)
    {
        this.numPersonas = pNumPersonas;
    }

    public void setHorasReserva(int pHorasReserva)
    {
        this.horasReserva = pHorasReserva;
    }
    

    
    public String getNombreSalon()
    {
        return nombre;
    }
    
    public int getCapacidadSalon()
    {
        return capacidad;
    }
    
    public int getNumMeseros()
    {
        if(numPersonas < 50)
        {
            numMeseros = 1;
        }
        
        else if(numPersonas < 100)
        {
            numMeseros = 2;
        }
        
        else
        {
            numMeseros = 3;
        }
        
        return numMeseros;
    }
    
    public double getCostoSalon()
    { 
        costo = COSTO_BASE * horasReserva;
        
        if(capacidad <= 50)
        {
            
            costo += costo * 0.2;
        }
        
        else
        {
            costo += costo * 0.4;
        }
        
        return costo;
    }

    public String estadoSalon()
    {
        if(numPersonas != 0 && horasReserva != 0)
        {
            estado = "Reservado\nNúmero de personas: " + numPersonas + "\nHoras de reserva: " + horasReserva + "\nNúmero de meseros: " + getNumMeseros() + "\nCosto: " + getCostoSalon();
        }

        return estado;
    }
}
