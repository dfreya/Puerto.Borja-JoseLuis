
/**
 * Write a description of class Velero here.
 * 
 * @author (your dfreya) 
 * @version (a version number or a date)
 */
public class Velero extends Barco
{
    private int numMastiles;

    /**
     * Constructor for objects of class Velero
     */
    public Velero(String matricula, double eslora, int ano, Persona propietario, int numMastiles)
    {
        super(matricula, eslora, ano, propietario);
        this.numMastiles=numMastiles;

    }
    
    public String toString(){
        String cadena="";
        cadena+=super.toString()+"con "+numMastiles+" mastiles."+"\n";
        return cadena;
    }
    
    public int getCoeficienteBernua(){
        return numMastiles;
    }
}
