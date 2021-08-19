package Exercicio_04.queijo;

public class QueijoFactory {
    public static Queijo criarQueijo(String tipo) {
        if (tipo.equalsIgnoreCase("cheddar")) return new QueijoCheddar();
        else if (tipo.equalsIgnoreCase("mussarela")) return new QueijoMussarela();
        else if (tipo.equalsIgnoreCase("prato")) return new QueijoPrato();
        else return null;
    }
}
