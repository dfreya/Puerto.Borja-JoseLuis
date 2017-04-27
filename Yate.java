
/**
 * Write a description of class Yate here.
 * 
 * @author (your dfreya) 
 * @version (a version number or a date)
 */
public class Yate extends EmbarcacionAMotor
{
    private int numCamarotes;
    /**
     * Constructor for objects of class Yate
     */
    public Yate(String matricula, double eslora, int ano, Persona propietario, int potencia,int numCamarotes)
    {
        super( matricula, eslora, ano, propietario, potencia);
        this.numCamarotes=numCamarotes;
    }

        public int getCoeficienteBernua(){
        return numCamarotes+super.getCoeficienteBernua();
    }
    
       public String toString(){
        String cadena="";
        cadena+=super.toString()+"Con "+numCamarotes+" camarotes"+"\n";
        return cadena;
    }
    }
