


public class ConversaoDeUnidadesDeTemperatura {

	public static double celsiusFahrenheit(double temperatura) {
		return (1.8 * temperatura) + 32;
	}

	public static double fahrenheitCelsius(double temperatura) {
		return (temperatura - 32) / 1.8;
	}

	public static double celsiusKelvin(double temperatura) {
		return temperatura + 273.15;
	}

	public static double kelvinCelsius(double temperatura) {
		return temperatura - 273.15;
	}

	public static double celsiusReaumur(double temperatura) {
		return temperatura * 0.8;
	}

	public static double reaumurCelsius(double temperatura) {
		return temperatura / 0.8;
	}

	public static double kelvinRankine(double temperatura) {
		return temperatura * 1.8;
	}

	public static double rankineKelvin(double temperatura) {
		return temperatura / 1.8;
	}
}
