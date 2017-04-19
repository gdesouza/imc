package imc;

/**
 * Mulher
 */
public class Mulher extends Pessoa {

  public Mulher (String nome, String sobrenome,
                 Integer idade, Double peso, Double altura) {
      this.SetNome(nome);
      this.SetSobrenome(sobrenome);
      this.SetIdade(idade);
      this.SetAltura(altura);
      this.SetPeso(peso);
      this.SetSexo(Sexo.Feminino);
  }

  public String GetClassificacao() {
    Double imc = GetImc();

    if (imc < 19.1) return "abaixo do peso";
    if (imc < 25.8) return "no peso ideal";
    if (imc < 27.3) return "marginalmente acima do peso";
    if (imc < 32.3) return "acima do peso ideal";
    if (imc >= 32.3) return "obeso";
    return "";
  }

}
