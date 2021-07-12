public class Main {
    public static void main(String[] args) {
        System.out.print("Criando e escrevendo frases");
        Frase frase1 = new Frase();

        frase1.addPalavra("Bom");
        frase1.addIntervalo(1);
        frase1.addPalavra("dia");
        frase1.addIntervalo(1);

        frase1.escreverFrase();

        Frase frase2 = new Frase();

        frase2.addPalavra("Boa");
        frase2.addIntervalo(1);
        frase2.addPalavra("tarde");
        frase2.addIntervalo(1);

        frase2.escreverFrase();

        Frase frase3 = new Frase();

        frase3.addPalavra("Boa");
        frase3.addIntervalo(1);
        frase3.addPalavra("noite");
        frase3.addIntervalo(1);

        frase3.escreverFrase();

        Frase frase4 = new Frase();

        frase4.addPalavra("O");
        frase4.addIntervalo(1);
        frase4.addPalavra("dia");
        frase4.addIntervalo(1);
        frase4.addPalavra("tá");
        frase4.addIntervalo(1);
        frase4.addPalavra("lindo");
        frase4.addIntervalo(1);

        frase4.escreverFrase();

        Frase frase5 = new Frase();

        frase5.addPalavra("Clima");
        frase5.addIntervalo(1);
        frase5.addPalavra("ensolarado");
        frase5.addIntervalo(1);

        frase5.escreverFrase();

        System.out.print("\n\nCriando e escrevendo a letra");

        Letra letra = new Letra();

        letra.addFrase(frase1);
        letra.addFrase(frase2);
        letra.addFrase(frase3);
        letra.addFrase(frase4);
        letra.addFrase(frase5);

        letra.addBis(0);
        letra.addRefrao(1, 2);

        letra.escreverLetra();
    }
}
