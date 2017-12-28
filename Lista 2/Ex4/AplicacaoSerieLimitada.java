
import java.util.Scanner;

public class AplicacaoSerieLimitada {

	public static void main(String[] args) {
		String nome;
		Scanner input = new Scanner(System.in);

		do {

			System.out.println("instanciando objeto:" + (SerieLimitada.contador + 1));
			nome = input.nextLine();
			SerieLimitada.contador++;

		} while (SerieLimitada.contador != SerieLimitada.máximoDeInstâncias);

		System.out.println("Numero Limite de instâncias alcançado");

	}

}
