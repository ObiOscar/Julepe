import java.util.ArrayList;
public class Baza
{
    private int numeroJugadoresLanzanCarta;     // Numero de jugadores que van a tirar carta
    private int paloPinta;                      // Indica el palo que pinta
    private ArrayList<Carta> cartasDeLaBaza;    // Creo un ArrayList de la clase Carta y lo llamo cartas del Mazo
    private Jugador[]jugadoresEnPartida;        // Jugadores que juegan    

    /**
     * Tenga un constructor que admita dos parametros. El primero es un entero que indica el número de jugadores que van a tirar carta y el segundo es otro entero que indica el palo que pinta.
     */
    public Baza(int numeroJugadoresJuegan, int palo)
    {
        numeroJugadoresLanzanCarta = numeroJugadoresJuegan;     
        paloPinta = palo;
        cartasDeLaBaza = new ArrayList<Carta>();
        jugadoresEnPartida = new Jugador[numeroJugadoresJuegan];
    }
    
    /**
     * Tenga un método llamado addCarta que admita un parámetro de tipo Carta y un segundo parámetro de tipo String. 
     * El primer parámetro representa la carta que tira un jugador a la mesa y que, por tanto, se añade a la baza. 
     * No hace falta comprobar que la carta añadida sea o no null, se supone que es una carta. 
     * El segundo parámetro indica el nombre del jugador que tiro la carta. El método no devuelve nada.
     */
    public void addCarta(Carta cartaLanzadaJugador, String nombreJugador){
       cartasDeLaBaza.add(cartaLanzadaJugador);  //No tiene mucho sentido, guarda la carta en el ArrayList, independientemente de que la carta la tenga el jugador
       /*for(Jugador jugador : jugadoresEnPartida){
			if(jugador.getNombre().equals(nombre)){
               cartasDeLaBaza.add(jugador.tirarCarta(cartaLanzadaJugador.toString()));
            }
   	   }*/
    }
    

}
