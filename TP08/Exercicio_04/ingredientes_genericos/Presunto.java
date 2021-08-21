package Exercicio_04.ingredientes_genericos;

public abstract class Presunto implements Ingrediente {
    @Override
    public String getTipoGenerico() {
        return "Presunto";
    }
}
