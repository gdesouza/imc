package imc;

import java.util.ArrayList;
import java.util.List;

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

        String arquivo = "C:\\Users\\unicesumar\\ads\\imc\\lista.csv";
        LeDadosCsv leitorCsv = new LeDadosCsv(arquivo);
        leitorCsv.readFile();

        ListaDePessoas pessoas = new ListaDePessoas(leitorCsv.GetSize());
        List<String[]> dados = leitorCsv.getInfoList();

        for (int i=0; i<leitorCsv.GetSize(); i++) {
          String id = leitorCsv.getAtArrayIndex(dados.get(i), 0);
          String sexo = leitorCsv.getAtArrayIndex(dados.get(i), 1);
          String nome = leitorCsv.getAtArrayIndex(dados.get(i), 2);
          String sobreNome = leitorCsv.getAtArrayIndex(dados.get(i), 3);
          String idade = leitorCsv.getAtArrayIndex(dados.get(i), 4);
          String peso = leitorCsv.getAtArrayIndex(dados.get(i), 5);
          String altura = leitorCsv.getAtArrayIndex(dados.get(i), 6);

          if (sexo.equals("masculino"))
            pessoas.AdicionarPessoa( new Homem(nome, sobreNome,
                                  Integer.parseInt(idade),
                                  Double.parseDouble(peso),
                                  Double.parseDouble(altura)/100) );
          else
            pessoas.AdicionarPessoa( new Mulher(nome, sobreNome,
                                  Integer.parseInt(idade),
                                  Double.parseDouble(peso),
                                  Double.parseDouble(altura)/100) );
        }





        for (int i=0; i<leitorCsv.GetSize(); i++)
          System.out.println(pessoas.GetPessoaCsv(i));

    }
}
