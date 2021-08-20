package Exemplo_Adapter;

public class Main {
    public static void main(String[] args) {
        TomadaTresPinos tresPinos = new TomadaTresPinos();

        TomadaDoisPinos tomada = new AdapterTomada(tresPinos);
        tomada.ligarTomadaDoisPinos();
    }
}
