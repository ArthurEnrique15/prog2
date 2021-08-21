package Exercicio_06;

import Exercicio_06.ingredientes_genericos.Ingrediente;
import Exercicio_06.factories.SanduicheFactory;

public class Sanduiche {
    private Ingrediente pao;
    private Ingrediente presunto;
    private Ingrediente queijo;
    private Ingrediente salada;

    public Sanduiche(SanduicheFactory sanduicheFactory) {
        this.pao = sanduicheFactory.criarPao();
        this.queijo = sanduicheFactory.criarQueijo();
        this.presunto = sanduicheFactory.criarPresunto();
        this.salada = sanduicheFactory.criarSalada();
    }

    @Override
    public String toString() {
        return 
            this.pao.getTipoGenerico() + " " + this.pao.getTipoEspecifico() + "\n" + 
            this.queijo.getTipoGenerico() + " " + this.queijo.getTipoEspecifico() + "\n" + 
            this.presunto.getTipoGenerico() + " " + this.presunto.getTipoEspecifico() + "\n" + 
            this.salada.getTipoGenerico() + " " + this.salada.getTipoEspecifico();
    }
}
