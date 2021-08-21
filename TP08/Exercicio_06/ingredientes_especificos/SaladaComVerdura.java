package Exercicio_06.ingredientes_especificos;

import Exercicio_06.ingredientes_genericos.Salada;

public class SaladaComVerdura extends Salada {
    @Override
    public String getTipoEspecifico() {
        return "com Verdura";
    }
}
