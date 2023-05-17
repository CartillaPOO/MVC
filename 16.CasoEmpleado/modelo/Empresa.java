package modelo;

import java.util.ArrayList;

public class Empresa {
   final static double SALARIO_MINIMO = 1160000;
   final static double HORAS_MINIMAS = 240;
   final static double VALORHORA = SALARIO_MINIMO/HORAS_MINIMAS;
   static ArrayList<Empleado> empleados  = new ArrayList<>();

   //Metodos
   public static String aplicaAuxilioTransporte(Empleado empleado)
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

   private static void setID(Empleado empleado){
    int empleadoID = (int)(Math.random()*1000+1);
    for (int i = 0; i < empleados.size(); i++) {
        if(empleados.get(i).getId() != empleadoID){
            empleado.setId(empleadoID);
        }
    }

   }

   private static void setSueldoEmpleado(Empleado empleado)
   {
    empleado.setSueldoMensual(VALORHORA*empleado.getHorasTrabajo());
   }

   public static ArrayList<Empleado> getEmpleados() {
       return empleados;
   }

   public static void addEmpleados(Empleado empleado){
    empleados.add(empleado);
    setID(empleado);
    setSueldoEmpleado(empleado);
    empleado.setAuxilio(aplicaAuxilioTransporte(empleado));
   }

}
