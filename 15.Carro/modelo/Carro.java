package modelo;

public class Carro 
{
    //
    // Atributos
    //

    private static int numRuedas = 4; // Es static porque todos los objetos de la clase Carro comparten el mismo valor
    private String color;
    private int posX;
    private int posY;
    private int velocidad;
    
    //
    // Métodos
    //
    
    // Método constructor
    public Carro(String pColor, int pPosX, int pPosY)
    {
        this.color = pColor;
        this.posX = pPosX;
        this.posY = pPosY;
        this.velocidad = 0;
    }
    
    public int getNumRuedas()
    {
        return numRuedas;
    }
    
    public String getColor()
    {
        return this.color;
    }
    
    public int getPosX()
    {
        return this.posX;
    }
    
    public int getPosY()
    {
        return this.posY;
    }
    
    public int getVelocidad()
    {
        return this.velocidad;
    }
    
    public void setColor(String pColor)
    {
        this.color = pColor;
    }
    
    public void setPosX(int pPosX)
    {
        this.posX = pPosX;
    }
    
    public void setPosY(int pPosY)
    {
        this.posY = pPosY;
    }
    
    public void setVelocidad(int pVelocidad)
    {
        this.velocidad = pVelocidad;
    }
    
    public void mover(int pX, int pY)
    {
        if(pX!=getPosX())
        {
            setPosX(pX);
        }
        if(pY!=getPosY())
        {
            setPosY(pY);
        }
    }
    
    public void acelerar()
    {
        setVelocidad(getVelocidad()+10);
    }
    
    public void frenar()
    {
        if(getVelocidad() > 10)
        {
            setVelocidad(getVelocidad()-10);
        }
        else
        {
            setVelocidad(0);
        }
    }
    
    public String toString()
    {
        return "";
    }
}