
import java.util.Scanner;

public class ArrayContas {
	private int[] vet;
	

	public ArrayContas(int[] vetor) {
		this.vet = vetor;

	}

	public void Inserir() {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Informe o Numero da Conta:");
			vet[i] = input.nextInt();

		}
	}

	public void Buscar(int conta) {

		for (int i = 0; i < vet.length; i++) {
			if (vet[i] == conta) {
				System.out.printf("Conta: %d encontrada\n", vet[i]);
				break;
			} else
				System.out.println("Conta Inexistente");
		}
	}

	public void Remover(int conta) {
		for (int i = 0; i < vet.length; i++) {

			if (vet[i] == conta) {
				vet[i] = 0;
				System.out.println("Conta Removida\n");
				break;
			} else
				System.out.println("Conta Inexistente");
		}
	}

	public void AtualizarContas(int conta) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] == conta) {
				vet[i] = input.nextInt();
				System.out.println("Conta Atualizada");
				break;
			} else
				System.out.println("Conta Inexistente");
		}
	}
}
