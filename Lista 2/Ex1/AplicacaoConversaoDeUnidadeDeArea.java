

import java.util.Scanner;

public class AplicacaoConversaoDeUnidadeDeArea {

	public static void main(String[] args) {
		int op�ao;
		double area = 0.0, novaUnidadeArea = 0.0;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("\t\tCONVERSOR DE UNIDADE DE AREA!");
			System.out.println("1 - metro quadrado -> p� quadrado");
			System.out.println("2 - p� quadrados ---> cent�metro quadrado");
			System.out.println("3 - milha quadrada -> acre");
			System.out.println("4 - acre -----------> p� quadrado");
			System.out.print("op��o:");
			op�ao = input.nextInt();
			switch (op�ao) {
			case 1:
				System.out.println("Informe o Valor da Area em Metros Quadrados!");
				area = input.nextDouble();
				novaUnidadeArea = ConversaoDeUnidadesDeArea.pesQuadrados(area);
				System.out.printf("%.3f Metros Corresponde a %.3f P�s Quadrados\n\n", area, novaUnidadeArea);
				break;

			case 2:
				System.out.println("Informe o Valor da Area em P�s Quadrados!");
				area = input.nextDouble();
				novaUnidadeArea = ConversaoDeUnidadesDeArea.centimetrosQuadrados(area);
				System.out.printf("%.3f P�s Quadrados Corresponde a %.3f Centimetros Quadrados\n\n", area,
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
				System.out.printf("%.3f Acres a %.3f P�s Quadrados\n\n", area, novaUnidadeArea);
				break;

			}

		} while (op�ao != 5);

	}

}
