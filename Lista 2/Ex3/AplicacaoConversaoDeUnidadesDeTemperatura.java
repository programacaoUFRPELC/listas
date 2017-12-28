
import java.util.Scanner;

public class AplicacaoConversaoDeUnidadesDeTemperatura {

	public static void main(String[] args) {
		int opçao;
		double temperatura = 0.0, novaUnidadeTemperatura = 0.0;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("\t\tCONVERSOR DE UNIDADE DE TEMPERATURA!");
			System.out.println("1 - Celsius ------> Fahrenheit");
			System.out.println("2 - Fahrenheit ---> Celsius");
			System.out.println("3 - Celsius ------> Kelvin");
			System.out.println("4 - Kelvin -------> Celsius");
			System.out.println("5 - Celsius ------> Reaumur");
			System.out.println("6 - Reaumur ------> Celsius");
			System.out.println("7 - Kelvin -------> Rankine");
			System.out.println("8 - Rankine ------> Kelvin ");
			System.out.print("opção:");
			opçao = input.nextInt();
			switch (opçao) {
			case 1:
				System.out.println("Informe o Valor da temperatura em Celsius!");
				temperatura = input.nextDouble();
				novaUnidadeTemperatura = ConversaoDeUnidadesDeTemperatura.celsiusFahrenheit(temperatura);
				System.out.printf("%.2f Celsius Corresponde a %.2f Fahrenheit\n\n", temperatura,
						novaUnidadeTemperatura);
				break;

			case 2:
				System.out.println("Informe o Valor da temperatura em Fahrenheit!");
				temperatura = input.nextDouble();
				novaUnidadeTemperatura = ConversaoDeUnidadesDeTemperatura.fahrenheitCelsius(temperatura);
				System.out.printf("%.2f Fahrenheit Corresponde a %.2f Celsius\n\n", temperatura,
						novaUnidadeTemperatura);
				break;
			case 3:
				System.out.println("Informe o Valor da temperatura em Celsius!");
				temperatura = input.nextDouble();
				novaUnidadeTemperatura = ConversaoDeUnidadesDeTemperatura.celsiusKelvin(temperatura);
				System.out.printf("%.2f Celsius Corresponde a %.2f Kelvin\n\n", temperatura, novaUnidadeTemperatura);
				break;
			case 4:
				System.out.println("Informe o Valor da temperatura em Kelvin!");
				temperatura = input.nextDouble();
				novaUnidadeTemperatura = ConversaoDeUnidadesDeTemperatura.kelvinCelsius(temperatura);
				System.out.printf("%.2f Kelvin Corresponde a %.2f Celsius\n\n", temperatura, novaUnidadeTemperatura);
				break;
			case 5:
				System.out.println("Informe o Valor da temperatura em Celsius!");
				temperatura = input.nextDouble();
				novaUnidadeTemperatura = ConversaoDeUnidadesDeTemperatura.celsiusReaumur(temperatura);
				System.out.printf("%.2f Celsius Corresponde a %.2f Reaumur\n\n", temperatura, novaUnidadeTemperatura);
				break;
			case 6:
				System.out.println("Informe o Valor da temperatura em Reaumur !");
				temperatura = input.nextDouble();
				novaUnidadeTemperatura = ConversaoDeUnidadesDeTemperatura.reaumurCelsius(temperatura);
				System.out.printf("%.2f Reaumur Corresponde a %.2f Celsius\n\n", temperatura, novaUnidadeTemperatura);
				break;
			case 7:
				System.out.println("Informe o Valor da temperatura em Kelvin !");
				temperatura = input.nextDouble();
				novaUnidadeTemperatura = ConversaoDeUnidadesDeTemperatura.kelvinRankine(temperatura);
				System.out.printf("%.2f kelvin Corresponde a %.2f Rankine\n\n", temperatura, novaUnidadeTemperatura);
				break;

			case 8:
				System.out.println("Informe o Valor da temperatura em Rankine !");
				temperatura = input.nextDouble();
				novaUnidadeTemperatura = ConversaoDeUnidadesDeTemperatura.rankineKelvin(temperatura);
				System.out.printf("%.2f Rankine Corresponde a %.2f Kelvin\n\n", temperatura, novaUnidadeTemperatura);
				break;
			}

		} while (opçao != 9);

	}

}
