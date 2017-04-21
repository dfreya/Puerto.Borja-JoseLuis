/**
 * Abstract class Barco - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Barco
{
    private Persona propietario;
    private String matricula;
    private double eslora;
    private int anoFabricacion;

    /**
     constructor
     */
    public Barco(String matricula, double eslora, int ano, Persona propietario)
    {
       this.matricula=matricula;
       this.eslora=eslora;
       anoFabricacion=ano;
       this.propietario=propietario;
    }
    
    public String toString(){
        String cadena=propietario.toString();
        return cadena;
    }
    
    public double getEslora(){
        return eslora;
    }
    
    public abstract  int getCoeficienteBernua();
    
}
