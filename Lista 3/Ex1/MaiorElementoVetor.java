

import java.util.Scanner;

public class MaiorElementoVetor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, maior = 0, menor = 1000;
		double soma = 0, media = 0;

		int vet[] = new int[5];

		for (i = 0; i < vet.length; i++) {
			System.out.printf("Informe %dº numero: \n", i + 1);
			vet[i] = input.nextInt();
			soma = soma + vet[i];

			if (vet[i] > maior) {
				if (vet[i] % 2 == 0) {
					maior = vet[i];
				}
			}

			if (vet[i] < menor) {
				if (vet[i] % 2 == 1) {
					menor = vet[i];
				}
			}
		}

		media = soma / vet.length;

		System.out.println("Menor valor impar do vetor = " + menor);
		System.out.println("Maior valor par   do vetor= " + maior);
		System.out.println("Media valor = " + media);

	}

}
