import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] manicures = new String[5];
        manicures[0] = "Neusa";
        manicures[1] = "Isabel";
        manicures[2] = "Creusa";
        manicures[3] = "Vanessa";
        manicures[4] = "Marlene";

        Servico[] servicos = new Servico[50];

        int operacao;

        Scanner scn = new Scanner(System.in);

        do {
            System.out.println("\nCabeleireira Sempre Bela");
            System.out.println("0. Sair");
            System.out.println("1. Cadastrar Serviço");
            System.out.println("2. Listar serviços");
            System.out.println("3. Folha de pagamento");
            System.out.print("Digite o que deseja fazer: ");
            operacao = scn.nextInt();

            switch (operacao) {
                case 0:
                    System.out.println("Programa finalizado!");
                    break;

                case 1:
                    cadastrarServico(servicos, manicures);
                    break;

                case 2:
                    listarServicos(servicos);
                    break;
                    
                case 3:
                    folhaDePagamento(servicos, manicures);
            }
        } while (operacao != 0);

    }

    public static void cadastrarServico (Servico[] servicos, String[] manicures) {
        Scanner scn = new Scanner(System.in);
        int manicure;

        for (int i = 0; i < servicos.length; i++) {
            if (servicos[i] == null) {
                servicos[i] = new Servico();
                System.out.print("\nDigite a descrição do serviço: ");
                servicos[i].descricao = scn.nextLine();

                System.out.print("Digite o valor do serviço: ");
                servicos[i].valor = scn.nextFloat();

                System.out.print("\n");
                for (int j = 0; j < manicures.length; j++) {
                    System.out.println((j+1) + ". " + manicures[j]);
                }
                System.out.print("Selecione uma manicure: ");
                manicure = scn.nextInt();

                servicos[i].manicure = manicures[manicure-1];

                break;
            }
        }
    }

    public static void listarServicos (Servico[] servicos) {

        System.out.println("\nLista de Serviços");
        for (int i = 0; i < servicos.length; i++) {
            if (servicos[i] != null) {
                System.out.println("\nServiço " + (i + 1));
                System.out.println("Descrição: " + servicos[i].descricao);
                System.out.println("Valor: R$" + servicos[i].valor);
                System.out.println("Manicure: " + servicos[i].manicure);
            }
        }
    }
    
    public static void folhaDePagamento (Servico[] servicos, String[] manicures) {
        System.out.println("\nFolha de pagamento da cabeleireira Sempre Bela\n");

        for (int i = 0; i < manicures.length; i++) {
            System.out.println("Manicure: " + manicures[i]);
            float valorPago = 0;
            for (int j = 0; j < servicos.length; j++) {
                if (servicos[j] != null && servicos[j].manicure.equals(manicures[i])) {
                    valorPago += (servicos[j].valor / 2);
                }
            }
            System.out.println("Valor a ser pago: R$" + valorPago + "\n");
        }
    }
}
