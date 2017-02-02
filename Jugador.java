import java.util.Random;
/**
 * Añadir la clase Jugador que permita a un jugador identificado por un nombre (en formato String) ser capaz de tener hasta 5 cartas. El constructor debe admitir el nombre del jugador como parámetro. 
 * Además debe haber un método llamado recibirCarta que permita un parametro de tipo Carta y un método llamado verCartasJugador que imprima por pantalla las cartas del jugador, una por linea, y que funcione tenga las cartas que tenga.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador
{
    private String nombreJugador;
    private Carta[]cartasJugador;
    private int numeroCartasEnMano;

    /**
     * Constructor for objects of class Jugador
     */
    public Jugador(String nombre)
    {
        cartasJugador = new Carta[5];
        nombreJugador = nombre;
        numeroCartasEnMano = 0;
    }

    /**
     * El jugador recibe una carta
     */
    public void recibirCarta(Carta nuevaCarta)
    {
      if(numeroCartasEnMano < 5){
          cartasJugador[numeroCartasEnMano] = nuevaCarta;
          numeroCartasEnMano++;
        }
        
      /*int j = 0;                                          //Esta es mi solución, bastante menos optimizada que la presentada arriba, la desventaja de la solución de arriba es la creación de un atributo, y la posibilidad de olvidar incrementar 
      boolean buscando = true;                              //la variable.
      while(j < cartasJugador.length && buscando){      
         if(cartasJugador[j] == null){
             cartasJugador[j] = nuevaCarta;  
             buscando = false;
          }  
         j++;
      }
      
      if(j == cartasJugador.length){
         System.out.println("El jugador " + nombreJugador + " tiene ya tiene 5 cartas en su mano");
      }*/
    }
    
    /**
     * Imprime por pantalla las cartas del jugador
     */
    public void verCartasDelJugador(){
      for(int j = 0; j < cartasJugador.length; j++){
          if(cartasJugador[j] != null)
          System.out.println(cartasJugador[j]);
        }
    }
    
    /**
     * Lo creo para ver que cartas tiene cada jugador
     */
    public Carta  CartasDelJugador(){
      Carta cartaJugador = null;  
        
      for(int j = 0; j < cartasJugador.length; j++){
          if(cartasJugador[j] != null)
          cartaJugador = cartasJugador[j];
        }
      return cartaJugador;
    }
    
    public String getNombre(){
        return nombreJugador;
    }
    
    /**
     * Exista un nuevo método que sea tirarCarta. Admite un parámetro String que indica el nombre de la carta a tirar. 
     * El método muestra por pantalla el nombre del jugador que ha tirado la carta y la carta tirada. 
     * Devuelve la carta tirada. En caso de que el jugador no tenga cartas o de que el nombre especificado como parámetro no coincida con ninguna carta, devuelve null.
     */
        public Carta tirarCarta(String nombreCartaAJugar){
          Carta cartaJugada = null;
        if(numeroCartasEnMano > 0){
            int cartaActual = 0;
            boolean buscando = true;
            while(cartaActual < cartasJugador.length && buscando){
                if(cartasJugador[cartaActual] != null){
                    if(nombreCartaAJugar.equals(cartasJugador[cartaActual].toString())){
                        buscando = false;
                        cartaJugada = cartasJugador[cartaActual];
                        numeroCartasEnMano--;
                        System.out.println("El jugador "+ nombreJugador + " ha jugado la carta "+ cartasJugador[cartaActual]);
                        cartasJugador[cartaActual] = null;
                    }
                    cartaActual++;
                }
            }
        }
          return cartaJugada;
    }
    
     /**
     * Tira una carta aleatoria
     */
        public Carta tirarCartaAleatoria(){
        Carta cartaJugada = null; 
        if(numeroCartasEnMano > 0){
          Random aleatorio = new Random();
          boolean buscadorDeCartas = false;
          while(!buscadorDeCartas  ){
             int numeroAleatorio = aleatorio.nextInt(5);
             if(cartasJugador[numeroAleatorio] != null){
                  cartaJugada = cartasJugador[numeroAleatorio];
                  numeroCartasEnMano--;
                  System.out.println("El jugador "+ nombreJugador + " ha jugado la carta "+ cartasJugador[numeroAleatorio]);
                  cartasJugador[numeroAleatorio] = null;
                  buscadorDeCartas = true;
             }
          }
           }
          return cartaJugada;
    }
}
