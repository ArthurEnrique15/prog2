package Exercicio_06.ingredientes_especificos;

import Exercicio_06.ingredientes_genericos.Queijo;

public class QueijoPrato extends Queijo {
    @Override
    public String getTipoEspecifico() {
        return "Prato";
    }
}
