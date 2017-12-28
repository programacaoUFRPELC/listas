

import java.util.Scanner;

public class AplicacaoConversaoDeUnidadesDeVolume {

	public static void main(String[] args) {
		int opçao;
		double volume = 0.0, novaUnidadeVolume = 0.0;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("\t\tCONVERSOR DE UNIDADE DE VOLUME!");
			System.out.println("1 - Litros -----------> Centímetro Cubicos");
			System.out.println("2 - Metros Cubicos ---> Litros");
			System.out.println("3 - Metros Cubicos ---> Pés Cubicos");
			System.out.println("4 - Galão Americano --> Polegadas Cubicas");
			System.out.println("5 - Galão Americano --> Litros");
			System.out.print("opção:");
			opçao = input.nextInt();
			switch (opçao) {
			case 1:
				System.out.println("Informe o Valor do Volume em Litros!");
				volume = input.nextDouble();
				novaUnidadeVolume = ConversaoDeUnidadesDeVolume.centimetrosCubicos(volume);
				System.out.printf("%.2f Litros Corresponde a %.2f Centímetros Cubicos\n\n", volume, novaUnidadeVolume);
				break;

			case 2:
				System.out.println("Informe o Valor do Volume em Metros Cubicos!");
				volume = input.nextDouble();
				novaUnidadeVolume = ConversaoDeUnidadesDeVolume.litros(volume);
				System.out.printf("%.2f Metros Cubicos Corresponde a %.2f Litros\n\n", volume, novaUnidadeVolume);
				break;
			case 3:
				System.out.println("Informe o Valor do Volume em Metros Cubicos!");
				volume = input.nextDouble();
				novaUnidadeVolume = ConversaoDeUnidadesDeVolume.pesCubicos(volume);
				System.out.printf("%.2f Metros Cubicos Corresponde a %.2f Pés Cubicos\n\n", volume, novaUnidadeVolume);
				break;
			case 4:
				System.out.println("Informe o Valor do Volume em Galões Americanos!");
				volume = input.nextDouble();
				novaUnidadeVolume = ConversaoDeUnidadesDeVolume.polegadasCubicas(volume);
				System.out.printf("%.2f Galões Americanos Corresponde a %.2f Polegadas Cubicas\n\n", volume,
						novaUnidadeVolume);
				break;
			case 5:
				System.out.println("Informe o Valor do Volume em Galões Americanos!");
				volume = input.nextDouble();
				novaUnidadeVolume = ConversaoDeUnidadesDeVolume.galoesLitros(volume);
				System.out.printf("%.2f Galões Americanos Corresponde a %.2f Litros\n\n", volume, novaUnidadeVolume);
				break;

			}

		} while (opçao != 6);

	}

}
