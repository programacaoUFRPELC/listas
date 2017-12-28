
import java.util.Scanner;

public class TesteOperacoes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int opcao;
		int Numero1, Numero2;
		OperacaoMatematica operação1, operação2, operação3, operação4;

		do {
			System.out.println("\t\n Escolha a opção desejada");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("5 - Sair\n");
			System.out.print("Opção: ");
			opcao = input.nextInt();

			switch (opcao) {
			case 1:

				System.out.println("Iforme o 1º Numero");
				Numero1 = input.nextInt();
				System.out.println("Iforme o 1º Numero");
				Numero2 = input.nextInt();
				operação1 = new Soma();
				System.out.println("O valor da Soma: " + operação1.Calcula(Numero1, Numero2));
				break;

			case 2:

				System.out.println("Iforme o 1º Numero");
				Numero1 = input.nextInt();
				System.out.println("Iforme o 1º Numero");
				Numero2 = input.nextInt();
				operação2 = new Subtracao();
				System.out.println("O valor da Multiplicação: " + operação2.Calcula(Numero1, Numero2));
				break;

			case 3:
				System.out.println("Iforme o 1º Numero");
				Numero1 = input.nextInt();
				System.out.println("Iforme o 1º Numero");
				Numero2 = input.nextInt();
				operação3 = new Multiplicacao();
				System.out.println("O valor da Multiplicação: " + operação3.Calcula(Numero1, Numero2));
				break;
			case 4:
				System.out.println("Iforme o 1º Numero");
				Numero1 = input.nextInt();
				System.out.println("Iforme o 1º Numero");
				Numero2 = input.nextInt();
				operação4 = new Divisao();
				System.out.println("O valor da Multiplicação: " + operação4.Calcula(Numero1, Numero2));
				break;

			default:
				System.out.println("Sistema encerrado.");
				System.out.println("Opção inválida");
			}

		} while (opcao != 5);

	}

}
