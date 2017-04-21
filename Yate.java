
/**
 * Write a description of class Yate here.
 * 
 * @author (your dfreya) 
 * @version (a version number or a date)
 */
public class Yate extends EmbarcacionAMotor
{

    /**
     * Constructor for objects of class Yate
     */
    public Yate(String matricula, double eslora, int ano, Persona propietario, int potencia,int numCamarotes)
    {
        super( matricula, eslora, ano, propietario, potencia);

    }

        public int getCoeficienteBernua(){
        return 0;
    }
    
       public String toString(){
        return"";
    }
    }
