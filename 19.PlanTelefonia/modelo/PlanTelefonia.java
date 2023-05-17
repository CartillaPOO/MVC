package modelo;

public class PlanTelefonia
{
    // Atributos

    private String numeroCelular;
    private String operador;
    private int cantidadMinutos;
    private int valorMinuto;
    private int costoPlan;

    // Metodos

    public PlanTelefonia()
    {

    }

    public PlanTelefonia(String pNumeroCelular, String pOperador, int pCantidadMinutos)
    {
        this.numeroCelular = pNumeroCelular;
        this.operador = pOperador;
        this.cantidadMinutos = pCantidadMinutos;
    }

    public void setNumeroCelular(String numeroCelular)
    {
        this.numeroCelular = numeroCelular;
    }
    
    public void setOperador(String operador)
    {
        this.operador = operador;
    }
    
    public void setCantidadMinutos(int cantidadMinutos)
    {
        this.cantidadMinutos = cantidadMinutos;
    }
    
    public void setCostoPlan(int costoPlan)
    {
        this.costoPlan = costoPlan;
    }



    public String getNumeroCelular() 
    {
        return numeroCelular;
    }

    public String getOperador() 
    {
        return operador;
    }

    public int getCantidadMinutos() 
    {
        return cantidadMinutos;
    }

    public double getCostoPlan() 
    {
        calcularCostoPlan();
        return costoPlan;
    }


    public int calcularCostoPlan()
    {
        valorMinuto = 250;
        costoPlan = cantidadMinutos * valorMinuto;

        if(operador.equals("Wom"))
        {
            costoPlan *= 0.5;
        }

        return costoPlan;
    }
}