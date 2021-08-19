package Exercicio_04;

import Exercicio_04.pao.*;
import Exercicio_04.presunto.*;
import Exercicio_04.queijo.*;
import Exercicio_04.salada.*;

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
