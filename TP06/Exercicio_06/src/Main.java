public class Main {

    public static void main(String[] args) {

        System.out.println("Nova bicicleta!");
        Bicicleta bicicleta = new Bicicleta();

        System.out.println("Velocidade atual da bicicleta: " + bicicleta.getVelocidadeAtual() + " km/h\n");

        System.out.println("Acelerar bicicleta!");
        bicicleta.acelerar(30);
        System.out.println("Velocidade atual da bicicleta: " + bicicleta.getVelocidadeAtual() + " km/h\n");

        System.out.println("Parar bicicleta!");
        bicicleta.parar();
        System.out.println("Velocidade atual da bicicleta: " + bicicleta.getVelocidadeAtual() + " km/h\n");

        System.out.println("Novo automóvel!");
        Automovel automovel = new Automovel();
        System.out.println("Velocidade atual do automóvel: " + automovel.getVelocidadeAtual() + " km/h\n");

        System.out.println("Acelerar automóvel!");
        automovel.acelerar(120);
        System.out.println("Velocidade atual do automóvel: " + automovel.getVelocidadeAtual() + " km/h\n");

        System.out.println("Parar automóvel!");
        automovel.parar();
        System.out.println("Velocidade atual do automóvel: " + automovel.getVelocidadeAtual() + " km/h\n");

        System.out.println("O automóvel precisa de óleo!");
        System.out.println("Quantidade atual de litros de óleo: " + automovel.getQtdOleo() + "L\n");

        System.out.println("Adicionando 3L de óleo!");
        automovel.trocarOleo(3);
        System.out.println("Quantidade atual de litros de óleo: " + automovel.getQtdOleo() + "L\n");
    }
}
