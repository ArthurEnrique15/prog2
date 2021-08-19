package Exercicio_05.factories;

import Exercicio_05.popular.IPopularCar;
import Exercicio_05.sedan.ISedanCar;

public abstract class AbstractFactory {
    public abstract IPopularCar createPopularCar();
    public abstract ISedanCar createSedanCar();
}
