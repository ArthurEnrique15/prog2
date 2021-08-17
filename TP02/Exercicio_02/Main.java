import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Invoice[] faturas = new Invoice[50];
        int operacao;

        Scanner scn = new Scanner(System.in);

        do {
            System.out.println("0. Sair");
            System.out.println("1. Cadastrar fatura");
            System.out.println("2. Listar faturas e seus valores");
            System.out.print("Digite o que deseja fazer: ");
            operacao = scn.nextInt();

            switch (operacao) {
                case 0:
                    System.out.println("Programa finalizado!");
                    break;

                case 1:
                    cadastrarFatura(faturas);
                    System.out.println("\nFatura cadastrada!\n");
                    break;

                case 2:
                    listarFaturas(faturas);
                    break;
            }
        } while (operacao != 0);

    }

    public static void cadastrarFatura (Invoice[] faturas) {
        Scanner scn = new Scanner(System.in);
        int numeroItem;
        String descricaoItem;
        int qtdComprada;
        double precoItem;

        for (int i = 0; i < faturas.length; i++) {
            if (faturas[i] == null) {


                System.out.print("\nDigite o número do item da fatura: ");
                numeroItem = scn.nextInt();

                scn.nextLine();

                System.out.print("\nDigite a descrição do item da fatura: ");
                descricaoItem = scn.nextLine();

                System.out.print("\nDigite a quantidade comprada do item da fatura: ");
                qtdComprada = scn.nextInt();

                System.out.print("\nDigite o preço do item da fatura: ");
                precoItem = scn.nextDouble();

                faturas[i] = new Invoice(numeroItem, descricaoItem, qtdComprada, precoItem);

                break;
            }
        }
    }

    public static void listarFaturas (Invoice[] faturas) {

        System.out.println("\nLista de Faturas");
        for (int i = 0; i < faturas.length; i++) {
            if (faturas[i] != null) {
                System.out.println("\nFatura " + (i + 1));
                System.out.println("Número do item: " + faturas[i].getNumeroItem());
                System.out.println("Descrição do item: " + faturas[i].getDescricaoItem());
                System.out.println("Quantidade comprada do item: " + faturas[i].getQtdComprada());
                System.out.println("Preço do item: R$" + faturas[i].getPrecoItem());
                System.out.println("Valor total: " + faturas[i].getInvoiceAmount());
            }
        }
        System.out.println("");
    }
}
