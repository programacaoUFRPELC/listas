
import java.util.Scanner;

public class MatrizSoma {

	public static void main(String[] args) {
		int i, j;
		int matriz1[][] = new int[2][2];
		int matriz2[][] = new int[2][2];
		int matrizSoma[][] = new int[2][2];

		Scanner input = new Scanner(System.in);
		for (i = 0; i < matriz1.length; i++) {
			for (j = 0; j < matriz1.length; j++) {
				System.out.printf("Insira o elemento M1[%d][%d]: ", i + 1, j + 1);
				matriz1[i][j] = input.nextInt();
			}
		}

		System.out.println("\nA Matriz1: \n");
		for (i = 0; i < matriz1.length; i++) {
			for (j = 0; j < matriz1.length; j++) {
				System.out.printf("\t %d \t", matriz1[i][j]);
			}
			System.out.println();
		}

		for (i = 0; i < matriz2.length; i++) {
			for (j = 0; j < matriz2.length; j++) {
				System.out.printf("Insira o elemento M2[%d][%d]: ", i + 1, j + 1);
				matriz2[i][j] = input.nextInt();
			}
		}
		System.out.println("\nA Matriz 2: \n");
		for (i = 0; i < matriz2.length; i++) {
			for (j = 0; j < matriz2.length; j++) {
				System.out.printf("\t %d \t", matriz2[i][j]);
			}
			System.out.println();
		}

		for (i = 0; i < matrizSoma.length; i++) {
			for (j = 0; j < matrizSoma.length; j++) {
				matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		System.out.println("\nA Matriz Soma: \n");
		for (i = 0; i < matrizSoma.length; i++) {
			for (j = 0; j < matrizSoma.length; j++) {
				System.out.printf("\t %d \t", matrizSoma[i][j]);
			}
			System.out.println();
		}

	}

}
