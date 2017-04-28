
/**
 * Clase que almacena los barcos tipo yate.
 * 
 * @author: Borja Del Valle Lopez.
 * @version 27/04/2017.
 */
public class Yate extends EmbarcacionAMotor
{
    private int numCamarotes;
    /**
     * Constructor que inicializa los atributos de Yate.
     * @param numCamarotes numero de camarotes que tiene el yate.
     */
    public Yate(String matricula, double eslora, int ano, Persona propietario, int potencia,int numCamarotes)
    {
        super( matricula, eslora, ano, propietario, potencia);
        this.numCamarotes=numCamarotes;
    }

    /**
     * Metodo que calcula el coeficiente de bernua
     * del yate.
     * @return un entero que es el coeficiente de bernua de yae
     */
        public int getCoeficienteBernua(){
        return numCamarotes+super.getCoeficienteBernua();
    }
    
    /**
     * Muestra toda la informaci0n de yate.
     * @return cadena con la informacion de yate.
     */
       public String toString(){
        String cadena="";
        cadena+=super.toString()+"Con "+numCamarotes+" camarotes"+"\n";
        return cadena;
    }
    }
