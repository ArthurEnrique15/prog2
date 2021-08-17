import java.util.ArrayList;
import java.util.List;

public class Letra {
    private List<Frase> frases;
    private List<Integer> posicaoBis;
    private int posicaoInicioRefrao;
    private int posicaoFinalRefrao;

    public Letra() {
        this.frases = new ArrayList<>();
        this.posicaoBis = new ArrayList<>();
        this.posicaoInicioRefrao = -1;
        this.posicaoFinalRefrao = -1;
    }

    public void addFrase(Frase frase){
        if (frase != null)
            this.frases.add(frase);
    }

    public void addBis(int posicaoBis) {
        this.posicaoBis.add(posicaoBis);
    }

    public boolean procuraBis(int posicao){
        for (int i = 0; i < this.posicaoBis.size(); i++){
            if (this.posicaoBis.get(i) == posicao)
                return true;
        }
        return false;
    }

    public void addRefrao(int posicaoInicioRefrao, int posicaoFinalRefrao){
        this.posicaoInicioRefrao = posicaoInicioRefrao;
        this.posicaoFinalRefrao = posicaoFinalRefrao;
    }

    public void escreverLetra(){
        for (int i = 0; i < this.frases.size(); i++){
            if (i == posicaoInicioRefrao)
                System.out.print("\n\nRefrão");

            this.frases.get(i).escreverFrase();

            if (procuraBis(i) == true)
                System.out.print("(bis)");

            if (i == posicaoFinalRefrao)
                System.out.println();
        }
    }
}
