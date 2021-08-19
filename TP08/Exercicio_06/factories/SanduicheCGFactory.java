package Exercicio_06.factories;

import Exercicio_06.pao.*;
import Exercicio_06.presunto.*;
import Exercicio_06.queijo.*;
import Exercicio_06.salada.*;

public class SanduicheCGFactory implements SanduicheFactory {

    @Override
    public Pao criarPao() {
        return new PaoIntegral();
    }

    @Override
    public Presunto criarPresunto() {
        return new PresuntoDeFrango();
    }

    @Override
    public Queijo criarQueijo() {
        return new QueijoPrato();
    }

    @Override
    public Salada criarSalada() {
        return new SaladaSemVerdura();
    }
    
}
