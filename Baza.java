import java.util.ArrayList;
public class Baza
{
    private int numeroJugadoresLanzanCarta;     // Numero de jugadores que van a tirar carta
    private int paloPinta;                      // Indica el palo que pinta
    private ArrayList<Carta> cartasDeLaBaza;    // Creo un ArrayList de la clase Carta y lo llamo cartas del Mazo
    private ArrayList<String> nombreJugador;    // ArrayList con los nombres de los jugadores
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
        nombreJugador = new ArrayList<String>();
    }
    
    /**
     * Tenga un método llamado addCarta que admita un parámetro de tipo Carta y un segundo parámetro de tipo String. 
     * El primer parámetro representa la carta que tira un jugador a la mesa y que, por tanto, se añade a la baza. 
     * No hace falta comprobar que la carta añadida sea o no null, se supone que es una carta. 
     * El segundo parámetro indica el nombre del jugador que tiro la carta. El método no devuelve nada.
     */
    public void addCarta(Carta cartaLanzadaJugador, String nombreJugadores){
	   cartasDeLaBaza.add(cartaLanzadaJugador);  //No tiene mucho sentido, guarda la carta en el ArrayList, independientemente de que la carta la tenga el jugador
	   nombreJugador.add(nombreJugadores);
       /*for(Jugador jugador : jugadoresEnPartida){
			if(jugador.getNombre().equals(nombre)){
               cartasDeLaBaza.add(jugador.tirarCarta(cartaLanzadaJugador.toString()));
            }
   	   }*/
    }
    
    /**Tenga un método llamado getPaloPrimeraCartaDeLaBaza sin parámetros que devuelva un entero que representa el palo 
     *de la primera carta añadida a la baza o -1 en caso de que no se haya añadido aún ninguna carta.*/
    public int getPaloPrimeraCartaDeLaBaza(){
		int paloPrimeraCartaBaza = -1;
		if (cartasDeLaBaza.size() > 0){
			paloPrimeraCartaBaza = cartasDeLaBaza.get(0).getVpaloCarta();
		}
		return paloPrimeraCartaBaza;
	}

	/**Tenga un método llamado cartaQueVaGanandoLaBaza sin parámetros que devuelva un objeto Carta.
	* Este objeto carta es la carta que va ganando la baza conforme a las normas del julepe. 
	*En caso de que la baza este vacía este método devuelve null.
	*/
	public Carta cartaQueVaGanandoLaBaza(){
		Carta comprobarCarta = null;
		for(int contador = 0; contador < cartasDeLaBaza.size(); contador++){
			if(comprobarCarta == null){
				comprobarCarta = cartasDeLaBaza.get(0);
			}			
			if (!comprobarCarta.ganaA(cartasDeLaBaza.get(contador), paloPinta)){
				comprobarCarta = cartasDeLaBaza.get(contador);
			}
		}	
		return comprobarCarta;
	}

	/**Tenga un método llamado nombreJugadorQueVaGanandoLaBaza que no admite parámetros y que devuelve el nombre del jugador 
	 *que va ganando la baza en el momento actual.
	*/
	public String nombreJugadorQueVaGanandoLaBaza (){
		String nombreGanador = "";
		Carta comprobarCarta = null;

		int contador = 0;
		while(contador < cartasDeLaBaza.size()){
			if(comprobarCarta == null){
				comprobarCarta = cartasDeLaBaza.get(0);
			}			
			if (!comprobarCarta.ganaA(cartasDeLaBaza.get(contador), paloPinta)){
				comprobarCarta = cartasDeLaBaza.get(contador);
				nombreGanador = nombreJugador.get(contador);
			}
			contador++;
		}	
		return nombreGanador;
	}

}
