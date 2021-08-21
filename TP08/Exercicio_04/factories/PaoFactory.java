package Exercicio_04.factories;

import Exercicio_04.ingredientes_especificos.PaoBola;
import Exercicio_04.ingredientes_especificos.PaoFrances;
import Exercicio_04.ingredientes_especificos.PaoIntegral;
import Exercicio_04.ingredientes_genericos.Pao;

public class PaoFactory {
    public static Pao CriarPao(String tipo) {
        if (tipo.equalsIgnoreCase("integral")) return new PaoIntegral();
        else if (tipo.equalsIgnoreCase("frances")) return new PaoFrances();
        else if (tipo.equalsIgnoreCase("bola")) return new PaoBola();
        else return null;
    }
}
