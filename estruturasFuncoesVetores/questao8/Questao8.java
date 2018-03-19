package estruturasFuncoesVetores.questao8;

import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
		
		int n;
		Scanner console = new Scanner(System.in);
		
		System.out.println("Digite um inteiro maior que 0: ");
		n = console.nextInt();
		
		if(isPrimo(n)) {
			System.out.println("O n�mero " + n + " � primo.");
		}
		else {
			System.out.println("O n�mero " + n + " n�o � primo.");
		}
	
		System.out.println("Os n�meros primos at� " + n + " s�o: ");
		for (int i = 1; i <= n; i++) {
			if(isPrimo(i)) {
				System.out.println(i);
			}
			
		}
		console.close();
	}

	public static boolean isPrimo(int n) {
		boolean flag = true;
		
		if(n == 1 || n == 2) {
			return flag;
		}
		else {
			
		
		for (int i = 2; i < n; i++) {
			
			if (n % i == 0) {
				flag = false;
			}
		}
		}
		return flag;
	}
}
