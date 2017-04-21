
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
        
        return textoADevolver;
    }
    
    public float getPrecioAlquiler()
    {
        return 0.0;
    }
    
}
