package Exercicio_06;

import Exercicio_06.pao.Pao;
import Exercicio_06.presunto.Presunto;
import Exercicio_06.queijo.Queijo;
import Exercicio_06.salada.Salada;

public abstract class SanduicheFactory {
    public abstract Pao getPao();
    public abstract Presunto getPresunto();
    public abstract Queijo getQueijo();
    public abstract Salada getSalada();
}
