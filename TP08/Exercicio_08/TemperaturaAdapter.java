package Exercicio_08;

public class TemperaturaAdapter implements IMedidorCelsius {
    private MedidorFahrenheit medidorFahrenheit;

	public TemperaturaAdapter() {
		this.medidorFahrenheit = new MedidorFahrenheit();
	}

    @Override
    public double medirTemperatura() {
        return (medidorFahrenheit.getTemperaturaFahrenheit() - 32) / 1.8;
    }
}
