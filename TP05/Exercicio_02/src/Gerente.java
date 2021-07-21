public class Gerente extends Empregado{
    private String nomeGerencia;

    public Gerente(String nome, int idade, String sexo, double salario, String matricula, String nomeGerencia){
        super(nome, idade, sexo, salario, matricula);
        this.nomeGerencia = nomeGerencia;
    }

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    @Override
    public String toString() {
        return "Gerente:" +
                "\nNome: " + super.getNome() +
                "\nIdade: " + super.getIdade() +
                "\nMatrícula: " + super.getMatricula() +
                "\nNome da gerência: " + this.nomeGerencia +
                "\nValor do INSS: R$" + super.valorInss();
    }
}