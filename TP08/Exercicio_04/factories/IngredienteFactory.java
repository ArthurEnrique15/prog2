package Exercicio_04.factories;

import Exercicio_04.ingredientes_genericos.Ingrediente;

public class IngredienteFactory {
    public static Ingrediente CriarIngrediente(String generico, String especifico) {
        if (generico.equalsIgnoreCase("pão")) return PaoFactory.CriarPao(especifico);
        else if (generico.equalsIgnoreCase("presunto")) return PresuntoFactory.CriarPresunto(especifico);
        else if (generico.equalsIgnoreCase("queijo")) return QueijoFactory.CriarQueijo(especifico);
        else if (generico.equalsIgnoreCase("salada")) return SaladaFactory.CriarSalada(especifico);
        else return null;
    }
}
