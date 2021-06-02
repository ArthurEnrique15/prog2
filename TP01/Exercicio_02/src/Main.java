import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Planta[] plantas = new Planta[50];
        int operacao;

        do {

            System.out.println("0. Sair");
            System.out.println("1. Cadastrar planta");
            System.out.println("2. Lista de plantas a comprar");
            System.out.print("Digite o que deseja fazer: ");

            Scanner scn = new Scanner(System.in);

            operacao = scn.nextInt();

            clearBuffer(scn);

            switch (operacao) {
                case 0:
                    System.out.print("Programa finalizado!");
                    break;
                case 1:
                    for (int i = 0; i < plantas.length; i++) {
                        if (plantas[i] == null) {
                            plantas[i] = new Planta();

                            System.out.println("Planta " + (i+1));

                            System.out.print("Digite o nome da planta: ");
                            plantas[i].nomePlanta = scn.nextLine();

                            System.out.print("Digite a quantidade em estoque da planta: ");
                            plantas[i].qtdEstoque = scn.nextInt();

                            System.out.print("Digite a quantidade ideal de estoque da planta: ");
                            plantas[i].estoqueIdeal = scn.nextInt();

                            break;
                        }

                        if ((plantas[i] != null) && (i == plantas.length - 1)) {
                            System.out.println("Não é possível cadastrar mais plantas!");
                        }
                    }
                    break;

                case 2:
                    System.out.println("Lista de plantas a comprar\n");
                    for (int i = 0; i < plantas.length; i++) {
                        if ((plantas[i] != null) && (plantas[i].estoqueIdeal - plantas[i].qtdEstoque > 0)) {

                            System.out.println("Planta: " + plantas[i].nomePlanta);

                            System.out.println("Quantidade a ser comprada: " + (plantas[i].estoqueIdeal - plantas[i].qtdEstoque) + "\n");

                        }
                    }
                    break;

                default:
                    System.out.println("Operação inválida\n");
                    break;
            }


        } while (operacao != 0);


    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
