
import java.util.Scanner;

public class AplicacaoFuncionario {

	public static void main(String[] args) {

		Funcionario gerente, programador;
		gerente = new Gerente("Carlos", 8000);
		programador = new Programador("Neriton", 6000);
		Scanner input = new Scanner(System.in);

		int opção;

		do {
			System.out.println("\t\n Escolha a opção desejada");
			System.out.println("1 - Informações Gerente");
			System.out.println("2 - Informações Programador");
			System.out.println("3 - Sair\n");
			System.out.print("Opção: ");
			opção = input.nextInt();
			input.nextLine();

			switch (opção) {
			case 1:
				System.out.println("Funcção: Programador");
				System.out.println("Nome: " + gerente.getNome());
				System.out.println("Salario: " + gerente.getSalario());

				System.out.println("Deseja aumentar o Salario desse Funcionario?");
				System.out.println("1 - SIM");
				System.out.println("2 - NÃO");
				System.out.print("Opção: ");
				int opcao = input.nextInt();
				if (opcao == 1) {
					gerente.AumentaSalario();
					System.out.println("Novo Salario: " + gerente.getSalario());
				} else if (opcao == 2) {
					break;
				} else if (opcao != 1 || opcao != 2) {
					System.out.println("Opção Invalida!");
				}
				break;

			case 2:
				System.out.println("Funcção: Programador");
				System.out.println("Nome: " + programador.getNome());
				System.out.println("salario: " + programador.getSalario());

				System.out.println("Deseja aumentar o Salario desse Funcionario?");
				System.out.println("1 - SIM");
				System.out.println("2 - NÃO");
				System.out.print("Opção: ");
				int opcao1 = input.nextInt();
				if (opcao1 == 1) {
					programador.AumentaSalario();
					System.out.println(programador.getSalario());
				} else if (opcao1 == 2) {
					break;
				} else if (opcao1 != 1 || opcao1 != 2) {
					System.out.println("Opção Invalida!");
				}
				break;

			case 3:
				System.out.println("Saindo!");
				break;

			default:
				System.out.println("Opção inválida");
			}

		} while (opção != 3);
	}

}
