import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int tamanho, selectConjunto, numero;
        Scanner scn = new Scanner(System.in);

        System.out.print("Digite o tamanho do primeiro conjunto: ");
        tamanho = scn.nextInt();

        IntegerSet conjunto1 = new IntegerSet(tamanho);

        System.out.print("Digite o tamanho do segundo conjunto: ");
        tamanho = scn.nextInt();

        IntegerSet conjunto2 = new IntegerSet(tamanho);

        int operacao;

        do {
            System.out.println();
            System.out.println("0. Sair");
            System.out.println("1. Adicionar número ao conjunto");
            System.out.println("2. Remover número do conjunto");
            System.out.println("3. Listar elementos dos conjuntos");
            System.out.println("4. União dos conjuntos");
            System.out.println("5. Interseção dos conjuntos");
            System.out.println("6. Diferença dos conjuntos");
            System.out.print("Digite o que deseja fazer: ");

            operacao = scn.nextInt();

            switch (operacao) {
                case 0:
                    System.out.print("Programa finalizado!");
                    break;
                case 1:
                    selectConjunto = selecionarConjunto();

                    System.out.print("\nDigite o numero que deseja adicionar: ");
                    numero = scn.nextInt();

                    while (numero < 0) {
                        System.out.print("Valor inválido, digite novamente: ");
                        numero = scn.nextInt();
                    }

                    if (selectConjunto == 1) {
                        conjunto1.adicionarNumero(numero);
                    } else {
                        conjunto2.adicionarNumero(numero);
                    }
                    break;

                case 2:
                    selectConjunto = selecionarConjunto();

                    System.out.print("\nDigite o numero que deseja remover: ");
                    numero = scn.nextInt();

                    while (numero < 0) {
                        System.out.print("Valor inválido, digite novamente: ");
                        numero = scn.nextInt();
                    }

                    if (selectConjunto == 1) {
                        if (conjunto1.calculaQtdElementosDoConjunto() > 0)
                            conjunto1.removerNumero(numero);
                        else
                            System.out.println("O conjunto está vazio, não é possível remover elementos!");
                    } else {
                        if (conjunto2.calculaQtdElementosDoConjunto() > 0)
                            conjunto2.removerNumero(numero);
                        else
                            System.out.println("O conjunto está vazio, não é possível remover elementos!");
                    }
                    break;

                case 3:
                    System.out.println();
                    if (conjunto1.calculaQtdElementosDoConjunto() > 0) {
                        System.out.println("Conjunto 1: " + conjunto1.toString());
                    }else {
                        System.out.println("O conjunto 1 está vazio");
                    }

                    if (conjunto2.calculaQtdElementosDoConjunto() > 0) {
                        System.out.println("Conjunto 2: " + conjunto2.toString());
                    }else {
                        System.out.println("O conjunto 2 está vazio");
                    }
                    break;

                case 4:
                    IntegerSet conjuntoUniao = conjunto1.uniaoConjuntos(conjunto2);
                    System.out.println("\nConjunto união: " + conjuntoUniao.toString());
                    break;

                case 5:
                    IntegerSet conjuntoIntersecao = conjunto1.intersecaoConjuntos(conjunto2);
                    if (conjuntoIntersecao.calculaQtdElementosDoConjunto() > 0)
                        System.out.println("\nConjunto interseção: " + conjuntoIntersecao.toString());
                    else
                        System.out.println("\nNão existe interseção entre os conjuntos!");
                    break;

                case 6:
                    System.out.println();
                    System.out.println("1. Diferença do conjunto 1 para o 2");
                    System.out.println("2. Diferença do conjunto 2 para o 1");
                    System.out.print("Digite qual diferença deseja fazer: ");

                    int selectDiferenca = scn.nextInt();

                    while (selectDiferenca < 1 || selectDiferenca > 2) {
                        System.out.print("Valor inválido, digite novamente: ");

                        selectDiferenca = scn.nextInt();
                    }
                    IntegerSet conjuntoDiferenca;
                    if (selectDiferenca == 1) {
                        conjuntoDiferenca = conjunto1.diferencaConjuntos(conjunto2);
                    } else {
                        conjuntoDiferenca = conjunto2.diferencaConjuntos(conjunto1);
                    }

                    if (conjuntoDiferenca.calculaQtdElementosDoConjunto() > 0)
                        System.out.println("\nConjunto da diferença: " + conjuntoDiferenca.toString());
                    else
                        System.out.println("\nA diferença é um conjunto vazio");

                    break;

                default:
                    System.out.println("Operação inválida\n");
                    break;
            }
        } while (operacao != 0);
    }

    public static int selecionarConjunto () {
        int selectConjunto;
        Scanner scn = new Scanner(System.in);
        System.out.println();
        System.out.println("1. Conjunto 1");
        System.out.println("2. Conjunto 2");
        System.out.print("\nDigite qual conjunto deseja alterar: ");
        selectConjunto = scn.nextInt();

        while (selectConjunto < 1 || selectConjunto > 2) {
            System.out.print("Valor inválido, digite novamente: ");
            selectConjunto = scn.nextInt();
        }

        return selectConjunto;
    }
}
