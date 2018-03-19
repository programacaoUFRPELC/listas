package estruturasFuncoesVetores.questao2;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		String nome = ""; 
		double atual, novo, totalAtual, totalNovo;
		atual = novo = totalNovo = totalAtual = 0;
		Scanner console = new Scanner(System.in);
		
		System.out.println("\n---------------------------");
		System.out.println("Para terminar digite FIM");
		System.out.println("Digite o nome do funcionário:");
		nome = console.next();
		
		while (nome.equals("FIM") == false) {
			
			System.out.println("Digite o salário atual: ");
			atual = console.nextDouble();
			totalAtual = totalAtual + atual;
			novo = calculaSalario(atual);
			totalNovo = totalNovo + novo;
			System.out.println("\n Nome: " + nome);
			System.out.println("Salário original:" + atual);
			System.out.println("Salário novo: " + novo);
			System.out.println("\n---------------------------");
			System.out.println("Para terminar digite FIM");
			System.out.println("Digite o nome do funcionário:");
			nome = console.next();
		}
		System.out.println("\n---------------------------");
		System.out.println("Soma dos salários atuais: " + totalAtual);
		System.out.println("Soma dos salários reajustados:" + totalNovo);
		System.out.println("Diferença entre eles: " + (totalNovo - totalAtual));
		console.close();
	}

	public static Double calculaSalario(double atual) {
		
		double novo = 0;
		
		if (atual <= 150) {
			novo = atual + (atual * 0.25);
			}
		else if (atual > 150 && atual <=300) {
			novo = atual + (atual + 0.2);
		}
		else if (atual > 300 && atual <= 600) {
			novo = atual + (atual * 0.15);
		}
		else if (atual > 600) {
			novo = atual + (atual * 0.1);
		}
		 return novo;
	}
}
