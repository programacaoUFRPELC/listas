
import java.util.Scanner;

public class QuadradoMagicoTeste {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);
		int i, j;
		int matriz[][] = new int[3][3];

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.println("Qual o valor de " + (i + 1) + "X" + (j + 1) + "?");
				matriz[i][j] = e.nextInt();
			}
		}

		System.out.println("A matriz: ");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
		if (QuadradoMagico.eQuadradoMagico(matriz) == true) {
			System.out.println(" É um Quadrado Mágico.");
		} else {
			System.out.println(" Não é um Quadrado Mágico.");
		}
	}
}