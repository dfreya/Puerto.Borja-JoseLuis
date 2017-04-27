
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    // instance variables - replace the example below with your own
    private String nombre;
    private int dni;

    /**
     * Constructor for objects of class Persona
     */
    public Persona(String nombre, int dni)
    {
        this.nombre=nombre;
        this.dni=dni;
    }

    public String toString(){
        String cadena= nombre+" "+dni;
        return cadena;
    }
}