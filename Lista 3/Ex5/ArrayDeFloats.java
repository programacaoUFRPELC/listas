
import java.util.Scanner;

public class ArrayDeFloats {
	private float vet[];
	

	public ArrayDeFloats(float vet[]) {
		this.vet = vet;
	}

	public void Inserir() {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Informe o Numero a ser adicionado ao vetor:");
			vet[i] = input.nextFloat();

		}
	}

	public void Reverte() {

		int i = 0, f = vet.length - 1;
		while (i < f) {
			float aux = vet[i];
			vet[i] = vet[f];
			vet[f] = aux;
			i++;
			f--;
		}
		System.out.printf("\nDepois\n");
		for (float x : vet) {
			System.out.printf(x + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int opçao;
		float[] vetor = new float[6];
		System.out.println("ARRAY Inicializado com Sucesso!");

		ArrayDeFloats vetor1 = new ArrayDeFloats(vetor);

		do {
			System.out.println("\t\tArrayDeFloats!");
			System.out.println("1 - Inicializar Array");
			System.out.println("2 - Reverter Posições");
			System.out.println("3 - Sair");
			System.out.print("opção:");
			opçao = input.nextInt();
			switch (opçao) {

			case 1:

				vetor1.Inserir();
				break;

			case 2:

				vetor1.Reverte();
				break;
			}

		} while (opçao != 3);
	}

}
