import java.util.ArrayList;
/**
 *1- Crear una clase llamado Mazo, en el constructor debe crear las 40 cartas de la baraja española y dejarlas guardadas.
 *2- Crear un método llamado verCartasDelMazo que muestra liea a linea todos los nombres de las cartas existentes en el mazo.
 */
public class Mazo
{
    private ArrayList<Carta> cartasDelMazo; // Creo un ArrayList de la clase Carta y lo llamo cartas del Mazo

    /**
     *1- Crear una clase llamado Mazo, en el constructor debe crear las 40 cartas de la baraja española y dejarlas guardadas.
     */
    public Mazo()
    {
      cartasDelMazo = new ArrayList<Carta>(40);  // Mando crear un nuevo ArrayList con un contenido de 40 cartas
      int contadorPalo = 0;                      // Variable para el primer contador
      while(contadorPalo < 4){
          int contadorValor = 1;                 // Variable para el segundo contador
          while(contadorValor < 13 ){
              if(contadorValor <= 7 || contadorValor >=10){                 // Las cartas tienen valores entre 1-7 o 10-12
                  Carta carta = new Carta(contadorValor, contadorPalo);     // Creo un objeto de clase Carta, al tener 2 parametros el constructor de la clase Carta pues pongo las dos variables que he creado antes
                  cartasDelMazo.add(carta);                                 // Añado la nueva carta al mazo de cartas
            }
            contadorValor++;                                    
          }
          contadorPalo++;
      }
    }
    
    /**
     *2- Crear un método llamado verCartasDelMazo que muestra liea a linea todos los nombres de las cartas existentes en el mazo.
     */
    public void verCartasDelMazo(){
        for(Carta carta : cartasDelMazo){
            System.out.println(carta);
            if(carta.getValorCarta() >= 12 && carta.getVpaloCarta() != 3){ // Lo creo para que no queden todas las cartas juntas
                System.out.println("");
                System.out.println("----SIGUIENTE PALO----");
            }
        }
    }
}
