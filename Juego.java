import java.util.Random;
import java.util.ArrayList;
/**
 *Añadir una clase Juego. En el constructor de Juego se crean tantos jugadores como se especifiquen por parametro y un mazo. Los nombres de los jugadores deben ser asignados de forma aleatoria entre un conjunto de nombres (dos jugadores no pueden tener el mismo nombre).
 *Implementar en esa clase un método llamado repartir que coja el mazo y de 5 cartas a los jugadores creados. Se supone que no se pueden crear más de 5 jugadores (el máximo de jugadores que juegan al julepe). 
 *La entrega de cartas debe ser al estilo del reparto que se hace en la realidad, es decir, una carta a cada jugador. La última carta entregada indica el palo que pinta, que debe registrarse de alguna foma.
 *Implementa un método llamado verCartasJugador que muestre por pantalla las cartas de un jugador. Para saber qué jugador mostrar, indicamos como parámetro del método el nombre del Jugador.
 *En esta actividad no se puede tocar ninguna de las clases ya creadas.
 */
public class Juego
{
    // instance variables - replace the example below with your own
    private Carta paloPinta;
    private ArrayList<String> nombreJugadores;
    private Jugador[] listaJugadores;

    private Mazo nuevoMazo;
    private String nombreHumano;

    /**
     * Constructor for objects of class Juego
     */
    public Juego(String nombrePersona, int numeroJugadores)
    {
        nuevoMazo = new Mazo();
        nuevoMazo.barajar();
        listaJugadores = new Jugador[numeroJugadores];
        nombreJugadores = new ArrayList<String>();
        nombreHumano = nombrePersona;
        listaJugadores[0] = new Jugador (nombreHumano);
        
        nombreJugadores.add(" Manolo");
        nombreJugadores.add(" Roberto");
        nombreJugadores.add(" María");
        nombreJugadores.add(" Vanesa");
        nombreJugadores.add(" Juan");
        nombreJugadores.add(" Lucas");

        Random aleatorio = new Random();
        int contador = 1;
        while (numeroJugadores > contador) {
            
            int numeroAleatorio = aleatorio.nextInt(nombreJugadores.size());
            listaJugadores[contador] = new Jugador (nombreJugadores.remove(numeroAleatorio));
            contador++;
        }
        
        System.out.println("Biemvenido a una nueva Partida de Julepe. Van a jugar : ");
        System.out.println(" "+nombrePersona);
        for(int contadorDeNombreJugador = 1; contadorDeNombreJugador < listaJugadores.length; contadorDeNombreJugador++ ){
             System.out.println(listaJugadores[contadorDeNombreJugador].getNombre());
        }
    }

    /**
     * Implementar en esa clase un método llamado repartir que coja el mazo y de 5 cartas a los jugadores creados. La entrega de cartas debe ser al estilo del reparto que se hace en la realidad, 
     *es decir, primero se baraja y luego se entrega una carta a cada jugador. La última carta entregada indica el palo que pinta, que debe registrarse de alguna foma.
     */
    public void reapartir(){
        Carta nuevaCarta = null;
        for(int contadorLento = 0; contadorLento < 5; contadorLento++){
              for(int contador = 0; contador < listaJugadores.length; contador++){
                   nuevaCarta = nuevoMazo.sacarCarta();
                   listaJugadores[contador].recibirCarta(nuevaCarta);
              }
        }
        
        String textoPalo = "";
        switch(nuevaCarta.getVpaloCarta()){
            case 0:
            textoPalo = "Pinta en oros"; 
            break;
            
            case 1:
            textoPalo = "Pinta en copas"; 
            break;
            
            case 2:
 
            textoPalo = "Pinta en espadas"; 
            break;
            
            case 3:
            textoPalo = "Pinta en bastos"; 
            break;
        }
        System.out.println(nuevaCarta.getVpaloCarta());
        System.out.println(textoPalo);
        System.out.println("");
        System.out.println("Sus cartas son:");
        verCartasJugadorHumano(nombreHumano);

    }

    /**
     *Implementa un método llamado verCartasJugador que muestre por pantalla las cartas de un jugador. Para saber qué jugador mostrar, indicamos com    o parámetro del método el nombre del Jugador.
    */
    public void hacerTrampasYVerCartasDeJugador(String nombre){
        for(Jugador jugador : listaJugadores){
            if(jugador.getNombre().equals(nombre)){
                jugador.verCartasDelJugador();
            }
        }
    }
    
    public void verCartasJugadorHumano(String nombre){
          hacerTrampasYVerCartasDeJugador(nombreHumano);
    }
}

