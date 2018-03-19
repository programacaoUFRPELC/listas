package estruturasFuncoesVetores.questao3;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		int num, num2,tmp;
		Scanner console = new Scanner(System.in);
		String bin = "";
		
		System.out.println("Digite um inteiro:");
		num = console.nextInt();
		num2 = num;
		
		while (num > 0) {
			tmp = num % 2;
			num = (num - tmp) / 2;
			bin = bin + tmp;
			
		}
		
		String result = "";
		for (int j = bin.length() - 1; j >= 0; j--) {
			result = result + bin.charAt(j);
		}
		System.out.println("O numero " + num2 + " em binário é: "+ result) ;
		console.close();
	}

}
