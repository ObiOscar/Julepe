import java.util.ArrayList;
import java.util.Random;
/**
 *1- Crear una clase llamado Mazo, en el constructor debe crear las 40 cartas de la baraja española y dejarlas guardadas.
 *2- Crear un método llamado verCartasDelMazo que muestra liea a linea todos los nombres de las cartas existentes en el mazo.
 *3- Implementa un metodo llamado barajar en la clase Mazo que no devuelva nada y consiga mezclar las cartas existentes en ese momento en el mazo.
 */
public class Mazo
{
    private ArrayList<Carta> cartasDelMazo; // Creo un ArrayList de la clase Carta y lo llamo cartas del Mazo
    private Random numeroAleatorio;

    /**
     *1- Crear una clase llamado Mazo, en el constructor debe crear las 40 cartas de la baraja española y dejarlas guardadas.
     */
    public Mazo()
    {
      cartasDelMazo = new ArrayList<Carta>(40);  // Mando crear un nuevo ArrayList con un contenido de 40 cartas
      numeroAleatorio = new Random(40);
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
        }
    }
    
    /**
     *3- Implementa un metodo llamado barajar en la clase Mazo que no devuelva nada y consiga mezclar las cartas existentes en ese momento en el mazo.
     */
    public void barajar(){
        for (int primera = 0; primera < cartasDelMazo.size(); primera++){
            int segunda = numeroAleatorio.nextInt(cartasDelMazo.size());
            Carta temporal = cartasDelMazo.get(primera);
            
            cartasDelMazo.set(primera,cartasDelMazo.get(segunda));
            cartasDelMazo.set(segunda,temporal);
        }
    }
    
    /**
     *4- Implementar un metodo llamado sacarCarta en la clase Mazo que devuelva un objeto Carta. Concretamente debe devolver la primera carta del mazo, eliminando esta del mazo..
     */
    public Carta sacarCarta(){
        Carta sacar = null;
        if(cartasDelMazo.size() > 0){
           sacar = cartasDelMazo.remove(0);      // Primero borra el elemento de esa posición 
        }
        return sacar;
    }
}
