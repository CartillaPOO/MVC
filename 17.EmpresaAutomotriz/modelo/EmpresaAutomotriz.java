package modelo;

import java.util.ArrayList;

public class EmpresaAutomotriz
{
    //----------------------
    // Constantes
    //----------------------
    public final static int NUMERO_EMPLEADOS = 3;

    //----------------------
    // Atributos
    //----------------------
    //private Empleado[] empleados;
    private ArrayList<Empleado> empleados;

    //----------------------
    // Metodos
    //----------------------
    public EmpresaAutomotriz()
    {
        //empleados = new Empleado[NUMERO_EMPLEADOS];
        empleados = new ArrayList();
    }

    /*public void agregarEmpleado(Empleado emp, int pos)
    {
        empleados[pos] = emp;
    }*/

    public void agregarEmpleado(Empleado emp)
    {
        empleados.add(emp);
    }

    /*public double calcularNomina()
    {
        double totalNomina = 0;
        for(int i=0; i<empleados.length; i++)
        {
            totalNomina = totalNomina + empleados[i].getSueldo();
        }
        return totalNomina;
    }*/

    public double calcularNomina()
    {
        double totalnomina = 0;
        for(int i=0; i<empleados.size();i++)
        {
            Empleado temp = empleados.get(i);
            totalnomina += temp.getSueldo();
        }
        return totalnomina;
    }

    public Empleado getEmpleado(int i)
    {
        return (Empleado) empleados.get(i);
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
            if (empleados.get(i).verNumeroDeVentas() == 0)
            {
                empleadosSinVentas += empleados.get(i).getNombre() + " de documento " + empleados.get(i).getCedula() + "\n";
            }
        }
        return empleadosSinVentas;
    }
}