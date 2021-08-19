package Exercicio_05.factories;

import Exercicio_05.popular.*;
import Exercicio_05.sedan.*;

public class FiatFactory extends AbstractFactory {

    @Override
    public IPopularCar createPopularCar() {
        return new Palio();
    }

    @Override
    public ISedanCar createSedanCar() {
        return new Siena();
    }
}
