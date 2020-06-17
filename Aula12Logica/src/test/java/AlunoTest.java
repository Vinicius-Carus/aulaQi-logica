
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author  Vinicius Carus
 * @version 1.0
 * @since 27/05/2020 = 21:00
 */
public class AlunoTest {

    Aluno aluno = new Aluno();

    public AlunoTest() {
    }

    /**
     * Define a .
     * <p>
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp() {
        aluno.setTotalDeAulas(100);
        aluno.setNumeroDePresencas(50);
        aluno.setNota1(10);
        aluno.setNota2(10);
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
    public void testCalcularFrequencia() {
        assertEquals(50, aluno.calcularFrequencia(), 0.0);

        aluno.setTotalDeAulas(200);
        aluno.setNumeroDePresencas(100);
        assertEquals(50, aluno.calcularFrequencia(), 0.0);

        aluno.setTotalDeAulas(300);
        aluno.setNumeroDePresencas(90);
        assertEquals(30, aluno.calcularFrequencia(), 0.0);

        aluno.setTotalDeAulas(300);
        aluno.setNumeroDePresencas(-1);
        assertEquals(0, aluno.calcularFrequencia(), 0.0);

        aluno.setTotalDeAulas(-100);
        aluno.setNumeroDePresencas(50);
        assertEquals(-50, aluno.calcularFrequencia(), 0.0);
    }

    @Test
    public void testCalcularMediaAritimetica() {
        assertEquals(10, aluno.calcularMediaAritimetica(), 0.0);

        aluno.setNota1(9);
        aluno.setNota2(9);
        assertEquals(9, aluno.calcularMediaAritimetica(), 0.0);

        aluno.setNota1(6);
        aluno.setNota2(8);
        assertEquals(7, aluno.calcularMediaAritimetica(), 0.0);

        aluno.setNota1(-2);
        aluno.setNota2(-2);
        assertEquals(0, aluno.calcularMediaAritimetica(), 0.0);
    }

    @Test
    public void testChecarSeEstaAprovado() {
        assertEquals("Aprovado", aluno.checarSeEstaAprovado());

        aluno.setNota1(2);
        aluno.setNota2(2);
        assertEquals("Reprovado", aluno.checarSeEstaAprovado());
    }

    @Test
    public void testVerificarSeEstaAprovado() {
        assertEquals("Reprovado por falta", aluno.verificarSeEstaAprovado());

        aluno.setNota1(2);
        aluno.setNota2(2);
        aluno.setNumeroDePresencas(100);
        assertEquals("Reprovado por nota", aluno.verificarSeEstaAprovado());

        aluno.setNota1(2);
        aluno.setNota2(2);
        aluno.setNumeroDePresencas(10);
        assertEquals("Reprovado", aluno.verificarSeEstaAprovado());

        aluno.setNota1(10);
        aluno.setNota2(10);
        aluno.setNumeroDePresencas(100);
        assertEquals("Aprovado", aluno.verificarSeEstaAprovado());
    }

    @Test
    public void testVerificarContexto() {
        assertEquals("A", aluno.verificarContexto());

        aluno.setNota1(7);
        aluno.setNota2(7);
        assertEquals("B", aluno.verificarContexto());

        aluno.setNota1(6);
        aluno.setNota2(6);
        assertEquals("C", aluno.verificarContexto());

        aluno.setNota1(2);
        aluno.setNota2(4);
        assertEquals("D", aluno.verificarContexto());
    }

    @Test
    public void testGetNota1() {
        assertEquals(10.0, aluno.getNota1(), 0.0);

        aluno.setNota1(-1);
        aluno.setNota2(7);
        assertEquals(0.0, aluno.getNota1(), 0.0);

        aluno.setNota1(11);
        aluno.setNota2(6);
        assertEquals(0.0, aluno.getNota1(), 0.0);
    }

    @Test
    public void testGetNota2() {
        assertEquals(10.0, aluno.getNota2(), 0.0);

        aluno.setNota1(-1);
        aluno.setNota2(-1);
        assertEquals(0.0, aluno.getNota2(), 0.0);

        aluno.setNota1(11);
        aluno.setNota2(12);
        assertEquals(0.0, aluno.getNota2(), 0.0);
    }

    @Test
    public void testGetNumeroDePresencas() {
        assertEquals(50, aluno.getNumeroDePresencas());

        aluno.setNumeroDePresencas(-1);
        assertEquals(0, aluno.getNumeroDePresencas());
    }

    @Test
    public void testGetTotalDeAulas() {
        assertEquals(100, aluno.getTotalDeAulas(), 0.0);

        aluno.setTotalDeAulas(-1);
        assertEquals(0, aluno.getTotalDeAulas(), 0.0);
    }
}
