package Exercicio_06;

import Exercicio_06.pao.*;
import Exercicio_06.presunto.*;
import Exercicio_06.queijo.*;
import Exercicio_06.salada.*;

public class Sanduiche {
    private Pao pao;
    private Queijo queijo;
    private Presunto presunto;
    private Salada salada;

    public Sanduiche(String pao, String queijo, String presunto, String salada) {
        this.pao = PaoFactory.criarPao(pao);
        this.queijo = QueijoFactory.criarQueijo(queijo);
        this.presunto = PresuntoFactory.criarPresunto(presunto);
        this.salada = SaladaFactory.criarSalada(salada);
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
