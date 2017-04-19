package imc;

/**
 * Lista de Pessoas
 */
public class ListaDePessoas {

  public ListaDePessoas(Integer tamanho) {
      pessoas = new Pessoa[tamanho];
      SomaIdadesMulheres = 0;
      SomaIdadesHomens   = 0;
      SomaPesosMulheres  = 0.0;
      SomaPesosHomens    = 0.0;
      SomaAlturaMulheres = 0.0;
      SomaAlturasHomens  = 0.0;
      NumeroDeMulheres   = 0;
      NumeroDeHomens     = 0;
  }

  private Pessoa[] pessoas;

  protected Double  SomaPesosMulheres;
  protected Double  SomaPesosHomens;
  protected Double  SomaAlturaMulheres;
  protected Double  SomaAlturasHomens;
  protected Integer SomaIdadesMulheres;
  protected Integer SomaIdadesHomens;
  protected Integer NumeroDeMulheres;
  protected Integer NumeroDeHomens;

  public void AdicionarPessoa(Mulher m) {
      Integer posicao = this.GetNumeroDePessoas();
      pessoas[posicao] = m;

      this.NumeroDeMulheres   += 1;
      this.SomaIdadesMulheres += m.idade;
      this.SomaAlturaMulheres += m.altura;
      this.SomaPesosMulheres  += m.peso;
  }

  public void AdicionarPessoa(Homem h) {
      Integer posicao = this.GetNumeroDePessoas();
      pessoas[posicao] = h;

      this.NumeroDeHomens    +=1;
      this.SomaIdadesHomens  += h.idade;
      this.SomaAlturasHomens += h.altura;
      this.SomaPesosHomens   += h.peso;
  }


  // Métodos acessores e modificadores

  public Double GetMediaPesosMulheres() {
      return (NumeroDeMulheres > 0 ? SomaPesosMulheres / NumeroDeMulheres : 0);
  }


  public Double GetMediaPesosHomens() {
      return (NumeroDeHomens > 0 ? SomaPesosHomens / NumeroDeHomens : 0);
  }


  public Double GetMediaAlturasMulheres() {
      return (NumeroDeMulheres > 0 ? SomaAlturaMulheres / NumeroDeMulheres : 0);
  }


  public Double GetMediaAlturasHomens() {
      return (NumeroDeHomens > 0 ? SomaAlturasHomens / NumeroDeHomens : 0);
  }

  public Double GetMediaIdadesMulheres() {
      return (NumeroDeMulheres > 0 ? 1.0*SomaIdadesMulheres / NumeroDeMulheres : 0);
  }


  public Double GetMediaIdadesHomens() {
      return (NumeroDeHomens > 0 ? 1.0*SomaIdadesHomens / NumeroDeHomens : 0);
  }


  public Integer GetNumeroDeMulheres() {
      return this.NumeroDeMulheres;
  }


  public Integer GetNumeroDeHomens() {
      return this.NumeroDeHomens;
  }

  public Integer GetNumeroDePessoas() {
      return this.NumeroDeMulheres + this.NumeroDeHomens;
  }

  public void ImprimeRelatorio() {
      System.out.println( "Media de pesos");
      System.out.println( "     Mulheres : " + this.GetMediaPesosMulheres() );
      System.out.println( "     Homens   : " + this.GetMediaPesosHomens() );
      System.out.println( "Media de alturas");
      System.out.println( "     Mulheres : " + this.GetMediaAlturasMulheres() );
      System.out.println( "     Homens   : " + this.GetMediaAlturasHomens() );
      System.out.println( "Media de idades");
      System.out.println( "     Mulheres : " + this.GetMediaIdadesMulheres() );
      System.out.println( "     Homens   : " + this.GetMediaIdadesHomens() );

      // TO DO: Implementar para mostrar o IMC

  }


  public String GetPessoaCsv(int posicao) {
      return pessoas[posicao].GetPessoaCsv(); 
  }

  public void ImprimeListaCsv() {
      System.out.println("Nome,Sobrenome,Idade,Sexo,Peso,IMC,Classificação");
      for (int i=0; i<this.GetNumeroDePessoas(); i++) {
          System.out.println(pessoas[i].GetPessoaCsv());
      }
  }

}
