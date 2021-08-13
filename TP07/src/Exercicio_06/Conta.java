package Exercicio_06;

public class Conta {
    private double saldo;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void sacar (double valor) throws ContaException {
        if (valor > this.saldo) {
            ContaException contaException = new ContaException("Saldo insuficiente");
            throw contaException;
        }
        this.saldo -= valor;
    }
}
