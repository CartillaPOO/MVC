package ejecutable;
import modelo.Fecha;

public class Test
{
    public static void main(String[] args)
    {
        Fecha f1 = new Fecha(11, 5, 2023);
        f1.setDia(11);
        f1.setMes(5);
        f1.setAnio(2023);

        System.out.println("Día = " + f1.getDia());
        System.out.println("Mes = " + f1.getMes());
        System.out.println("Año = " + f1.getAnio());
        System.out.println(f1);

        Fecha f2 = new Fecha(11, 5, 2023);
        f2.setDia(11);
        f2.setMes(5);
        f2.setAnio(2023);

        if(f1.equals(f2))
        {
            System.out.println("Son iguales");
        }
        else
        {
            System.out.println("Fechas diferentes");
        }

        //
        // Ejemplo encapsulamiento
        //

        Fecha fecha = new Fecha("23/12/1980");
        fecha.addDias(180);

        System.out.println(fecha);
    }
}