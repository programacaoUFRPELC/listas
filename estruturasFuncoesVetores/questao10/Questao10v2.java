package estruturasFuncoesVetores.questao10;

import java.util.Scanner;

public class Questao10v2 {

	public static void main(String[] args) {
		String[] meses = { "Janeiro", "Fevereiro", "Mar�o", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
				"Outubro", "Novembro", "Dezembro" };

		int mes;
		Scanner console = new Scanner(System.in);
		
		System.out.println("Digite o n�mero correspondente ao m�s desejado: ");
		mes = console.nextInt();
		System.out.println(meses[mes-1]);
		console.close();
	}

}
