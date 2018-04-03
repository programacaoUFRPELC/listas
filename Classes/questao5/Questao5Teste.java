package classes.questao5;

import java.util.Scanner;

public class Questao5Teste {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		int n;
		
		Vetor v1 = new Vetor(4);
		
		v1.insert("Viviane");
		v1.insert("Maria");
		v1.insert("Paulo");
		v1.insert("Recife");
		v1.insert("Pernambuco");
		v1.insert("Brasil");
		v1.insert("America do Sul");
		System.out.println("O vetor agora tem tamanho: " + v1.size());
		System.out.println("Digite um indice (int) para procurar no vetor:");
		n = console.nextInt();
		System.out.println("O elemento no local "+ n + " é: " + v1.get(n));
		System.out.println("O número de elementos inseridos é: " + v1.size());
		console.close();
	}

}
