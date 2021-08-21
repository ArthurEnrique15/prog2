package Exercicio_04.ingredientes_especificos;

import Exercicio_04.ingredientes_genericos.Salada;

public class SaladaSemVerdura extends Salada {
    @Override
    public String getTipoEspecifico() {
        return "sem Verdura";
    }
}