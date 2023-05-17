package modelo;

public class Salon
{

    // Constante

    public final static int COSTO_BASE = 150000;

    // Atributos

    private int capacidadSalon;
    private int numPersonas;
    private int numMeseros;
    private double costoSalon;
    private int cantidadHoras;

    // Métodos

    public Salon(int pNumPersonas, int pCapacidadSalon, int pCantidadHoras)
    {
        this.numPersonas = pNumPersonas;
        this.capacidadSalon = pCapacidadSalon;
        this.cantidadHoras = pCantidadHoras;
    }

    public int getNumPersonas()
    {
        return numPersonas;
    }

    public int getCapacidadSalon()
    {
        return capacidadSalon;
    }

    public int getMeserosNecesarios()
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
        costoSalon = COSTO_BASE * cantidadHoras;
        
        if(capacidadSalon <= 50)
        {

            costoSalon += costoSalon * 0.2;
        }

        else
        {
            costoSalon += costoSalon * 0.4;
        }

        return costoSalon;
    }
}
