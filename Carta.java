
/**
   * 1- Método toString que devuelve el valor de carta, si es "as","sota", "caballo", "rey" que aparezca con letra, sino con numero. Tambien el tipo de palo en letra.
   * 2- Devuelve el valor de la carta
    * 3- Devuelve el valor del palo
 */
public class Carta
{
    // instance variables - replace the example below with your own
    private int valorCarta;
    private int paloCarta;

    /**
     * Constructor que admita dos prametros enteros. El primer parametro indica el valor de la carta y puede ser desde 1 a 7 o desde 10 a 12. 
     * El segundo, indica el palo de la carta y puede ser de 0 a 3 (0 es oros, 1 es copas, 2 es espadas y 3 es bastos).  
     */
    public Carta(int valor, int palo)
    {
     valorCarta = valor;
     paloCarta = palo;
    }

    /**
     * 1- Método toString que devuelve el valor de carta, si es "as","sota", "caballo", "rey" que aparezca con letra, sino con numero. Tambien el tipo de palo en letra
     */
    public String toString()
    {
        String textoPalo = "";
        String textoValor = valorCarta + "";
        switch(paloCarta){
            case 0:
            textoPalo = " de oros"; 
            break;
            
            case 1:
            textoPalo = " de copas"; 
            break;
            
            case 2:
 
            textoPalo = " de espadas"; 
            break;
            
            case 3:
            textoPalo = " de bastos"; 
            break;
        }
        
        switch(valorCarta){
            
            case 1:
            textoValor = "as"; 
            break;
            
            case 10:
            textoValor = "sota"; 
            break;
            
            case 11:
            textoValor = "caballo"; 
            break;
            
            case 12:
             textoValor = "rey"; 
            break;
        }
        return textoValor + textoPalo;
    }
    
    /**
     * 2- Devuelve el valor de la carta
     */
    public int getValorCarta()
    {
        return valorCarta;
    }
    
     /**
     * 3- Devuelve el valor del palo
     */
    public int getVpaloCarta()
    {
        return paloCarta;
    }
    
    public boolean ganaA(Carta cartaAComparar, int paloQuePinta)
    {
       boolean gana = false;
    
       if (paloCarta == cartaAComparar.getVpaloCarta()) {
           // En caso de que tengan el mismo palo...
           if (getPosicionEscalaTute() > cartaAComparar.getPosicionEscalaTute()) {
               gana = true;
           }
       }
       else{
           // En caso de que tengan distinto palo...
           if (cartaAComparar.getVpaloCarta() != paloQuePinta) {
               gana = true;
           }
       } 
       return gana;
   }
  
  
   public int getPosicionEscalaTute() 
   {
      int posicion = valorCarta;
      if (valorCarta == 3) {
        posicion = 13;
      }
      else if (valorCarta == 1) {
        posicion = 14;
      }
      return posicion;    
   }
  
}
