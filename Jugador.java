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
    
    public String getNombre(){
        return nombreJugador;
    }
}
