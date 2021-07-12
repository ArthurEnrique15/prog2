public class Main {
    public static void main(String[] args) {
        Nota notas[] = new Nota[7];
        criarNotas(notas);

        Melodia melodia1 = new Melodia();

        melodia1.addNota(notas[0]);
        melodia1.addIntervalo(2);
        melodia1.addNota(notas[1]);
        melodia1.addIntervalo(3);
        melodia1.addNota(notas[2]);
        melodia1.addIntervalo(1);

        System.out.println("Melodia 1");
        melodia1.tocarMelodia();

        Melodia melodia2 = new Melodia();

        melodia2.addNota(notas[4]);
        melodia2.addIntervalo(1);
        melodia2.addNota(notas[5]);
        melodia2.addIntervalo(1);
        melodia2.addNota(notas[6]);
        melodia2.addIntervalo(1);

        System.out.println("\nMelodia 2");
        melodia2.tocarMelodia();

        System.out.println("\nAdicionando a melodia 2 à melodia 1");
        melodia1.addMelodiaInteira(melodia2);
        melodia1.tocarMelodia();

        System.out.println("\nAdicionando um trecho da melodia 1 à melodia 2");
        melodia2.addTrechoMelodia(melodia1, 2, 3);
        melodia2.tocarMelodia();
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
