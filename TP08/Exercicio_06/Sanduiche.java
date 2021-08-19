package Exercicio_06;

import Exercicio_06.factories.SanduicheFactory;
import Exercicio_06.pao.*;
import Exercicio_06.presunto.*;
import Exercicio_06.queijo.*;
import Exercicio_06.salada.*;

public class Sanduiche {
    private Pao pao;
    private Queijo queijo;
    private Presunto presunto;
    private Salada salada;

    public Sanduiche(SanduicheFactory sanduicheFactory) {
        this.pao = sanduicheFactory.criarPao();
        this.queijo = sanduicheFactory.criarQueijo();
        this.presunto = sanduicheFactory.criarPresunto();
        this.salada = sanduicheFactory.criarSalada();
    }

    @Override
    public String toString() {
        return 
            this.pao.getTipo() + "\n" +
            this.queijo.getTipo() + "\n" +
            this.presunto.getTipo() + "\n" +
            this.salada.getTipo();
    }
}
