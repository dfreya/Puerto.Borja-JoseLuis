
/**
 * Write a description of class Velero here.
 * 
 * @author (your dfreya) 
 * @version (a version number or a date)
 */
public class Velero extends Barco
{

    /**
     * Constructor for objects of class Velero
     */
    public Velero(String matricula, double eslora, int ano, Persona propietario)
    {
        super(matricula, eslora, ano, propietario);

    }
    
    public String toString(){
        return"";
    }
    
    public int getCoeficienteBernua(){
        return 0;
    }
}
