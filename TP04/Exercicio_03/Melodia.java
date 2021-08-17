import java.util.ArrayList;
import java.util.List;

public class Melodia {
    private List<Nota> notas;
    private List<Integer> intervalos;

    public Melodia(){
        this.notas = new ArrayList<>();
        this.intervalos = new ArrayList<>();
    }

    public void addNota(Nota nota) {
        if (nota != null)
            this.notas.add(nota);
    }

    public void addIntervalo(int intervalo) {
        this.intervalos.add(intervalo);
    }

    public void addMelodiaInteira(Melodia melodia) {
        for(int i = 0; i < melodia.notas.size(); i++){
            this.notas.add(melodia.notas.get(i));
            this.intervalos.add(melodia.intervalos.get(i));
        }
    }

    public void addTrechoMelodia(Melodia melodia, int posicaoInicio, int posicaoFinal) {
        for(int i = posicaoInicio; i <= posicaoFinal; i++){
            if (i < melodia.notas.size())
                this.notas.add(melodia.notas.get(i));

            if (i < melodia.intervalos.size())
                this.intervalos.add(melodia.intervalos.get(i));
        }
    }

    public void tocarMelodia() {
        for(int i = 0; i < this.notas.size(); i++){
            notas.get(i).tocarNota();
            System.out.println("intervalo de " + intervalos.get(i) + "s");
        }
    }
}
