package imc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Calculadora de IMC");
        System.out.println("Le os registros de um arquivo CSV e obtem informações sobre os IMCs de uma população.");
        System.out.println("Sintaxe: CalculadorImc <arquivo.csv>");

        ListaDePessoas lista = new ListaDePessoas(4);
        lista.AdicionarPessoa( new Homem("Fulano1",  "De tal", 20, 82.0, 1.72) );
        lista.AdicionarPessoa( new Homem("Fulano2",  "De tal", 30, 92.0, 1.74) );
        lista.AdicionarPessoa( new Mulher("Fulana1", "De tal", 22, 80.0, 1.70) );
        lista.AdicionarPessoa( new Mulher("Fulana2", "De tal", 32, 90.0, 1.72) );

        lista.ImprimeListaCsv();
        lista.ImprimeRelatorio();

    }
}
