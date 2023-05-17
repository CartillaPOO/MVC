package ejecutable;
import modelo.Fecha;

public class Test
{
    public static void main(String[] args)
    {
        Fecha f1 = new Fecha();
        f1.setDia(11);
        f1.setMes(5);
        f1.setAnio(2023);

        System.out.println("Día = " + f1.getDia());
        System.out.println("Mes = " + f1.getMes());
        System.out.println("Año = " + f1.getAnio());
        System.out.println(f1);

        Fecha f2 = new Fecha();
        f2.setDia(11);
        f2.setMes(05);
        f2.setAnio(2023);

        System.out.println(f1.equals(f2));
    }
}