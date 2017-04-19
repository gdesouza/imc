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

    public void testaImc()
    {
      Pessoa fulano = new Homem("Fulano", "da Silva", 20, 70.0, 1.90);
      assertEquals(70.0/(1.90*1.90), fulano.GetImc());

      // TO DO: complementar o teste com objetos da classe mulher

    }

    public void testaClassificacao()
    {
      // resultado do IMC é 19.3
      Pessoa fulano = new Homem("Fulano", "da Silva", 20, 70.0, 1.90);
      assertEquals("abaixo do peso", fulano.GetClassificacao());

      // to do: complementar o teste com objetos da classe mulher

    }


    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        Pessoa fulano = new Homem("Fulano", "da Silva", 20, 70.0, 1.90);
        assertEquals("Fulano,da Silva,20,Masculino,70.0,1.9,19.390581717451525,abaixo do peso",
                    fulano.GetPessoaCsv());
        System.out.println(fulano.GetPessoaCsv());
    }

    public void testaLista()
    {
      ListaDePessoas lista = new ListaDePessoas(4);

      lista.AdicionarPessoa( new Homem("Fulano", "De tal", 1, 80.0, 1.90) );
      lista.AdicionarPessoa( new Homem("Fulano", "De tal", 1, 90.0, 1.70) );
      lista.AdicionarPessoa( new Mulher("Fulano", "De tal", 1, 90.0, 1.70) );
      lista.AdicionarPessoa( new Mulher("Fulano", "De tal", 1, 90.0, 1.70) );

      lista.ImprimeListaCsv();
      lista.ImprimeRelatorio();

    }

    public void testMediaDePesos() {

        Double pesoH1 = 82.0;
        Double pesoH2 = 86.0;
        Double pesoM1 = 72.0;
        Double pesoM2 = 76.0;

        ListaDePessoas lista = new ListaDePessoas(4);
        lista.AdicionarPessoa( new Homem("Fulano1",  "De tal", 20, pesoH1, 1.72) );
        lista.AdicionarPessoa( new Homem("Fulano2",  "De tal", 30, pesoH2, 1.74) );
        lista.AdicionarPessoa( new Mulher("Fulana1", "De tal", 22, pesoM1, 1.70) );
        lista.AdicionarPessoa( new Mulher("Fulana2", "De tal", 32, pesoM2, 1.72) );

        assertEquals((pesoH1+pesoH2)/2, lista.GetMediaPesosHomens());
        assertEquals((pesoM1+pesoM2)/2, lista.GetMediaPesosMulheres());
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
