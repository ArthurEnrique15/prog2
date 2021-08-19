package Exercicio_05.factories;

public class CarFactory {
    public static AbstractFactory GetFactory (String brand) {
        if (brand.equalsIgnoreCase("fiat"))
            return new FiatFactory();
        else if (brand.equalsIgnoreCase("ford"))
            return new FordFactory();
        else
            return null;
    }
}
