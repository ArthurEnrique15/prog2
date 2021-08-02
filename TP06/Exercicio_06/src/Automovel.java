public class Automovel extends Veiculo{
    float qtdOleo;

    public Automovel() {
        super();
        qtdOleo = 0;
    }
    @Override
    public void acelerar(float velocidade) {
        super.setVelocidadeAtual(super.getVelocidadeAtual() + velocidade);
    }

    @Override
    public void parar() {
        super.setVelocidadeAtual(0);
    }

    public void trocarOleo(float litros) {
        this.qtdOleo += litros;
    }

    public float getQtdOleo() {
        return qtdOleo;
    }
}
