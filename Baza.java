

public class Baza
{
    private int numeroJugadoresLanzanCarta;     // Numero de jugadores que van a tirar carta
    private int paloPinta;                      // Indica el palo que pinta

    /**
     * Tenga un constructor que admita dos parametros. El primero es un entero que indica el número de jugadores que van a tirar carta y el segundo es otro entero que indica el palo que pinta.
     */
    public Baza(int numeroJugadoresJuegan, int palo)
    {
        numeroJugadoresLanzanCarta = numeroJugadoresJuegan;     
        paloPinta = palo;
    }
}
