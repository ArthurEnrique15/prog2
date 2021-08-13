package Exercicio_06;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(100);
        try {
            conta.sacar(1000);
        } catch (ContaException e) {
            System.out.println(e.getMessage());
        }
    }
}
