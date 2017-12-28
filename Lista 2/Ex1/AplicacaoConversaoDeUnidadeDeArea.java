

import java.util.Scanner;

public class AplicacaoConversaoDeUnidadeDeArea {

	public static void main(String[] args) {
		int opçao;
		double area = 0.0, novaUnidadeArea = 0.0;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("\t\tCONVERSOR DE UNIDADE DE AREA!");
			System.out.println("1 - metro quadrado -> pé quadrado");
			System.out.println("2 - pé quadrados ---> centímetro quadrado");
			System.out.println("3 - milha quadrada -> acre");
			System.out.println("4 - acre -----------> pé quadrado");
			System.out.print("opção:");
			opçao = input.nextInt();
			switch (opçao) {
			case 1:
				System.out.println("Informe o Valor da Area em Metros Quadrados!");
				area = input.nextDouble();
				novaUnidadeArea = ConversaoDeUnidadesDeArea.pesQuadrados(area);
				System.out.printf("%.3f Metros Corresponde a %.3f Pés Quadrados\n\n", area, novaUnidadeArea);
				break;

			case 2:
				System.out.println("Informe o Valor da Area em Pés Quadrados!");
				area = input.nextDouble();
				novaUnidadeArea = ConversaoDeUnidadesDeArea.centimetrosQuadrados(area);
				System.out.printf("%.3f Pés Quadrados Corresponde a %.3f Centimetros Quadrados\n\n", area,
						novaUnidadeArea);
				break;
			case 3:
				System.out.println("Informe o Valor da Area em Milhas Quadradas!");
				area = input.nextDouble();
				novaUnidadeArea = ConversaoDeUnidadesDeArea.acresQuadrados(area);
				System.out.printf("%.3f Milas Quaradas a %.3f Acres\n\n", area, novaUnidadeArea);
				break;
			case 4:
				System.out.println("Informe o Valor da Area em Acres Quadrados!");
				area = input.nextDouble();
				novaUnidadeArea = ConversaoDeUnidadesDeArea.pesQuadradosAcres(area);
				System.out.printf("%.3f Acres a %.3f Pés Quadrados\n\n", area, novaUnidadeArea);
				break;

			}

		} while (opçao != 5);

	}

}
