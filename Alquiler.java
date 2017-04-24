
public class Alquiler
{
    
    private int diasOcupacion;
    private int posicionAmarre;
    private Barco barco;
    
    private static final int VALOR_MULTIPLICADOR_ESLORA = 10;
    private static final int VALOR_MULTIPLICADOR_BERNUA = 300;
    
    public Alquiler(int numDias, Barco barco, int posicionAmarre)
    {
        diasOcupacion = numDias;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }
    
    public String toString()
    {
        String textoADevolver = "";
        textoADevolver += diasOcupacion + "\n";
        textoADevolver += posicionAmarre + "\n";
        textoADevolver += barco.toString();
        return textoADevolver;
    }
    
    public float getPrecioAlquiler()
    {
        float precio = 0;
        float eslora = (float)barco.getEslora();
        precio = (diasOcupacion * (eslora * VALOR_MULTIPLICADOR_ESLORA)) + (VALOR_MULTIPLICADOR_BERNUA * barco.getCoeficienteBernua());
        return precio;
    }
    
}
