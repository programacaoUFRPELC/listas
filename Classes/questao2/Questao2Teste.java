package classes.questao2;

import java.util.Scanner;

public class Questao2Teste {

	public static void main(String[] args) {
		String data;
		Scanner console = new Scanner(System.in);
		
		System.out.println("Digite uma data no formato: DD-MM-AAAA");
		data = console.next();
		Data d = new Data(data);
		System.out.println("A data é: " + d.getDia() + "-" + d.getMes() +"-" + d.getAno());
		System.out.println("Mês por extenso: " + d.getMesExtenso());
		
		System.out.println("Digite outra data no formato: DD-MM-AAAA");
		data = console.next();
		Data d2 = new Data(data);
		System.out.println("D1 compara D2: " + d.compara(d2));
		System.out.println("Bissexto? " + d.isBissexto());
		
		Data d3 = d2.clone();
		System.out.println("O mês de d3 é: " + d3.getMesExtenso());
		console.close();
	}

}
