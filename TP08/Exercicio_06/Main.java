package Exercicio_06;

import Exercicio_06.factories.ProdutorFactory;
import Exercicio_06.factories.SanduicheFactory;

public class Main {
    public static void main(String[] args) {

        SanduicheFactory sanduicheCGFactory = ProdutorFactory.GetFactory("cg");
        SanduicheFactory sanduicheJPFactory = ProdutorFactory.GetFactory("jp");
        SanduicheFactory sanduicheRTFactory = ProdutorFactory.GetFactory("rt");

        System.out.println("Sanduíche da lanchonete CG");
        Sanduiche sanduicheCG = new Sanduiche(sanduicheCGFactory);
        System.out.println(sanduicheCG);

        System.out.println("\nSanduíche da lanchonete JP");
        Sanduiche sanduicheJP = new Sanduiche(sanduicheJPFactory);
        System.out.println(sanduicheJP);

        System.out.println("\nSanduíche da lanchonete RT");
        Sanduiche sanduicheRT = new Sanduiche(sanduicheRTFactory);
        System.out.println(sanduicheRT);
    }
}
