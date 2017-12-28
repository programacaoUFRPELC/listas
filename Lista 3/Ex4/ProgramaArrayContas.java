
import java.util.Scanner;

public class ProgramaArrayContas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int opçao;
		int conta;

		int[] vetor = new int[3];
		ArrayContas vetor1 = new ArrayContas(vetor);

		do {
			System.out.println("\t\t ARRAY DE CONTAS!");
			System.out.println("1 - Inserir no Array");
			System.out.println("2 - Buscar no Array");
			System.out.println("3 - Remover do Array");
			System.out.println("4 - Aturalizar conta Array");
			System.out.println("5 - Sair");
			System.out.print("opção:");
			opçao = input.nextInt();
			switch (opçao) {

			case 1:
				vetor1.Inserir();
				break;
			case 2:

				System.out.println("Informe o Numero da Conta:");
				conta = input.nextInt();
				vetor1.Buscar(conta);
				break;
			case 3:
				System.out.println("Informe o Numero da Conta a ser Removida:");
				conta = input.nextInt();
				vetor1.Remover(conta);
				break;
			case 4:

				System.out.println("Informe o Numero da Conta a ser Atualizada:");
				conta = input.nextInt();
				vetor1.AtualizarContas(conta);
				break;
			}

		} while (opçao != 5);

	}

}
