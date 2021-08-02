public class Main {
    public static void main(String[] args) {
        /*Midia midia = new Midia(100, "viúva negra");

        System.out.println(midia);

        Midia midia2 = new Midia(200, "xD");

        System.out.println(midia2);

        System.out.println(midia);*/

        CD cd = new CD(5, "Red Hot Chilli Peppers - Californication", 10);

        cd.printDados();

        System.out.println();

        DVD dvd = new DVD(5, "Michael Jackson - This is it", 7);
        dvd.printDados();

        System.out.println("Alterando os dados...\n");

        cd.inserirDados(10, "Guns N' Roses - Use Your Illusion I", 5);
        cd.printDados();

        System.out.println();

        dvd.inserirDados(7, "Iron Maiden - Fear of the Dark", 8);
        dvd.printDados();
    }
}
