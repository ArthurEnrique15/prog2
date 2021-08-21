package Exercicio_04;

public class Main {
    public static void main(String[] args) {

        Sanduiche lanchoneteCG = new Sanduiche();
        lanchoneteCG.setPao("integral");
        lanchoneteCG.setPresunto("frango");
        lanchoneteCG.setQueijo("prato");
        lanchoneteCG.setSalada("sem verdura");

        System.out.println("Sanduíche da lanchonete CG");
        System.out.println(lanchoneteCG);

        System.out.println();

        Sanduiche lanchoneteJP = new Sanduiche();
        lanchoneteJP.setPao("frances");
        lanchoneteJP.setPresunto("frango");
        lanchoneteJP.setQueijo("mussarela");
        lanchoneteJP.setSalada("com verdura");

        System.out.println("Sanduíche da lanchonete JP");
        System.out.println(lanchoneteJP);

        System.out.println();

        Sanduiche lanchoneteRT = new Sanduiche();
        lanchoneteRT.setPao("bola");
        lanchoneteRT.setPresunto("peru");
        lanchoneteRT.setQueijo("cheddar");
        lanchoneteRT.setSalada("sem verdura");

        System.out.println("Sanduíche da lanchonete RT");
        System.out.println(lanchoneteRT);
    }
}
