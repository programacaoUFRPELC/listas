package exercicios5;

import java.util.Scanner;

public class Aplica��oTrianguloRetangulo {

	public static void main(String[] args) 
	{
		double altura, base, area, hipotenusa, comprimento;
		Scanner input = new Scanner(System.in);
			
		System.out.println("Informe os lados do triangulo: ");
		System.out.print("Base: ");
		base = input.nextDouble();
		System.out.print("Altura: ");
		altura = input.nextDouble();
		System.out.print("Hipotenusa: ");
		hipotenusa = input.nextDouble();
		
		TrianguloRetangulo triangulo = new TrianguloRetangulo(altura, base, hipotenusa);
		
		area = triangulo.area();
		System.out.printf("�rea do triangulo �: %.2f\n",area);	
		
		comprimento = triangulo.comprimento();
		System.out.printf("O Perimetro do Triangulo �: %.2f\n",comprimento);
		
	}

}
