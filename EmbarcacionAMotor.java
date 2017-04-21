
/**
 * Write a description of class EmbarcacionAMotor here.
 * 
 * @author (your dfreya) 
 * @version (a version number or a date)
 */
public class EmbarcacionAMotor extends Barco
{
    private int potencia;
    
    /**
     * Constructor for objects of class EmbarcacionAMotor
     */
    public EmbarcacionAMotor(String matricula, double eslora, int ano, Persona propietario,int potencia)
    {
        super(matricula, eslora, ano, propietario);
        this.potencia=potencia;        
    }
    
        public int getCoeficienteBernua(){
        return potencia;
    }
    
       public String toString(){
        String cadena="";
        cadena=super.toString()+"Potencia de "+potencia+"/n";
        return cadena;
    }
    

    }

