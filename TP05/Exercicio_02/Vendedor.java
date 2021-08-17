public class Vendedor extends Empregado{
    private double valorVendas;
    private int qtdVendas;

    public Vendedor(String nome, int idade, String sexo, double salario, String matricula, double valorVendas, int qtdVendas) {
        super(nome, idade, sexo, salario, matricula);
        this.valorVendas = valorVendas;
        this.qtdVendas = qtdVendas;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    @Override
    public String toString() {
        return "Vendedor:" +
                "\nNome: " + super.getNome() +
                "\nSalário: " + super.getSalario() +
                "\nValor das vendas: " + this.valorVendas +
                "\nQuantidade de vendas: " + this.qtdVendas;
    }
}
