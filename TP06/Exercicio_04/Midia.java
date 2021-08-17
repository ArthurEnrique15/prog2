public abstract class Midia {
    private int codigo;
    private double preco;
    private String nome;
    private static int contadorCodigo;

    public Midia() {
        contadorCodigo++;
        this.codigo = contadorCodigo;
        this.preco = 0;
        this.nome = "";
    }

    public Midia(double preco, String nome) {
        contadorCodigo++;
        this.codigo = contadorCodigo;
        this.preco = preco;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return "Mídia";
    }

    public String getDetalhes() {
        return "Código: " + this.codigo + "\n" +
               "Nome: " + this.nome + "\n" +
               "Preço: R$" + this.preco + "\n";
    }

    public void printDados() {
        System.out.println(this.getTipo());
        System.out.println(this.getDetalhes());
    }

    public abstract void inserirDados(double preco, String nome, int numero);
}
