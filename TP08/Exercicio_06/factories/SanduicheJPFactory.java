package Exercicio_06.factories;

import Exercicio_06.pao.*;
import Exercicio_06.presunto.*;
import Exercicio_06.queijo.*;
import Exercicio_06.salada.*;

public class SanduicheJPFactory implements SanduicheFactory {

    @Override
    public Pao criarPao() {
        return new PaoFrances();
    }

    @Override
    public Presunto criarPresunto() {
        return new PresuntoDeFrango();
    }

    @Override
    public Queijo criarQueijo() {
        return new QueijoMussarela();
    }

    @Override
    public Salada criarSalada() {
        return new SaladaComVerdura();
    }
    
}
