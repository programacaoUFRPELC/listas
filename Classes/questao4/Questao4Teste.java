package classes.questao4;

import java.util.Scanner;

public class Questao4Teste {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		int n;
		
		char[] g = {'A', 'C', 'D', 'B', 'E', 'A', 'C', 'D', 'D', 'B', 'A', 'D', 'E', 'B', 'B'};
		Prova p = new Prova(g);
		Prova p2 = new Prova(g);
		Prova p3 = new Prova(g);
		
		for (int i = 0; i < 15; i++) {
			p2.respostaAluno('A');
		}
		
		for (int j = 0; j < 15; j++) {
			p3.respostaAluno(g[j]);
		}

		do {
			
		
		System.out.println("Digite sua opção: ");
		
		System.out.println("1 - Inserir respostas de aluno: ");
		System.out.println("2 - Calcular nota de aluno: ");
		System.out.println("3 - Comparar notas de alunos: ");
		System.out.println("0 - Sair do programa.");
		n = console.nextInt();
		
		switch(n) {
		
		case 1: 
			char c;
			if(p.getIndex() < 15) {
			System.out.println("Digite a resposta do aluno para pergunta " + (p.getIndex() + 1));
			c = console.next().charAt(0);
			p.respostaAluno(c);
			}
			else {
				System.out.println("Todas as respostas já cadastradas!");
			}
			break;
			
		case 2: 
			System.out.println("O aluno tirou " + p.nota());
			break;
			
		case 3: 
			System.out.println("Nota do aluno 1: " + p.nota());
			System.out.println("Nota do aluno 2: " + p2.nota());
			System.out.println("Nota do aluno 3: " + p3.nota());
			System.out.println("Entre Aluno 1 e Aluno 2, a nota maior é " + p.maior(p2));
			System.out.println("Entre Aluno 1 e Aluno 3, a nota maior é " + p.maior(p3));
			System.out.println("Entre Aluno 2 e Aluno 3, a nota maior é " + p2.maior(p3));
			break;
			
		default: 
			break;
		}


	} while (n != 0);
	
	}
}
