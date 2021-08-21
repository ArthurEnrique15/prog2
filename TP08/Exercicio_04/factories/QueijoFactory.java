package Exercicio_04.factories;

import Exercicio_04.ingredientes_especificos.QueijoCheddar;
import Exercicio_04.ingredientes_especificos.QueijoMussarela;
import Exercicio_04.ingredientes_especificos.QueijoPrato;
import Exercicio_04.ingredientes_genericos.Queijo;

public class QueijoFactory {
    public static Queijo CriarQueijo(String tipo) {
        if (tipo.equalsIgnoreCase("cheddar")) return new QueijoCheddar();
        else if (tipo.equalsIgnoreCase("mussarela")) return new QueijoMussarela();
        else if (tipo.equalsIgnoreCase("prato")) return new QueijoPrato();
        else return null;
    }
}
