public class Girafa implements iAnimal {
    private String nomeEspecie;
    private String nomeAnimal;
    private double altura;

    public Girafa(String nomeEspecie, String nomeAnimal, double altura) {
        this.nomeEspecie = nomeEspecie;
        this.nomeAnimal = nomeAnimal;
        this.altura = altura;
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
