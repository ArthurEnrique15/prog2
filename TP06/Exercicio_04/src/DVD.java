public class DVD extends Midia {
    private int faixas;

    public DVD() {
        super();
    }

    public DVD(double preco, String nome, int faixas) {
        super(preco, nome);
        this.faixas = faixas;
    }

    public int getFaixas() {
        return faixas;
    }

    public void setFaixas(int faixas) {
        this.faixas = faixas;
    }

    @Override
    public String getTipo() {
        return "DVD";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() +
               "Número de faixas: " + this.faixas + "\n" +
               " Capa do DVD\n" +
               " ___________\n" +
               "|           |\n" +
               "|           |\n" +
               "|    DVD    |\n" +
               "|           |\n" +
               "|___________|\n";
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
        this.faixas = numero;
    }
}
