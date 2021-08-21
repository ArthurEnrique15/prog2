package Exercicio_04.ingredientes_especificos;

import Exercicio_04.ingredientes_genericos.Queijo;

public class QueijoPrato extends Queijo {
    @Override
    public String getTipoEspecifico() {
        return "Prato";
    }
}
