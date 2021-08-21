package Exercicio_06.factories;

import Exercicio_06.ingredientes_genericos.*;
import Exercicio_06.ingredientes_especificos.*;

public class SanduicheRTFactory implements SanduicheFactory {

    @Override
    public Ingrediente criarPao() {
        return new PaoBola();
    }
    
    @Override
    public Ingrediente criarPresunto() {
        return new PresuntoDePeru();
    }
    
    @Override
    public Ingrediente criarQueijo() {
        return new QueijoCheddar();
    }
    
    @Override
    public Ingrediente criarSalada() {
        return new SaladaSemVerdura();
    }
}
