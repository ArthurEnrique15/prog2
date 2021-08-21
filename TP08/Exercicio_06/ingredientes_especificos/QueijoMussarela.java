package Exercicio_06.ingredientes_especificos;

import Exercicio_06.ingredientes_genericos.Queijo;

public class QueijoMussarela extends Queijo {
    @Override
    public String getTipoEspecifico() {
        return "Mussarela";
    }
}
