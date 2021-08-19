package Exercicio_06;

public class Main {
    public static void main(String[] args) {

        Sanduiche lanchoneteCG = new Sanduiche("integral", "prato", "frango", "sem verdura");
        System.out.println("Sanduíche da lanchonete CG");
        System.out.println(lanchoneteCG);

        System.out.println();

        Sanduiche lanchoneteJP = new Sanduiche("frances", "mussarela", "frango", "com verdura");
        System.out.println("Sanduíche da lanchonete JP");
        System.out.println(lanchoneteJP);

        System.out.println();

        Sanduiche lanchoneteRT = new Sanduiche("bola", "cheddar", "peru", "sem verdura");
        System.out.println("Sanduíche da lanchonete RT");
        System.out.println(lanchoneteRT);

        System.out.println();

        Sanduiche meuSanduiche = new Sanduiche("frances", "cheddar", "peru", "com verdura");
        System.out.println("Meu sanduíche");
        System.out.println(meuSanduiche);
    }
}
