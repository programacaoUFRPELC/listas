package classeHerancaPolimorfismo.questao1;

import java.util.Scanner;

public class Questao1Teste {

	public static void main(String[] args) {

		Termo t, t2;
		Polinomio p;
		int i;
		double ai;
		
		Scanner console = new Scanner(System.in);
		
		
		System.out.println("Digite o ai: ");
		ai = console.nextDouble();
		System.out.println("Digite o i: ");
		i = console.nextInt();
		t = new Termo(ai, i);

		System.out.println("Digite o ai: ");
		ai = console.nextDouble();
		System.out.println("Digite o i: ");
		i = console.nextInt();
		t2 = new Termo(ai, i);
		
		p = new Polinomio(t);
		p.insere(t2);
		
		System.out.println("Digite o x para calcular: ");
		int x = console.nextInt();
		System.out.println("O valor do polinomio é: " + p.calcula(x));
	}

}
