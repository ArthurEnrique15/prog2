package Exercicio_07;

public class Main {
    public static void main(String[] args) {
        
        Cliente client = new Cliente(new AdapterSomador());
        client.executar();
        
    }
}
