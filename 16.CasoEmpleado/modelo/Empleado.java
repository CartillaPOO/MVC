package modelo;

public class Empleado
{
    //---------------
    //Atributos
    //---------------
    private String nombre;
    private int fechaNacimiento;
    private int edad;
    private int fechaIngreso;
    private int horasTrabajo;
    private double sueldoMensual;
    private int antiguedad;
    private int id;
    private String auxilio;

    // Método constructor
    public Empleado(String nombre, int horasTrabajo, int fechaNacimiento, int fechaIngreso)
    {
        this.nombre = nombre;
        this.horasTrabajo = horasTrabajo;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.edad = 2023 - fechaNacimiento;
        this.antiguedad = 2023 - fechaIngreso;
        
    }
    
    //---------------
    //Métodos
    //---------------
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public int getEdad(){
        return edad;
    }

    public int getAntiguedad(){
        return antiguedad;
    }

    public int getHorasTrabajo()
    {
        return this.horasTrabajo;
    }

    public int getFechaIngreso() {
        return this.fechaIngreso;
    }

    public int getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public double getSueldoMensual() {
        return this.sueldoMensual;
    }

    public void setAuxilio(String respuesta) {
        this.auxilio = respuesta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString(){
        return "\nID: " + id + "\nNombre: " + nombre + "\nEdad: " + edad + "\nAntiguedad: " + antiguedad + "\nSalario: " + sueldoMensual + "\nAuxilio: " + auxilio;
    }

}