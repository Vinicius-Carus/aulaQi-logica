

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author  Vinicius Carus
 * @version 1.0
 * @since 30/05/2020 - 15:53
 */
public class MonthTest {

    Month month = new Month();

    /**
     * Construtor default para a classe de teste TestMonth
     */
    public MonthTest() {
        month.setNumberOfMonth(1);
    }

    /**
     * Define a .
     * <p>
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp() {
        month.setNumberOfMonth(1);
    }

    /**
     * Tears down the test fixture.
     * <p>
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown() {
    }

    @Test
    public void testChooseMonth() {
        assertEquals("January", month.chooseMonth());

        month.setNumberOfMonth(2);
        assertEquals("February", month.chooseMonth());

        month.setNumberOfMonth(3);
        assertEquals("March", month.chooseMonth());

        month.setNumberOfMonth(4);
        assertEquals("April", month.chooseMonth());

        month.setNumberOfMonth(5);
        assertEquals("May", month.chooseMonth());

        month.setNumberOfMonth(6);
        assertEquals("June", month.chooseMonth());

        month.setNumberOfMonth(7);
        assertEquals("July", month.chooseMonth());

        month.setNumberOfMonth(8);
        assertEquals("August", month.chooseMonth());

        month.setNumberOfMonth(9);
        assertEquals("September", month.chooseMonth());

        month.setNumberOfMonth(10);
        assertEquals("October", month.chooseMonth());

        month.setNumberOfMonth(11);
        assertEquals("November", month.chooseMonth());

        month.setNumberOfMonth(12);
        assertEquals("December", month.chooseMonth());

        month.setNumberOfMonth(13);
        assertEquals("Numero invalido", month.chooseMonth());
    }
}