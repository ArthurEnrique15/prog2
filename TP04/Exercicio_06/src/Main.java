import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /*public static void main(String[] args) {
        Nota notas[] = new Nota[7];
        criarNotas(notas);

        Melodia melodia1 = new Melodia();

        melodia1.addNota(notas[4]);
        melodia1.addIntervalo(1);
        melodia1.addNota(notas[1]);
        melodia1.addIntervalo(1);
        melodia1.addNota(notas[0]);
        melodia1.addIntervalo(1);

        Frase frase1 = new Frase();

        frase1.addPalavra("Bom");
        frase1.addIntervalo(1);
        frase1.addPalavra("dia");
        frase1.addIntervalo(1);

        Frase frase2 = new Frase();

        frase2.addPalavra("Boa");
        frase2.addIntervalo(1);
        frase2.addPalavra("tarde");
        frase2.addIntervalo(1);

        Frase frase3 = new Frase();

        frase3.addPalavra("Boa");
        frase3.addIntervalo(1);
        frase3.addPalavra("noite");
        frase3.addIntervalo(1);

        Frase frase4 = new Frase();

        frase4.addPalavra("O");
        frase4.addIntervalo(1);
        frase4.addPalavra("dia");
        frase4.addIntervalo(1);
        frase4.addPalavra("tá");
        frase4.addIntervalo(1);
        frase4.addPalavra("lindo");
        frase4.addIntervalo(1);

        Frase frase5 = new Frase();

        frase5.addPalavra("Clima");
        frase5.addIntervalo(1);
        frase5.addPalavra("ensolarado");
        frase5.addIntervalo(1);

        Letra letra1 = new Letra();

        letra1.addFrase(frase1);
        letra1.addFrase(frase2);
        letra1.addFrase(frase3);
        letra1.addFrase(frase4);
        letra1.addFrase(frase5);

        letra1.addBis(0);
        letra1.addRefrao(1, 2);

        System.out.println("Música 1");
        Musica musica1 = new Musica(letra1, melodia1);
        musica1.tocarMusica();

        Melodia melodia2 = new Melodia();

        melodia2.addNota(notas[2]);
        melodia2.addIntervalo(1);
        melodia2.addNota(notas[5]);
        melodia2.addIntervalo(1);
        melodia2.addNota(notas[6]);
        melodia2.addIntervalo(1);

        Frase frase6 = new Frase();
        frase6.addPalavra("O");
        frase6.addIntervalo(1);
        frase6.addPalavra("sol");
        frase6.addIntervalo(1);
        frase6.addPalavra("está");
        frase6.addIntervalo(1);
        frase6.addPalavra("brilhando");
        frase6.addIntervalo(1);

        Frase frase7 = new Frase();
        frase7.addPalavra("A");
        frase7.addIntervalo(1);
        frase7.addPalavra("chuva");
        frase7.addIntervalo(1);
        frase7.addPalavra("está");
        frase7.addIntervalo(1);
        frase7.addPalavra("longe");
        frase7.addIntervalo(1);

        Letra letra2 = new Letra();
        letra2.addFrase(frase6);
        letra2.addFrase(frase7);

        System.out.println("\n\nMúsica 2");
        Musica musica2 = new Musica(letra2, melodia2);
        musica2.tocarMusica();

        System.out.println("\nPot-Pourri das músicas 1 e 2");
        musica1.potPourri(musica2);
        musica1.tocarMusica();
    }*/

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Compositor de música\n");

        System.out.println("------ Melodia -------");

        System.out.println("\nQuantas notas deseja adicionar à melodia de sua música?");
        int qtdNotas = scn.nextInt();
        scn.nextLine();

        while (qtdNotas <= 0) {
            System.out.println("Quantidade de notas inválida! Digite novamente");
            qtdNotas = scn.nextInt();
            scn.nextLine();
        }

        Melodia melodia = new Melodia();

        for(int i = 0; i < qtdNotas; i++) {
            System.out.println();
            escreveNotas();
            System.out.println("Digite a letra correspondente à nota desejada");
            String nota = scn.nextLine();

            while (nota.equals("C") == false &&
                   nota.equals("D") == false &&
                   nota.equals("E") == false &&
                   nota.equals("F") == false &&
                   nota.equals("G") == false &&
                   nota.equals("A") == false &&
                   nota.equals("B") == false) {
                System.out.println("Nota inválida! Digite novamente");
                nota = scn.nextLine();
            }

            System.out.println("\nModificadores");
            System.out.println("# = sustenido    b = bemol");
            System.out.println("Digite o modificador ou apenas enter caso não queira nenhum");
            String modificador = scn.nextLine();

            while (modificador.equals("#") == false &&
                   modificador.equals("b") == false &&
                   modificador.equals("") == false){
                System.out.println("Modificador inválido! Digite novamente");
                modificador = scn.nextLine();
            }

            System.out.println("Digite o tempo de duração da nota");
            int tempo = scn.nextInt();
            scn.nextLine();

            while (tempo <= 0) {
                System.out.println("Duração inválida! Digite novamente");
                tempo = scn.nextInt();
                scn.nextLine();
            }

            System.out.println("Digite o intervalo de tempo entre essa nota e a próxima");
            int intervalo = scn.nextInt();
            scn.nextLine();

            while (intervalo <= 0) {
                System.out.println("Duração inválida! Digite novamente");
                intervalo = scn.nextInt();
                scn.nextLine();
            }

            melodia.addNota(new Nota(nota, modificador, tempo));
            melodia.addIntervalo(intervalo);
        }

        System.out.println("\n------- Letra -------");
        String continuar;
        Letra letra = new Letra();

        do {
            Frase frase = new Frase();
            String palavra = " ";
            System.out.println("\nLeitura da frase (deixe vazio para parar a leitura)");
            while (palavra.equals("") == false) {
                System.out.print("Digite a palavra: ");
                palavra = scn.nextLine();

                if (palavra.equals("") == false) {
                    System.out.print("Digite o intervalo em segundos entre essa palavra e a próxima: ");
                    int intervalo = scn.nextInt();

                    scn.nextLine();

                    frase.addPalavra(palavra);
                    frase.addIntervalo(intervalo);
                }
            }

            letra.addFrase(frase);

            System.out.println("\nDeseja adicionar mais uma frase? (s/n)");
            continuar = scn.nextLine();

            while (continuar.equals("s") == false && continuar.equals("n") == false) {
                System.out.println("Opção inválida! Digite novamente");
                continuar = scn.nextLine();
            }
        } while(continuar.equals("s") == true);

        System.out.println("\n------- Música -------");
        Musica musica = new Musica(letra, melodia);

        musica.tocarMusica();
    }

    public static void escreveNotas(){
        System.out.println("Notas");
        System.out.println("C = dó    D = ré    E = mi    F = fá");
        System.out.println("G = sol   A = lá    B = si");
    }
}


