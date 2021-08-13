package Exercicio_01_b;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Produto> produtos = new HashSet<>();
        int operacao;


        Scanner scn = new Scanner(System.in);

        do {
            System.out.println("0. Sair");
            System.out.println("1. Inserir produto");
            System.out.println("2. Exibir os produtos");

            System.out.print("\nDigite o que deseja fazer: ");
            operacao = scn.nextInt();
            scn.nextLine();

            switch (operacao) {
                case 1:
                    System.out.print("\nDigite o id do produto: ");
                    int id = scn.nextInt();

                    scn.nextLine();

                    System.out.print("Digite o nome do produto: ");
                    String nome = scn.nextLine();

                    System.out.print("Digite o preço do produto: ");
                    double preco = scn.nextDouble();

                    if (produtos.add(new Produto(id, nome, preco)))
                        System.out.println("\nProduto inserido!\n");
                    else
                        System.out.println("\nProduto repetido, não é possível inserir!\n");
                    break;

                case 2:
                    if (!produtos.isEmpty()) {
                        System.out.println("Produtos\n");
                        for (Produto p : produtos)
                            System.out.println(p);
                    } else {
                        System.out.println("\nNão existem produtos cadastrados\n");
                    }
                    break;
            }
        } while (operacao != 0);

        System.out.println("\nPrograma finalizado!");
    }
}
