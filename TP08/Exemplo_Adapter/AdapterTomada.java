package Exemplo_Adapter;

public class AdapterTomada extends TomadaDoisPinos {
    private TomadaTresPinos tomadaTresPinos;

    public AdapterTomada(TomadaTresPinos tomadaTresPinos) {
        this.tomadaTresPinos = tomadaTresPinos;
    }

    @Override
    public void ligarTomadaDoisPinos() {
        this.tomadaTresPinos.ligarTomadaTresPinos();
    }
}
