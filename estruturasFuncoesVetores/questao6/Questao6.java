package estruturasFuncoesVetores.questao6;

import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		
		String word = "";
		Scanner console = new Scanner (System.in);
		
		System.out.println("Digite uma cadeia: ");
		word = console.next();
		
		String result = "";
		for (int j = word.length() - 1; j >= 0; j--) {
			result = result + word.charAt(j);
		}
		if (word.equals(result)) {
			System.out.println(word + " e " + result + " s�o pal�ndromos." );
			}
		else {
			System.out.println(word + " e " + result + " n�o s�o pal�ndromos.");
		}
		console.close();
	}

}
