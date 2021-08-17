public class CD extends Midia {
    private int musicas;

    public CD() {
        super();
    }

    public CD(double preco, String nome, int musicas) {
        super(preco, nome);
        this.musicas = musicas;
    }

    public int getMusicas() {
        return musicas;
    }

    public void setMusicas(int musicas) {
        this.musicas = musicas;
    }

    @Override
    public String getTipo() {
        return "CD";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() +
               "Número de músicas: " + this.musicas + "\n" +
               "Tocando a primeira música do álbum...";
    }

    @Override
    public void printDados() {
        System.out.println(this.getTipo());
        System.out.println(this.getDetalhes());
    }

    @Override
    public void inserirDados(double preco, String nome, int numero) {
        super.setPreco(preco);
        super.setNome(nome);
        this.musicas = numero;
    }
}
