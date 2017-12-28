

import java.util.Scanner;

public class AplicacaoConversaoDeUnidadesDeVolume {

	public static void main(String[] args) {
		int op�ao;
		double volume = 0.0, novaUnidadeVolume = 0.0;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("\t\tCONVERSOR DE UNIDADE DE VOLUME!");
			System.out.println("1 - Litros -----------> Cent�metro Cubicos");
			System.out.println("2 - Metros Cubicos ---> Litros");
			System.out.println("3 - Metros Cubicos ---> P�s Cubicos");
			System.out.println("4 - Gal�o Americano --> Polegadas Cubicas");
			System.out.println("5 - Gal�o Americano --> Litros");
			System.out.print("op��o:");
			op�ao = input.nextInt();
			switch (op�ao) {
			case 1:
				System.out.println("Informe o Valor do Volume em Litros!");
				volume = input.nextDouble();
				novaUnidadeVolume = ConversaoDeUnidadesDeVolume.centimetrosCubicos(volume);
				System.out.printf("%.2f Litros Corresponde a %.2f Cent�metros Cubicos\n\n", volume, novaUnidadeVolume);
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
				System.out.printf("%.2f Metros Cubicos Corresponde a %.2f P�s Cubicos\n\n", volume, novaUnidadeVolume);
				break;
			case 4:
				System.out.println("Informe o Valor do Volume em Gal�es Americanos!");
				volume = input.nextDouble();
				novaUnidadeVolume = ConversaoDeUnidadesDeVolume.polegadasCubicas(volume);
				System.out.printf("%.2f Gal�es Americanos Corresponde a %.2f Polegadas Cubicas\n\n", volume,
						novaUnidadeVolume);
				break;
			case 5:
				System.out.println("Informe o Valor do Volume em Gal�es Americanos!");
				volume = input.nextDouble();
				novaUnidadeVolume = ConversaoDeUnidadesDeVolume.galoesLitros(volume);
				System.out.printf("%.2f Gal�es Americanos Corresponde a %.2f Litros\n\n", volume, novaUnidadeVolume);
				break;

			}

		} while (op�ao != 6);

	}

}
