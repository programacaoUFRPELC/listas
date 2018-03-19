package estruturasFuncoesVetores.questao4;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		
		int num;
		boolean flag = false;
		Scanner console = new Scanner(System.in);
		System.out.println("Digite um inteiro");
		num = console.nextInt();
		//int i = 1;
		
	
		for (int i = 1; Fib(i) <= num; i++) {
		
			if (Fib(i) == num) {
				flag = true;
			}
		
		}
		if (flag) {
			System.out.println("O numero " + num + " faz parte da sequência Fibonacci.");
		}
		else {
			System.out.println("O numero "+ num + " não faz parte da sequência Fibonacci.");
		}
		console.close();
	}

	public static int Fib(int num) {
		
		if (num == 1 || num == 2) {
			return 1;
		}
		else {
			return (Fib(num - 1) + Fib (num -2));
		}
		
		
		
	}
}
