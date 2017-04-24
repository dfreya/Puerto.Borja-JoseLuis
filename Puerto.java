
public class Puerto
{
    
    private Alquiler[] amarres;
    
    public Puerto()
    {
        amarres = new Alquiler[4];
    }
    
    public float alquilarAmarre(int numDias, Barco barco)
    {
        float precio = -1;
        if (hayAmarresLibres()){
            int posicionAmarreAAlquilar = posicionPrimerAmarreLibre();
            amarres[posicionAmarreAAlquilar] = new Alquiler(numDias, barco, posicionPrimerAmarreLibre());
            precio = amarres[posicionAmarreAAlquilar].getPrecioAlquiler();
        }
        return precio;
    }
    
    public float liquidarAlquilerAmarre(int posicionAmarre)
    {
        float precio = -1;
        if (posicionAmarre >= 0 && posicionAmarre < amarres.length && amarres[posicionAmarre] != null){
            precio = amarres[posicionAmarre].getPrecioAlquiler();
            amarres[posicionAmarre] = null;
        }
        return precio;
    }
    
    public void verEstadoAmarres()
    {
        for (int i = 0; i < amarres.length; i++){
            if (amarres[i] != null){
                System.out.println(amarres[i].toString());
            }
        }
    }
    
    public int posicionPrimerAmarreLibre()
    {
        int primerAmarrelibre = -1;
        if (hayAmarresLibres()){
            int i = 0;
            while (i < amarres.length && primerAmarrelibre == -1){
                if (amarres[i] == null){
                    primerAmarrelibre = i;
                }
                i++;
            }
        }
        return primerAmarrelibre;
    }
    
    public boolean hayAmarresLibres()
    {
        boolean amarresLibres = false;
        int i = 0;
        while (i < amarres.length && amarresLibres == false){
            if (amarres[i] == null){
                amarresLibres = true;
            }
            i++;
        }
        return amarresLibres;
    }
    
}
