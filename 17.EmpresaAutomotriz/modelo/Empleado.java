package modelo;

import java.util.ArrayList;

public class Empleado
{
    //
    // Atributos
    //

    public final static double SALARIO_MINIMO = 1000000;
    private String nombre;
    private String cedula;
    private ArrayList<Carro> ventas;
    private double sueldo;

    //
    // Métodos
    //

    // Método constructor
    public Empleado(String pNombre, String pCedula)
    {
        this.nombre = pNombre;
        this.cedula = pCedula;
        this.ventas = new ArrayList<>();
    }

    public void ordenarCarros() 
    {
        int i, j;
        Carro aux;

        // Ordenar por precio de mayor a menor
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
        if(ventas.isEmpty()) // Si no ha vendido ningún carro
        {
            sueldo = SALARIO_MINIMO;
        }
        else
        {
            int numCarrosVendidos = ventas.size(); // Número de carros vendidos
            double totalVentas = 0;

            sueldo = SALARIO_MINIMO + 100000*numCarrosVendidos;

            for(int i = 0; i < numCarrosVendidos; i++) 
            {
                Carro carro = (Carro)ventas.get(i); // Obtener el carro vendido
                totalVentas = totalVentas + carro.getPrecio(); // Sumar el precio del carro vendido
            }

            sueldo = sueldo + 0.02*totalVentas; // Sumar el 2% de las ventas
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

    public String getCedula()
    {
        return cedula;
    }

    public String verVentas()
    {
        String listaCarros = "";

        for (int i = 0; i < getVentas(); i++) // Recorrer la lista de carros vendidos
        {
            listaCarros = listaCarros + "Precio: " + ventas.get(i).getPrecio() + "\nMarca: " + ventas.get(i).getMarca() + "\nModelo: " + ventas.get(i).getmodelo() + "\n";
        }

        return listaCarros;
    }
}