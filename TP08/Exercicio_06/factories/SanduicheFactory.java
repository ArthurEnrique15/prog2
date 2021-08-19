package Exercicio_06.factories;

import Exercicio_06.pao.Pao;
import Exercicio_06.presunto.Presunto;
import Exercicio_06.queijo.Queijo;
import Exercicio_06.salada.Salada;

public interface SanduicheFactory {
    public Pao criarPao();
    public Presunto criarPresunto();
    public Queijo criarQueijo();
    public Salada criarSalada();
}
