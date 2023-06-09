package modelo;

import java.util.ArrayList;

public class EmpresaAutomotriz
{
    //
    // Atributos
    //
    
    public final static int NUMERO_EMPLEADOS = 3;
    private ArrayList<Empleado> empleados;
    double nomina;
    
    //
    // Métodos
    //
    
    // Método constructor
    public EmpresaAutomotriz()
    {
        empleados = new ArrayList<>();
        nomina = 0;
    }
    
    public void agregarEmpleado(Empleado emp)
    {
        empleados.add(emp);
    }
    
    public double getNomina()
    {
        nomina = 0;
        for(int i=0; i<empleados.size();i++)
        {
            Empleado temp = empleados.get(i); // La nómina es la suma de los sueldos de todos los empleados
            nomina += temp.getSueldo();
        }

        return nomina;
    }

    public Empleado getEmpleado(int i)
    {
        return empleados.get(i);
    }

    public int getNumeroEmpleados()
    {
        return empleados.size();
    }

    public Empleado getEmpleadoDelMes()
    {
        Empleado empleadoDelMes = empleados.get(0);

        for (Empleado empleado : empleados)
        {
            if(empleadoDelMes.getVentas() < empleado.getVentas())
            {
                empleadoDelMes = empleado;
            }
        }

        return empleadoDelMes;
    }
  
    public String verEmpleadosSinVentas()
    {
        String empleadosSinVentas = "Empleados sin ventas:\n";
        for (int i = 0; i < empleados.size(); i++)
        {
            if (empleados.get(i).getVentas() == 0)
            {
                empleadosSinVentas += empleados.get(i).getNombre() + " de documento " + empleados.get(i).getCedula() + "\n";
            }
        }

        return empleadosSinVentas;
    }
}