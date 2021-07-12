import java.util.ArrayList;
import java.util.List;

public class Musica {
    private List<Letra> letra;
    private List<Melodia> melodia;

    public Musica(Letra letra, Melodia melodia){
        this.letra = new ArrayList<>();
        this.melodia = new ArrayList<>();

        this.letra.add(letra);
        this.melodia.add(melodia);
    }

    public void potPourri(Musica musica) {
        for (int i = 0; i < musica.melodia.size(); i++) {
            this.letra.add(musica.letra.get(i));
            this.melodia.add(musica.melodia.get(i));
        }
    }

    public void tocarMusica(){
        for (int i = 0; i < this.melodia.size(); i++) {
            System.out.println("Melodia da música");
            this.melodia.get(i).tocarMelodia();

            System.out.print("\nLetra da música");
            this.letra.get(i).escreverLetra();
            System.out.println();
        }
    }

}
