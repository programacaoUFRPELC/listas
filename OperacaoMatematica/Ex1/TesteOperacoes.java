
import java.util.Scanner;

public class TesteOperacoes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int opcao;
		int Numero1, Numero2;
		OperacaoMatematica opera��o1, opera��o2, opera��o3, opera��o4;

		do {
			System.out.println("\t\n Escolha a op��o desejada");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtra��o");
			System.out.println("3 - Multiplica��o");
			System.out.println("4 - Divis�o");
			System.out.println("5 - Sair\n");
			System.out.print("Op��o: ");
			opcao = input.nextInt();

			switch (opcao) {
			case 1:

				System.out.println("Iforme o 1� Numero");
				Numero1 = input.nextInt();
				System.out.println("Iforme o 1� Numero");
				Numero2 = input.nextInt();
				opera��o1 = new Soma();
				System.out.println("O valor da Soma: " + opera��o1.Calcula(Numero1, Numero2));
				break;

			case 2:

				System.out.println("Iforme o 1� Numero");
				Numero1 = input.nextInt();
				System.out.println("Iforme o 1� Numero");
				Numero2 = input.nextInt();
				opera��o2 = new Subtracao();
				System.out.println("O valor da Multiplica��o: " + opera��o2.Calcula(Numero1, Numero2));
				break;

			case 3:
				System.out.println("Iforme o 1� Numero");
				Numero1 = input.nextInt();
				System.out.println("Iforme o 1� Numero");
				Numero2 = input.nextInt();
				opera��o3 = new Multiplicacao();
				System.out.println("O valor da Multiplica��o: " + opera��o3.Calcula(Numero1, Numero2));
				break;
			case 4:
				System.out.println("Iforme o 1� Numero");
				Numero1 = input.nextInt();
				System.out.println("Iforme o 1� Numero");
				Numero2 = input.nextInt();
				opera��o4 = new Divisao();
				System.out.println("O valor da Multiplica��o: " + opera��o4.Calcula(Numero1, Numero2));
				break;

			default:
				System.out.println("Sistema encerrado.");
				System.out.println("Op��o inv�lida");
			}

		} while (opcao != 5);

	}

}
