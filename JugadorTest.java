

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class JugadorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class JugadorTest
{
    /**
     * Default constructor for test class JugadorTest
     */
    public JugadorTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void TestJugador()
    {
        Carta carta1 = new Carta(1, 0);
        Carta carta2 = new Carta(2, 0);
        Carta carta3 = new Carta(3, 0);
        Carta carta4 = new Carta(2, 2);
        Carta carta5 = new Carta(2, 6);
        Carta carta6 = new Carta(12, 0);
        Jugador jugador1 = new Jugador("manolo");
        jugador1.verCartasDelJugador();
        jugador1.recibirCarta(carta1);
        jugador1.recibirCarta(carta2);
        jugador1.recibirCarta(carta3);
        jugador1.verCartasDelJugador();
        jugador1.recibirCarta(carta4);
        jugador1.recibirCarta(carta6);
        jugador1.verCartasDelJugador();
    }
}

