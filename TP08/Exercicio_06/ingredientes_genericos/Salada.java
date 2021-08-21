package Exercicio_06.ingredientes_genericos;

public abstract class Salada implements Ingrediente {
    @Override
    public String getTipoGenerico() {
        return "Salada";
    }
}