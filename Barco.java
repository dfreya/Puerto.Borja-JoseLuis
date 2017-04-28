/**
 * Clase que almacena objetos tipo barco.
 * 
 * @author:Borja Del Valle Lopez.
 * @version 27/04/2017.
 */
public abstract class Barco
{
    private Persona propietario;
    private String matricula;
    private double eslora;
    private int anoFabricacion;

    /**
     * Constructor de la clase barco.
     * @param matricula, martricula del barco.
     * @param eslora, la longitud de la eslora del barco.
     * @param ano año de fabricacion del barco.
     * @param propietario Propietario del barco.
     */
    public Barco(String matricula, double eslora, int ano, Persona propietario)
    {
        this.matricula=matricula;
        this.eslora=eslora;
        anoFabricacion=ano;
        this.propietario=propietario;
    }

    /**
     * Muestra la informacion del barco.
     * @return cadena con la informacion del barco.
     */
    public String toString(){
        String cadena=propietario.toString();
        cadena+= "Con matricula "+matricula+"\n";
        cadena+="AÃ±o de Fabrocacion "+anoFabricacion+"\n";
        cadena+="Con una eslora de "+eslora+"\n"; 
        return cadena;
    }

    /**
     * Muestra el tamaño de la eslora del barco.
     * @return eslora del barco.
     */
    public double getEslora(){
        return eslora;
    }

    /**
     * Metodo abstracto para calcular el coeficiente de Bernua en los 
     * barcos.
     */
    public abstract  int getCoeficienteBernua();

}
