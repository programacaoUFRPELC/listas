package estruturasFuncoesVetores.questao7;

import java.util.Scanner;

public class Questao7 {


	public static void main(String[] args) {
		
		double a, b, c;
		Resultado resultado = new Resultado();
		Scanner console = new Scanner(System.in);
		
		System.out.println("Digite a constante a da equação:");
		a = console.nextDouble();
		System.out.println("Digite a constante b da equação:");
		b = console.nextDouble();
		System.out.println("Digite a constante c da equação:");
		c = console.nextDouble();
		
		resultado = calculaRaizes(a, b, c);
		
		if (resultado.getStatus() == -1) {
			System.out.println("Impossível calcular.");
		}
		else if(resultado.getStatus() == 1) {
			System.out.println("A equação possui 1 raiz: " + resultado.getR1());
		}
		else {
			System.out.println("A equação possui 2 raizes: " + resultado.getR1() + " e " + resultado.getR2());
		}
		console.close();
	}

	public static Resultado calculaRaizes(double a, double b, double c) {
	
		double delta, r1, r2;
		int status;
		Resultado r = new Resultado();
		
		delta = b * b - (4 * a * c);
		
		if (a != 0) {
			if(delta > 0){
				r1 = (-b + Math.sqrt(delta))/(2 * a);
		        r2 = (-b - Math.sqrt(delta))/(2 * a);
		        status = 2;
			}
			else if(delta == 0) {
				r1 = -b;
				r2 = 0;
				status = 1;
			}
			else {
				r1 = r2 = status = 0;
				
			}
			r.setR1(r1);
			r.setR2(r2);
			r.setStatus(status);
		}
		
			
		else {
			r.setR1(-1);
			r.setR2(-1);
			r.setStatus(-1);
		}
		
		return r;
		
	}
}
