package modelo;

public class Fecha
{
    //
    // Atributos
    //
    private int dia;
    private int mes;
    private int anio;
    
    //
    // Métodos
    //
    public Fecha(int d, int m, int a)
    {
        this.dia = d;
        this.mes = m;
        this.anio = a;
    }
    
    public int getDia() 
    {
        return dia;
    }
    public int getMes() 
    {
        return mes;
    }
    public int getAnio() 
    {
        return anio;
    }
    
    public void setDia(int d) 
    {
        this.dia = d;
    }
    public void setMes(int m) 
    {
        this.mes = m;
    }
    public void setAnio(int a) 
    {
        this.anio = a;
    }

    public String toString()
    {
        return dia + "/" + mes + "/" + anio;
    }

    public boolean equals(Object o)
    {
        Fecha otra = (Fecha)o;
        return (dia==otra.dia) && (mes==otra.mes) && (anio==otra.anio);
    }
}