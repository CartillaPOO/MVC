package modelo;

public class Circulo
{
    //
    // Atributos
    //

    private double radio;
    private double area;
    private double perimetro;

    //
    // Métodos
    //
    
    public void setRadio(double radio) // Sirve para asignar un valor al atributo radio
    {
        this.radio = radio;
    }

    public void calcularArea()
    {
        area = Math.PI*radio*radio;
    }

    public void calcularPerimetro()
    {
        perimetro = 2*Math.PI*radio;
    }

    public double getArea() // Sirve para obtener el valor del atributo area
    {
        return area;
    }

    public double getperimetro()
    {
        return perimetro;
    }
}