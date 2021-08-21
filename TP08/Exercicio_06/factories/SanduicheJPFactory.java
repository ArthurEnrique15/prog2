package Exercicio_06.factories;

import Exercicio_06.ingredientes_genericos.*;
import Exercicio_06.ingredientes_especificos.*;

public class SanduicheJPFactory implements SanduicheFactory {

    @Override
    public Ingrediente criarPao() {
        return new PaoFrances();
    }
    
    @Override
    public Ingrediente criarPresunto() {
        return new PresuntoDeFrango();
    }
    
    @Override
    public Ingrediente criarQueijo() {
        return new QueijoMussarela();
    }
    
    @Override
    public Ingrediente criarSalada() {
        return new SaladaComVerdura();
    }
    
}
