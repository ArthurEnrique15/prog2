public class Cliente extends Pessoa{
    private double valorDivida;
    private int anoNasc;

    public Cliente(String nome, int idade, String sexo, double valorDivida, int anoNasc) {
        super(nome, idade, sexo);
        this.valorDivida = valorDivida;
        this.anoNasc = anoNasc;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    @Override
    public String toString() {
        return "Cliente:" +
               "\nNome: " + super.getNome() +
               "\nIdade: " + super.getIdade() +
               "\nSexo: " + super.getSexo() +
               "\nValor da dívida: R$" + this.valorDivida +
               "\nAno de nascimento: " + this.anoNasc;
    }
}
