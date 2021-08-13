package Exercicio_01_a;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> nomes = new HashSet<>();
        int operacao;
        String nome;

        Scanner scn = new Scanner(System.in);

        do {
            System.out.println("0. Sair");
            System.out.println("1. Inserir nome");
            System.out.println("2. Exibir os nomes");
            System.out.println("3. Pesquisar nome");
            System.out.println("4. Excluir nome");
            System.out.println("5. Apagar todos os nomes");

            System.out.print("\nDigite o que deseja fazer: ");
            operacao = scn.nextInt();
            scn.nextLine();

            switch (operacao) {
                case 1:
                    System.out.print("\nDigite o nome: ");
                    nome = scn.nextLine();
                    if (nomes.add(nome))
                        System.out.println("\nNome inserido!\n");
                    else
                        System.out.println("\nNome repetido, não é possível inserir!\n");
                    break;

                case 2:
                    if (!nomes.isEmpty())
                        System.out.println("\nNomes\n" + nomes + "\n");
                    else
                        System.out.println("\nNão existem nomes cadastrados!\n");
                    break;

                case 3:
                    System.out.print("\nDigite o nome: ");
                    nome = scn.nextLine();

                    if (nomes.contains(nome))
                        System.out.println("\nNome encontrado!\n");
                    else
                        System.out.println("\nNome não encontrado!\n");
                    break;

                case 4:
                    System.out.print("\nDigite o nome: ");
                    nome = scn.nextLine();

                    if (nomes.remove(nome))
                        System.out.println("\nNome removido!\n");
                    else
                        System.out.println("\nNome não encontrado!\n");

                    break;

                case 5:
                    nomes.clear();
                    System.out.println("\nNomes excluídos!\n");
		    break;	
            }
        } while (operacao != 0);

        System.out.println("\nPrograma finalizado!");
    }
}
