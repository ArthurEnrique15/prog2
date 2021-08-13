package Exercicio_07;

public class ContaException extends Exception{
    private double saldo;

    public ContaException(String mensagem, double saldo) {
        super(mensagem);
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
