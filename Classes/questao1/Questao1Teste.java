package classes.questao1;

public class Questao1Teste {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("12345", "Viviane", 7.5, 6.75, 10);

		Aluno a2 = new Aluno("12345", "Viviane", 7.8, 6.5, 5);
		
		System.out.println("A m�dia do Aluno " + a1.getNome() + "� " + String.format("%.2f", a1.media()));
		System.out.println("A m�dia do Aluno " + a2.getNome() + " � " + String.format("%.2f", a2.media()));
		System.out.println("O aluno " + a1.getNome() + " precisa de " + String.format("%.2f", a1.Final()) + " na prova final.");
		System.out.println("O aluno " + a2.getNome() + " precisa de " + String.format("%.2f", a2.Final()) + " na prova final.");
	}

}
