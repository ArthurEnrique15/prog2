public class Resultado {
    private String nomeEspecie;
    private int quantidade;

    public Resultado(String nomeEspecie, int quantidade) {
        this.nomeEspecie = nomeEspecie;
        this.quantidade = quantidade;
    }

    public void setNomeEspecie(String nomeEspecie) {
        this.nomeEspecie = nomeEspecie;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNomeEspecie() {
        return nomeEspecie;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
