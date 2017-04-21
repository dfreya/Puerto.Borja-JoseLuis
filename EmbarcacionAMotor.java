
/**
 * Write a description of class EmbarcacionAMotor here.
 * 
 * @author (your dfreya) 
 * @version (a version number or a date)
 */
public class EmbarcacionAMotor extends Barco
{

    /**
     * Constructor for objects of class EmbarcacionAMotor
     */
    public EmbarcacionAMotor(String matricula, double eslora, int ano, Persona propietario,int potencia)
    {
        super(matricula, eslora, ano, propietario);
        
    }
    
        public int getCoeficienteBernua(){
        return 0;
    }
    
       public String toString(){
        return"";
    }
    

    }

