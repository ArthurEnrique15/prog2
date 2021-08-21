package Exercicio_06.ingredientes_genericos;

public abstract class Queijo implements Ingrediente {
    @Override
    public String getTipoGenerico() {
        return "Queijo";
    }
}