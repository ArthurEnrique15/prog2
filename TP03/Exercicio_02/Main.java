import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int linha, coluna, qtdJogadas = 0;
        JogoDaVelha jogoDaVelha = new JogoDaVelha();
        Scanner scn = new Scanner(System.in);

        do {
            System.out.print("Vez do jogador " + jogoDaVelha.getJogadorAtual());
            if (jogoDaVelha.getJogadorAtual() == 1)
                System.out.println(" (x)");
            else
                System.out.println(" (o)");
            jogoDaVelha.escreveGrade();

            System.out.println("Digite a linha e a coluna da jogada");
            linha = scn.nextInt();
            coluna = scn.nextInt();

            while (jogoDaVelha.marcar(linha, coluna) == false) {
                System.out.println("Digite a linha e a coluna da jogada novamente");
                linha = scn.nextInt();
                coluna = scn.nextInt();
            }
            System.out.println();

            qtdJogadas++;
        } while (jogoDaVelha.verificaVencedor() == 0 && qtdJogadas < 9);

        jogoDaVelha.escreveGrade();
        System.out.println();
        if (qtdJogadas == 9 && jogoDaVelha.verificaVencedor() == 0)
            System.out.println("Empate!");
        else if (jogoDaVelha.verificaVencedor() == 1)
            System.out.println("O jogador 1 venceu!");
        else if (jogoDaVelha.verificaVencedor() == 2)
            System.out.println("O jogador 2 venceu!");

    }
}
