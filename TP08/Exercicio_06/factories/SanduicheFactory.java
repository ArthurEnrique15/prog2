package Exercicio_06.factories;

import Exercicio_06.ingredientes_genericos.Ingrediente;

public interface SanduicheFactory {
    public Ingrediente criarPao();
    public Ingrediente criarPresunto();
    public Ingrediente criarQueijo();
    public Ingrediente criarSalada();
}
