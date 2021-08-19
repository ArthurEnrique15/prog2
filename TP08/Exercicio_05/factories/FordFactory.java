package Exercicio_05.factories;

import Exercicio_05.popular.*;
import Exercicio_05.sedan.*;

public class FordFactory extends AbstractFactory {

    @Override
    public IPopularCar createPopularCar() {
        return new Fiesta();
    }

    @Override
    public ISedanCar createSedanCar() {
        return new FiestaSedan();
    }
}
