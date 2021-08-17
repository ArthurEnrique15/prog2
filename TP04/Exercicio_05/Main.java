public class Main {
    public static void main(String[] args) {
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
    }

    public static void criarNotas(Nota notas[]){
        notas[0] = new Nota("C", "", 1);
        notas[1] = new Nota("D", "", 1);
        notas[2] = new Nota("E", "", 1);
        notas[3] = new Nota("F", "", 1);
        notas[4] = new Nota("G", "", 1);
        notas[5] = new Nota("A", "", 1);
        notas[6] = new Nota("B", "", 1);
    }
}


