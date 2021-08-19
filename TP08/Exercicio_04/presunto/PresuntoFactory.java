package Exercicio_04.presunto;

public class PresuntoFactory {
    public static Presunto criarPresunto(String tipo) {
        if (tipo.equalsIgnoreCase("frango")) return new PresuntoDeFrango();
        else if (tipo.equalsIgnoreCase("peru")) return new PresuntoDePeru();
        else return null;
    }
}
