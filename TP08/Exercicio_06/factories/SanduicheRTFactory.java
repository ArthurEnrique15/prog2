package Exercicio_06.factories;

import Exercicio_06.pao.*;
import Exercicio_06.presunto.*;
import Exercicio_06.queijo.*;
import Exercicio_06.salada.*;

public class SanduicheRTFactory implements SanduicheFactory {

    @Override
    public Pao criarPao() {
        return new PaoBola();
    }

    @Override
    public Presunto criarPresunto() {
        return new PresuntoDePeru();
    }

    @Override
    public Queijo criarQueijo() {
        return new QueijoCheddar();
    }

    @Override
    public Salada criarSalada() {
        return new SaladaSemVerdura();
    }
    
}
