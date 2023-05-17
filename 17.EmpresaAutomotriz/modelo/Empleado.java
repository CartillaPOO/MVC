package modelo;

import java.util.ArrayList;
import java.util.Collections;

public class Empleado
{
    //----------------------
    // Constantes
    //----------------------
    public final static double SALARIO_MINIMO = 1000000;

    //----------------------
    // Atributos
    //----------------------
    private String nombre;
    private ArrayList<Carro> ventas;
    private double sueldo;
    private int edad;
    private int cedula;

    //----------------------
    // Metodos
    //----------------------
    public Empleado(String pNombre, int pEdad, int pCedula)
    {
        this.nombre = pNombre;
        this.edad = pEdad;
        this.cedula = pCedula;
        this.ventas = new ArrayList<>();
    }

    public void ordenarCarros() 
    {
        int i, j;
        Carro aux;
        for (i = 0; i < ventas.size() - 1; i++) 
        {
            for (j = 0; j < ventas.size() - i - 1; j++) 
            {                                                              
                if (ventas.get(j + 1).getPrecio() > ventas.get(j).getPrecio()) 
                {
                    aux = ventas.get(j + 1);
                    ventas.set(j + 1, ventas.get(j));
                    ventas.set(j, aux);
                }
            }
        }
}

    public void venderCarro(Carro carroVendido)
    {
        ventas.add(carroVendido);
    }

    public void calcularSueldo()
    {
        if(ventas.isEmpty())
        {
            sueldo = SALARIO_MINIMO;
        }
        else
        {
            //Numero carros vendidos
            int numCarrosVendidos = ventas.size();

            sueldo = SALARIO_MINIMO + 100000*numCarrosVendidos;

            double totalVentas = 0;
            for(int i=0; i<numCarrosVendidos;i++)
            {
                Carro carro = (Carro)ventas.get(i);
                totalVentas = totalVentas + carro.getPrecio();
            }

            sueldo = sueldo + 0.02*totalVentas;
        }
    }

    public Integer getVentas()
    {
        return ventas.size();
    }

    public String getNombre()
    {
        return nombre;
    }

    public double getSueldo()
    {
        return sueldo;
    }

    public int getEdad()
    {
        return edad;
    }

    public int getCedula()
    {
        return cedula;
    }

    public String verVentas()
    {
        String listaCarros = "";

        for (int i = 0; i < getVentas(); i++)
        {
            listaCarros = listaCarros + "Precio: " + ventas.get(i).getPrecio() + "\nMarca: " + ventas.get(i).getMarca() + "\nModelo: " + ventas.get(i).getmodelo() + "\n";
        }
        return listaCarros;
    }

    public int verNumeroDeVentas()
    {
        return ventas.size();
    }
}