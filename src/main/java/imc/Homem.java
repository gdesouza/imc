package imc;

/**
 * Homem
 */
public class Homem extends Pessoa {

    public Homem (String nome, String sobrenome,
                   Integer idade, Double peso, Double altura) {
        this.SetNome(nome);
        this.SetSobrenome(sobrenome);
        this.SetIdade(idade);
        this.SetAltura(altura);
        this.SetPeso(peso);
        this.SetSexo(Sexo.Masculino);
    }

    public String GetClassificacao() {
        Double imc = GetImc();
        if (imc < 20.7) return "abaixo do peso";
        if (imc < 26.4) return "no peso ideal";
        if (imc < 27.8) return "marginalmente acima do peso";
        if (imc < 31.1) return "acima do peso ideal";
        if (imc >= 31.1) return "obeso";
        return "";
    }
}
