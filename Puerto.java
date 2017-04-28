/**
 * Clase principal desde la que se ejecuta todo el programa. Permitira gestionar los 
 * alquileres de los amarres de un puerto.
 * @author Jose Luis Fernandez Cañon.
 * @version 27/04/2017.
 */
public class Puerto
{
    
    private Alquiler[] amarres;
    
    /**
     * Constructor que inicializa el atributo amarres con un array de 4 posiciones vacio.
     */
    public Puerto()
    {
        amarres = new Alquiler[4];
    }
    
    /**
     * Comprueba si hay amarres libres y alquila el primer amarre libre y devuelve el precio de alquiler, 
     * en caso de no haber ningun amarre libre devolvera -1.
     * @param numDias Numero de dias que se alquila el amarre.
     * @param barco Barco que ocupara el amarre.
     * @return Precio del alquiler del amarre.
     */
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
    
    /**
     * Liquida el alquiler de un amarre.
     * @param posicionAmarre Posicion del amarre que queremos liberar.
     * @return precio del alquiler del amarre a liquidar.
     */
    public float liquidarAlquilerAmarre(int posicionAmarre)
    {
        float precio = -1;
        if (posicionAmarre >= 0 && posicionAmarre < amarres.length && amarres[posicionAmarre] != null){
            precio = amarres[posicionAmarre].getPrecioAlquiler();
            amarres[posicionAmarre] = null;
        }
        return precio;
    }
    
    /**
     * Imprime por pantalla el estado actual de todos los amarres.
     */
    public void verEstadoAmarres()
    {
        for (int i = 0; i < amarres.length; i++){
            if (amarres[i] != null){
                System.out.println(amarres[i].toString() + "\n");
            }
            else{
                System.out.println("El amarre " + i + " esta libre\n");
            }
        }
    }
    
    /**
     * Busca la posicion del primer amarre libre, si no hay ningun amarre libre devuelve -1.
     * @return Posicion primer amarre libre.
     */
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
    
    /**
     * Comprueba si hay amarres libres.
     * @return Devuelve true si hay amarres libres y false en caso contrario.
     */
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
