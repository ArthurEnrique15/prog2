package Exercicio_08;

public class Main {
    public static void main(String[] args) {
        IMedidorCelsius medidorCelcius = new TemperaturaAdapter();
    
        System.out.println(medidorCelcius.medirTemperatura());
    }
}
