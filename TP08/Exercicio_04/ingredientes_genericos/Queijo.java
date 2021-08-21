package Exercicio_04.ingredientes_genericos;

public abstract class Queijo implements Ingrediente {
    @Override
    public String getTipoGenerico() {
        return "Queijo";
    }
}