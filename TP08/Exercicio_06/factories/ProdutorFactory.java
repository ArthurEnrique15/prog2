package Exercicio_06.factories;

public class ProdutorFactory {
    public static SanduicheFactory GetFactory (String factory) {
        if (factory.equalsIgnoreCase("cg")) return new SanduicheCGFactory();
        else if (factory.equalsIgnoreCase("jp")) return new SanduicheJPFactory();
        else if (factory.equalsIgnoreCase("rt")) return new SanduicheRTFactory();
        else return null;
    }
}
