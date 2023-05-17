package modelo;

import java.util.ArrayList;

public class CasaEventos
{
    // Atributos

    private ArrayList<Salon> salones;

    // Métodos

    public CasaEventos()
    {
        salones = new ArrayList<>();
    }

    public void agregarSalon(Salon sal)
    {
        salones.add(sal);
    }

    public double calcularCostoTotal()
    {
        double costotal = 0;
        for (int i = 0; i < salones.size(); i++)
        {
            Salon temp = salones.get(i);
            costotal += temp.getCostoSalon();
        }

        return costotal;
    }
}
