
import java.util.Scanner;

public class AplicacaoFuncionario {

	public static void main(String[] args) {

		Funcionario gerente, programador;
		gerente = new Gerente("Carlos", 8000);
		programador = new Programador("Neriton", 6000);
		Scanner input = new Scanner(System.in);

		int op��o;

		do {
			System.out.println("\t\n Escolha a op��o desejada");
			System.out.println("1 - Informa��es Gerente");
			System.out.println("2 - Informa��es Programador");
			System.out.println("3 - Sair\n");
			System.out.print("Op��o: ");
			op��o = input.nextInt();
			input.nextLine();

			switch (op��o) {
			case 1:
				System.out.println("Func��o: Programador");
				System.out.println("Nome: " + gerente.getNome());
				System.out.println("Salario: " + gerente.getSalario());

				System.out.println("Deseja aumentar o Salario desse Funcionario?");
				System.out.println("1 - SIM");
				System.out.println("2 - N�O");
				System.out.print("Op��o: ");
				int opcao = input.nextInt();
				if (opcao == 1) {
					gerente.AumentaSalario();
					System.out.println("Novo Salario: " + gerente.getSalario());
				} else if (opcao == 2) {
					break;
				} else if (opcao != 1 || opcao != 2) {
					System.out.println("Op��o Invalida!");
				}
				break;

			case 2:
				System.out.println("Func��o: Programador");
				System.out.println("Nome: " + programador.getNome());
				System.out.println("salario: " + programador.getSalario());

				System.out.println("Deseja aumentar o Salario desse Funcionario?");
				System.out.println("1 - SIM");
				System.out.println("2 - N�O");
				System.out.print("Op��o: ");
				int opcao1 = input.nextInt();
				if (opcao1 == 1) {
					programador.AumentaSalario();
					System.out.println(programador.getSalario());
				} else if (opcao1 == 2) {
					break;
				} else if (opcao1 != 1 || opcao1 != 2) {
					System.out.println("Op��o Invalida!");
				}
				break;

			case 3:
				System.out.println("Saindo!");
				break;

			default:
				System.out.println("Op��o inv�lida");
			}

		} while (op��o != 3);
	}

}
