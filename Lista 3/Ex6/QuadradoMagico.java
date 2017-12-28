
import java.util.Scanner;

public class QuadradoMagico {
	private int[][] matriz;

	public QuadradoMagico(int[][] m) {
		this.matriz = m;
	}

	public static boolean eQuadradoMagico(int[][] matriz) {

		boolean r = true;

		int i, j;
		int primeiraLinha = 0;
		int primeiraColuna = 0;

		for (i = 0; i < 3; i++) {
			int totalLinha = 0;
			int totalColuna = 0;
			for (j = 0; j < 3; j++) {
				if (i == 0) {
					primeiraLinha += matriz[i][j];
					primeiraColuna += matriz[j][i];
				}
				totalLinha += matriz[i][j];
				totalColuna += matriz[j][i];
			}
			if (totalLinha != primeiraLinha || totalLinha != totalColuna || totalColuna != primeiraColuna
					|| primeiraColuna != primeiraLinha) {
				r = false;
			}
		}

		return r;
	}

	/*
		matriz[0][0] = 2;
		matriz[0][1] = 7;
		matriz[0][2] = 6;
		matriz[1][0] = 9;
		matriz[1][1] = 5;
		matriz[1][2] = 1;
		matriz[2][0] = 4;
		matriz[2][1] = 3;
		matriz[2][2] = 8;

		boolean ehQuadradoMagico = true;
		int primeiraLinha = 0;
		int primeiraColuna = 0;

		for (i = 0; i < 3; i++) {
			int totalLinha = 0;
			int totalColuna = 0;
			for (j = 0; j < 3; j++) {
				if (i == 0) {
					primeiraLinha += matriz[i][j];
					primeiraColuna += matriz[j][i];
				}
				totalLinha += matriz[i][j];
				totalColuna += matriz[j][i];
			}
			if (totalLinha != primeiraLinha || totalLinha != totalColuna || totalColuna != primeiraColuna
					|| primeiraColuna != primeiraLinha) {
				ehQuadradoMagico = false;
			}
		}
		if (ehQuadradoMagico) {
			System.out.println("É um quadrado mágico");
		} else {
			System.out.println("Não é um quadrado mágico");
		}
	}
*/
}
