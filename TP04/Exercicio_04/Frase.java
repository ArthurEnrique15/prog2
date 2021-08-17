import java.util.ArrayList;
import java.util.List;

public class Frase {
    private List<String> palavras;
    private List<Integer> intervalos;

    public Frase() {
        this.palavras = new ArrayList<>();
        this.intervalos = new ArrayList<>();
    }

    public void addPalavra(String palavra) {
        if (palavra != null)
            this.palavras.add(palavra);
    }

    public void addIntervalo(int intervalo) {
        this.intervalos.add(intervalo);
    }

    public void escreverFrase(){
        System.out.println();
        for (int i = 0; i < this.palavras.size(); i++) {
            System.out.print(palavras.get(i) + " (" + intervalos.get(i) + "s) ");
        }
    }
}
