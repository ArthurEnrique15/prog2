package Exercicio_04;

import Exercicio_04.factories.IngredienteFactory;
import Exercicio_04.ingredientes_genericos.Ingrediente;

public class Sanduiche {
    private Ingrediente pao;
    private Ingrediente presunto;
    private Ingrediente queijo;
    private Ingrediente salada;

    public void setPao(String paoEspecifico) {
        this.pao = IngredienteFactory.CriarIngrediente("pão", paoEspecifico);
    }

    public void setPresunto(String presuntoEspecifico) {
        this.presunto = IngredienteFactory.CriarIngrediente("presunto", presuntoEspecifico);
    }

    public void setQueijo(String queijoEspecifico) {
        this.queijo = IngredienteFactory.CriarIngrediente("queijo", queijoEspecifico);
    }

    public void setSalada(String saladaEspecifica) {
        this.salada = IngredienteFactory.CriarIngrediente("salada", saladaEspecifica);
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
