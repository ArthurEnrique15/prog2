package Exercicio_04.factories;

import Exercicio_04.ingredientes_especificos.SaladaComVerdura;
import Exercicio_04.ingredientes_especificos.SaladaSemVerdura;
import Exercicio_04.ingredientes_genericos.Salada;

public class SaladaFactory {
    public static Salada CriarSalada(String tipo) {
        if (tipo.equalsIgnoreCase("com verdura")) return new SaladaComVerdura();
        else if (tipo.equalsIgnoreCase("sem verdura")) return new SaladaSemVerdura();
        else return null;
    }
}
