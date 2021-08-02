public class Baleia implements iAnimal{
    private String nomeEspecie;
    private String nomeAnimal;
    private double tamanho;

    public Baleia(String nomeEspecie, String nomeAnimal, double tamanho) {
        this.nomeEspecie = nomeEspecie;
        this.nomeAnimal = nomeAnimal;
    }

    @Override
    public String getNomeEspecie() {
        return this.nomeEspecie;
    }

    @Override
    public String getNomeAnimal() {
        return this.nomeAnimal;
    }
}
