package Exercicio_05;

import Exercicio_05.factories.AbstractFactory;
import Exercicio_05.factories.CarFactory;
import Exercicio_05.popular.*;
import Exercicio_05.sedan.*;

public class Main {
    public static void main(String[] args) {
        AbstractFactory fiatFactory = CarFactory.GetFactory("fiat");
        AbstractFactory fordFactory = CarFactory.GetFactory("ford");

        System.out.println("Fabricando os carros da Fiat");

        IPopularCar popularCar1 = fiatFactory.createPopularCar();
        popularCar1.printPopularInfo();

        ISedanCar sedanCar1 = fiatFactory.createSedanCar();
        sedanCar1.printSedanInfo();

        System.out.println("\nFabricando os carros da Ford");

        IPopularCar popularCar2 = fordFactory.createPopularCar();
        popularCar2.printPopularInfo();

        ISedanCar sedanCar2 = fordFactory.createSedanCar();
        sedanCar2.printSedanInfo();
    }
}
