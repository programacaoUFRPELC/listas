
import java.util.Scanner;

public class ProgramaMeuArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int op�ao;

		int vet[] = { 1, 2, 3, 4, 5 };
		System.out.println("ARRAY Inicializado com Sucesso!");

		MeuArray vetor = new MeuArray(vet);

		do {
			System.out.println("\t\tPROGRAMA MEU ARRAY!");
			System.out.println("1 - Soma dos Elementos do Array");
			System.out.println("2 - Maior Elemnto do Array");
			System.out.println("3 - Frequencia do Elemento no Array");
			System.out.println("4 - Inverter Elemento no Array");
			System.out.println("5 - Sair");
			System.out.print("op��o:");
			op�ao = input.nextInt();
			switch (op�ao) {

			case 1:

				System.out.println("A Soma dos valores do Array �:" + vetor.getSum() + "\n");
				break;
			case 2:
				System.out.println("O Maior valor do Array �: " + vetor.getMax() + "\n");
				break;
			case 3:
				int valor;
				System.out.println("Informe o Valor buscado no Array");
				valor = input.nextInt();
				System.out.println("A Frequencia do valor no Array �: " + vetor.getGreater(valor) + "\n");
				break;
			case 4:

				vetor.changePosition();
				break;
			}

		} while (op�ao != 5);
	}

}
