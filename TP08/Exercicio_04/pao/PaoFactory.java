package Exercicio_04.pao;

public class PaoFactory {
    public static Pao criarPao(String tipo) {
        if (tipo.equalsIgnoreCase("integral")) return new PaoIntegral();
        else if (tipo.equalsIgnoreCase("frances")) return new PaoFrances();
        else if (tipo.equalsIgnoreCase("bola")) return new PaoBola();
        else return null;
    }
}
