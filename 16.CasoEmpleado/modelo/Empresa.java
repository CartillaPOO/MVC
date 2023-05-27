package modelo;

import java.util.ArrayList;

public class Empresa 
{
    //
    // Atributos
    //

    final static double SALARIO_MINIMO = 1160000;
    final static double HORAS_MINIMAS = 240;
    final static double VALORHORA = SALARIO_MINIMO/HORAS_MINIMAS;
    private String listaEmpleados = "";
    static ArrayList<Empleado> empleados  = new ArrayList<>();

    //
    // Métodos
    //

    public String aplicaAuxilioTransporte(Empleado empleado)
    {
        if(empleado.getSueldoMensual() < 2*SALARIO_MINIMO)
        {
            return "Aplica";
        }
        else
        {
            return "No aplica";
        }
    
    }

    private void setSueldoEmpleado(Empleado empleado)
    {
        empleado.setSueldoMensual(VALORHORA*empleado.getHorasTrabajo());
    }

    public String getEmpleados()
    {
        for (Empleado empleado : empleados)
        {
            listaEmpleados += empleado.toString() + "\n";
        }
        return listaEmpleados;
    }

    public void addEmpleados(Empleado empleado)
    {
        empleados.add(empleado);
        setSueldoEmpleado(empleado);
        empleado.setAuxilio(aplicaAuxilioTransporte(empleado));
    }
}
