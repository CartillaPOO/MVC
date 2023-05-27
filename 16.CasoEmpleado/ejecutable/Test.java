package ejecutable;

import javax.swing.JOptionPane;
import modelo.Empleado;
import modelo.Empresa;

public class Test
{
    public static void main(String[] args)
    {   
        String opcion;
        String nombre;
        int horasTrabajadas;
        int añoNacimiento;
        int añoIngreso;
        Empresa miEmpresa = new Empresa();
        
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema de registro de empleados");

        do
        {
        nombre = JOptionPane.showInputDialog("Nombre: ");
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Horas trabajadas: "));
        añoNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Año de nacimiento: "));
        añoIngreso = Integer.parseInt(JOptionPane.showInputDialog("Año de ingreso: "));
        
        miEmpresa.addEmpleados(new Empleado(nombre, horasTrabajadas, añoNacimiento, añoIngreso));
        
        opcion = JOptionPane.showInputDialog("¿Desea agregar otro empleado? (si/no)");

        
        while (!opcion.equals("si") && !opcion.equals("no")) // Si la opción ingresada no es válida, se vuelve a preguntar
        {
            JOptionPane.showMessageDialog(null, "Debe ingresar una opción válida");
            opcion = JOptionPane.showInputDialog("¿Desea agregar otro empleado? (si/no)");
        }
        }
        while(opcion.equals("si"));

        JOptionPane.showMessageDialog(null, miEmpresa.getEmpleados());
    } 
}
