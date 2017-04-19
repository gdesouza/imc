package imc;

/**
 * Pessoa
 */
public abstract class Pessoa {
    public enum Sexo {
        Feminino,
        Masculino
    }

    public enum Classificacao {
        ABAIXO_DO_PESO,
        PESO_NORMAL,
        MARGINALMENTE_ACIMA,
        ACIMA_DO_PESO,
        OBESO
    }

    public Pessoa() {}

    protected Integer id;
    protected Sexo    sexo;
    protected String  nome;
    protected String  sobrenome;
    protected Integer idade;
    protected Double  peso;
    protected Double  altura;

    public Double GetImc() {
        return ( peso / (altura*altura) );
    }

    public abstract String GetClassificacao();

    public String GetPessoaCsv() {
        Character separador = ',';

        return  this.GetNome() + separador +
                this.GetSobrenome() + separador +
                this.GetIdade() + separador +
                this.GetSexo() + separador +
                this.GetPeso() + separador +
                this.GetAltura() + separador +
                this.GetImc() + separador +
                this.GetClassificacao();
    }

    // Métodos acessores e modificadores

    public void SetId(Integer id) {
        this.id = id;
    }

    public Integer GetId() {
        return this.id;
    }

    public void SetSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Sexo GetSexo() {
        return this.sexo;
    }

    public void SetNome(String nome) {
        this.nome = nome;
    }

    public String GetNome() {
        return this.nome;
    }

    public void SetSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String GetSobrenome() {
        return this.sobrenome;
    }

    public void SetIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer GetIdade() {
        return this.idade;
    }

    public void SetPeso(Double peso) {
        this.peso = peso;
    }

    public Double GetPeso() {
        return this.peso;
    }

    public void SetAltura(Double altura) {
        this.altura = altura;
    }

    public Double GetAltura() {
        return this.altura;
    }

}
