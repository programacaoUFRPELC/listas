package estruturasFuncoesVetores.questao1;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		int n1, n2;
		
		Scanner console = new Scanner (System.in);
		System.out.println("\nDigite o primeiro numero: ");
		n1 = console.nextInt();
		System.out.println("\nDigite o segundo numero: ");
		n2 = console.nextInt();
		
		for (int i = n1; i <= n2; i++) {
			if(i % 2 != 0) {
				System.out.println( "\t"+ i);
			}
			
		}
		console.close();
	}

}
