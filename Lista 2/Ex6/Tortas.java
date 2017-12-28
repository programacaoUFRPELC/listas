
import java.util.Scanner;

public class Tortas {
	public enum Tipos {
		CHOCOLATE("Chocolate", 500, 3.0), MORANGO("Morango", 350, 1.5), BAUNILHA("Baunilha", 250, 1.0);

		private String nome;
		private int calorias;
		private double preco;

		Tipos(String nome, int calorias, double preco) {
			this.nome = nome;
			this.calorias = calorias;
			this.preco = preco;
		}

		public String getNome() {
			return this.nome;
		}

		public double getCalorias() {
			return this.calorias;
		}

		public double getPreco() {
			return this.preco;
		}

	}

	public static void menu() {
		System.out.println("\tTORTAS");
		System.out.println("1." + Tipos.CHOCOLATE.getNome() + " = Calorias:" + Tipos.CHOCOLATE.getCalorias() + " : R$"
				+ Tipos.CHOCOLATE.getPreco());
		System.out.println("2." + Tipos.MORANGO.getNome() + "   = Calorias:" + Tipos.MORANGO.getCalorias() + " : R$"
				+ Tipos.MORANGO.getPreco());
		System.out.println("3." + Tipos.BAUNILHA.getNome() + "  = Calorias:" + Tipos.BAUNILHA.getCalorias() + " : R$"
				+ Tipos.BAUNILHA.getPreco());

		System.out.println("0. Sair");
		System.out.print("Escolha sua opção: ");
	}

	public static double preco(int opcao) {
		switch (opcao) {
		case 1:
			return Tipos.CHOCOLATE.getPreco();
		case 2:
			return Tipos.MORANGO.getPreco();
		case 3:
			return Tipos.BAUNILHA.getPreco();

		default:
			return 0.0;

		}
	}

	public static void main(String[] args) {
		double total = 0.0;
		int opcao = 0;
		Scanner input = new Scanner(System.in);

		do {
			menu();
			opcao = input.nextInt();
			total += preco(opcao);

			System.out.println("Opção escolhida: " + opcao);
			System.out.println("Valor de sua conta: " + total + "\n");

		} while (opcao != 0);

	}

}
