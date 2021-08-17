package Exercicio_07;

public class Conta {
    private double saldo;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void sacar (double valor) throws ContaException {
        if (valor > this.saldo) {
            ContaException contaException = new ContaException("Saldo insuficiente", this.saldo);
            throw contaException;
        }
        this.saldo -= valor;
    }
}
