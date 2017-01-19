import java.util.ArrayList;
/**
 *1-Clase que se encarga de crear las 40 cartas de la barja española que muestre en un método verCartasDelMazo linea a línea
 *todos los nombres de las cartas.
 */
public class Mazo
{
    // instance variables - replace the example below with your own
    private ArrayList<Carta> cartasDelMazo;

    /**
     * Constructor for objects of class Mazo
     */
    public Mazo()
    {
      cartasDelMazo = new ArrayList<Carta>(40);  
      int contadorPalo = 0;
      while(contadorPalo < 4){
          int contadorValor = 1;
          while(contadorValor < 13 ){
              if(contadorValor <= 7 || contadorValor >=10){
                  Carta carta = new Carta(contadorValor, contadorPalo);
                  cartasDelMazo.add(carta);
            }
            contadorValor++;
          }
          contadorPalo++;
      }
    }
    
    public void verCartasDelMazo(){
        for(Carta carta : cartasDelMazo){
            System.out.println(carta);
            
            if(carta.getValorCarta() >= 12 && carta.getVpaloCarta() != 3){
                System.out.println("");
                System.out.println("----SIGUIENTE PALO----");
            }
        }
    }
}
