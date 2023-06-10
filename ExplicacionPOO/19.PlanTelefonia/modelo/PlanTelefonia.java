package modelo;

public class PlanTelefonia
{
    //
    // Atributos
    //

    private String numeroCelular;
    private String operador;
    private int cantidadMinutos;
    private double valorMinuto;
    private double costoPlan;

    //
    // Métodos
    //

    public PlanTelefonia(String pNumeroCelular, String pOperador, int pCantidadMinutos, double pValorMinuto)
    {
        this.numeroCelular = pNumeroCelular;
        this.operador = pOperador;
        this.cantidadMinutos = pCantidadMinutos;
        this.valorMinuto = pValorMinuto;
    }

    public PlanTelefonia(String pNumeroCelular, int pCantidadMinutos, double pValorMinuto)
    {
        this.numeroCelular = pNumeroCelular;
        this.operador = "Otro";
        this.cantidadMinutos = pCantidadMinutos;
        this.valorMinuto = pValorMinuto;
    }

    public double calcularCostoPlan()
    {
        costoPlan = cantidadMinutos * valorMinuto;

        if(operador.equals("Wom"))
        {
            costoPlan *= 0.5;
        }

        return costoPlan;
    }

    public String getNumeroCelular()
    {
        return numeroCelular;
    }
}