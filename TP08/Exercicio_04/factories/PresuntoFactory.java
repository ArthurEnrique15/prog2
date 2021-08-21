package Exercicio_04.factories;

import Exercicio_04.ingredientes_especificos.PresuntoDeFrango;
import Exercicio_04.ingredientes_especificos.PresuntoDePeru;
import Exercicio_04.ingredientes_genericos.Presunto;

public class PresuntoFactory {
    public static Presunto CriarPresunto(String tipo) {
        if (tipo.equalsIgnoreCase("frango")) return new PresuntoDeFrango();
        else if (tipo.equalsIgnoreCase("peru")) return new PresuntoDePeru();
        else return null;
    }
}
