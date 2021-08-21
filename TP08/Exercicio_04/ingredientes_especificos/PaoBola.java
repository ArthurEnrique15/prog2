package Exercicio_04.ingredientes_especificos;

import Exercicio_04.ingredientes_genericos.Pao;

public class PaoBola extends Pao {
    @Override
    public String getTipoEspecifico() {
        return "Bola";
    }
}
