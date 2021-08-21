package Exercicio_06.ingredientes_especificos;

import Exercicio_06.ingredientes_genericos.Salada;

public class SaladaSemVerdura extends Salada {
    @Override
    public String getTipoEspecifico() {
        return "sem Verdura";
    }
}