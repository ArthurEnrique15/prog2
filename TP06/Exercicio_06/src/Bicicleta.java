public class Bicicleta extends Veiculo {
    @Override
    public void acelerar(float velocidade) {
        super.setVelocidadeAtual(super.getVelocidadeAtual() + velocidade);
    }

    @Override
    public void parar() {
        super.setVelocidadeAtual(0);
    }
}
