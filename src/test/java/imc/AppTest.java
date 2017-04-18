package imc;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        ListaDePessoas lista = new ListaDePessoas(4);

        lista.AdicionarPessoa( new Homem("Fulano", "De tal", 1, 80.0, 1.90) );
        lista.AdicionarPessoa( new Homem("Fulano", "De tal", 1, 90.0, 1.70) );
        lista.AdicionarPessoa( new Mulher("Fulano", "De tal", 1, 90.0, 1.70) );
        lista.AdicionarPessoa( new Mulher("Fulano", "De tal", 1, 90.0, 1.70) );

        //lista.ImprimeRelatorio();
    }

    public void testMediaDePesos() {
        ListaDePessoas lista = new ListaDePessoas(4);
        lista.AdicionarPessoa( new Homem("Fulano1",  "De tal", 20, 82.0, 1.72) );
        lista.AdicionarPessoa( new Homem("Fulano2",  "De tal", 30, 92.0, 1.74) );
        lista.AdicionarPessoa( new Mulher("Fulana1", "De tal", 22, 80.0, 1.70) );
        lista.AdicionarPessoa( new Mulher("Fulana2", "De tal", 32, 90.0, 1.72) );

        assertEquals(87.0, lista.GetMediaPesosHomens());
        assertEquals(85.0, lista.GetMediaPesosMulheres());
    }

    public void testMediaDeAlturas() {
        ListaDePessoas lista = new ListaDePessoas(4);
        lista.AdicionarPessoa( new Homem("Fulano1",  "De tal", 20, 82.0, 1.72) );
        lista.AdicionarPessoa( new Homem("Fulano2",  "De tal", 30, 92.0, 1.74) );
        lista.AdicionarPessoa( new Mulher("Fulana1", "De tal", 22, 80.0, 1.70) );
        lista.AdicionarPessoa( new Mulher("Fulana2", "De tal", 32, 90.0, 1.72) );

        assertEquals(1.73, lista.GetMediaAlturasHomens());
        assertEquals(1.71, lista.GetMediaAlturasMulheres());
    }

    public void testMediaDeIdades() {
        ListaDePessoas lista = new ListaDePessoas(4);
        lista.AdicionarPessoa( new Homem("Fulano1",  "De tal", 20, 82.0, 1.72) );
        lista.AdicionarPessoa( new Homem("Fulano2",  "De tal", 30, 92.0, 1.74) );
        lista.AdicionarPessoa( new Mulher("Fulana1", "De tal", 22, 80.0, 1.70) );
        lista.AdicionarPessoa( new Mulher("Fulana2", "De tal", 32, 90.0, 1.72) );

        assertEquals(25.0, lista.GetMediaIdadesHomens());
        assertEquals(27.0, lista.GetMediaIdadesMulheres());
    }

    
}
