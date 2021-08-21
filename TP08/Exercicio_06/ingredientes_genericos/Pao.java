package Exercicio_06.ingredientes_genericos;

public abstract class Pao implements Ingrediente {
    @Override
    public String getTipoGenerico() {
        return "Pão";
    }
}
