public abstract class Veiculo{
    private float velocidadeAtual;

    public Veiculo() {
        this.velocidadeAtual = 0;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public abstract void acelerar(float velocidade);
    public abstract void parar();
}
