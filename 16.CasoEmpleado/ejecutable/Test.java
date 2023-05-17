package ejecutable;

import java.io.Console;

import modelo.Empleado;
import modelo.Empresa;

public class Test
{
    public static void main(String[] args)
    {   
        Console input = System.console();
        String opcion;
        String nombre;
        int horasTrabajadas;
        int añoNacimiento;
        int añoIngreso;
        System.out.println("-----------------");
        System.out.println("-SUELDO EMPLEADO-");
        System.out.println("-----------------");
        System.out.println("Digite la info del empleado");
        do{

        nombre = input.readLine("Nombre completo: ");
        horasTrabajadas = Integer.parseInt(input.readLine("No horas trabajadas: "));
        añoNacimiento = Integer.parseInt(input.readLine("Año nacimiento: "));
        añoIngreso = Integer.parseInt(input.readLine("Año de ingreso: "));
        
        Empresa.addEmpleados(new Empleado(nombre, horasTrabajadas, añoNacimiento, añoIngreso));
        
        opcion = input.readLine("Quieres ingresar otro empleado (si) ó (no): "); 
        System.out.println(opcion.equals("si"));
        }while(opcion.equals("si"));
        System.out.println("-------------------");
        System.out.println("Empleados registrados");
        for (Empleado empleado : Empresa.getEmpleados()) {
            System.out.println(empleado);
        }
        
    }
}