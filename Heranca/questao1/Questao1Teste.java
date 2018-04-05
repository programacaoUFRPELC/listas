package heranca.questao1;

import java.time.LocalTime;
import java.util.Scanner;

import classes.questao2.Data;

public class Questao1Teste {

	public static void main(String[] args) {
		
		// Data data, LocalTime horario, int numero, int nCadeiras, int nFumantes
		String data, horario;
		int numero;
		int nCadeiras;
		int nFumantes;
		Scanner console = new Scanner(System.in);
		
		System.out.println("Digite o número do voo: ");
		numero = console.nextInt();
		System.out.println("Digite a data do voo no formato: DD-MM-AAAA: ");
		data = console.next();
		Data d = new Data(data);
		System.out.println("Digite o horario do voo no formato HH:MM ");
		horario = console.next();
		LocalTime h = LocalTime.parse(horario);
		System.out.println("Digite o número máximo de cadeiras: ");
		nCadeiras = console.nextInt();
		System.out.println("Digite quantas cadeiras devem ser para fumantes");
		nFumantes = console.nextInt();
		VooModificado v1 = new VooModificado(d, h, numero, nCadeiras, nFumantes);
		

		System.out.println("Número máximo de vagas: " + v1.maxVagas());
		
		System.out.println("Digite o assento a verificar: ");
		int assento = console.nextInt();
		
		System.out.println("Assento livre? " + !v1.verifica(assento));
		System.out.println("Assendo de (F)umante ou (N)ão? " + v1.tipo(assento));
		
		System.out.println("Ocupa " + assento + ": " + v1.ocupa(assento));
		
		
		console.close();
	}

}
