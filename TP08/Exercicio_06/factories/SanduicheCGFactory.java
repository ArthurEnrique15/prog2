package Exercicio_06.factories;

import Exercicio_06.ingredientes_genericos.*;
import Exercicio_06.ingredientes_especificos.*;

public class SanduicheCGFactory implements SanduicheFactory {
    
    @Override
    public Ingrediente criarPao() {
        return new PaoIntegral();
    }
    
    @Override
    public Ingrediente criarPresunto() {
        return new PresuntoDeFrango();
    }
    
    @Override
    public Ingrediente criarQueijo() {
        return new QueijoPrato();
    }
    
    @Override
    public Ingrediente criarSalada() {
        return new SaladaSemVerdura();
    }
}
