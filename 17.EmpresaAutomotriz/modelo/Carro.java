package modelo;

public class Carro 
{
    //----------------------
    // Atributos
    //----------------------
    private double precio;

    private String marca;
    private int modelo;

    //----------------------
    // Metodos
    //----------------------

    public Carro(double pPrecio, String pMarca, int pmodelo)
    {
        this.precio = pPrecio;
        this.marca = pMarca;
        this.modelo = pmodelo;
    }

    public double getPrecio()
    {
        return precio;
    }

    public String getMarca()
    {
        return marca;
    }

    public int getmodelo()
    {
        return modelo;
    }
}
