package classes.questao3;

import java.time.LocalTime;
import java.util.Scanner;

import classes.questao2.Data;

public class Questao3Teste {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		int num, assento;
		
		String data, horario;
		System.out.println("Digite o numero do voo:");
		num = console.nextInt();
		System.out.println("Digite a data do voo no formato DD-MM-YYYY:");
		data = console.next();
		Data d = new Data(data);
		System.out.println("Digite o horario do voo no formato HH:MM ");
		horario = console.next();
		LocalTime h = LocalTime.parse(horario);
		Voo v1 = new Voo(d, h, num);
		
		System.out.println("Digite o assento a verificar: ");
		assento = console.nextInt();
		
		System.out.println("Assento livre? " + v1.verifica(assento));
		
		System.out.println("Ocupa " + assento + ": " + v1.ocupa(assento));
		System.out.println("Numero de vagas disponíveis: " + v1.vagas());
		
		System.out.println("Ocupa " + assento + ": " + v1.ocupa(0));
		System.out.println("Numero de vagas disponíveis: " + v1.vagas());
		//Voo v1 = new Voo()
		console.close();
	}

}
