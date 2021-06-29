public class Invoice {
    private int numeroItem;
    private String descricaoItem;
    private int qtdComprada;
    private double precoItem;

    public Invoice(int numeroItem, String descricaoItem, int qtdComprada, double precoItem) {
        this.numeroItem = numeroItem;
        this.descricaoItem = descricaoItem;

        if (qtdComprada >= 0)
            this.qtdComprada = qtdComprada;
        else
            this.qtdComprada = 0;

        if (precoItem >= 0)
            this.precoItem = precoItem;
        else
            this.precoItem = 0;
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getQtdComprada() {
        return qtdComprada;
    }

    public void setQtdComprada(int qtdComprada) {
        this.qtdComprada = qtdComprada;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }

    public double getInvoiceAmount () {
        return this.precoItem * this.qtdComprada;
    }

}
