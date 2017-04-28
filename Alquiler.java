
/**
 * Clase que almacena todos los datos del alquiler de un amarre.
 * @author Jose Luis Fernández Cañón
 * @version 27/04/2017.
 */
public class Alquiler
{
    
    private int diasOcupacion;
    private int posicionAmarre;
    private Barco barco;
    
    private static final int VALOR_MULTIPLICADOR_ESLORA = 10;
    private static final int VALOR_MULTIPLICADOR_BERNUA = 300;
    
    /**
     * Constructor que inicializa los atributos pasandole datos por parámetro.
     * @param numDias Numero de días que durará el alquiler.
     * @param barco Barco que aluila el amarre.
     * @param posicionAmarre Posicion del amarre alquilado.
     */
    public Alquiler(int numDias, Barco barco, int posicionAmarre)
    {
        diasOcupacion = numDias;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }
    
    /**
     * Muestra toda la información del alquiler.
     * @return Cadena con la informacion del alquiler.
     */
    public String toString()
    {
        String textoADevolver = "";
        textoADevolver += "Alquilado " + diasOcupacion + " dias\n";
        textoADevolver += "Amarre" + posicionAmarre + "\n";
        textoADevolver += barco.toString();
        return textoADevolver;
    }
    
    /**
     * Muestra el precio del alquiler.
     * @return Precio del alquiler.
     */
    public float getPrecioAlquiler()
    {
        float precio = 0;
        float eslora = (float)barco.getEslora();
        precio = (diasOcupacion * (eslora * VALOR_MULTIPLICADOR_ESLORA)) + (VALOR_MULTIPLICADOR_BERNUA * barco.getCoeficienteBernua());
        return precio;
    }
    
}
