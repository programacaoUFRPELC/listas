
import java.util.Scanner;

public class AplicaçãoQuadrado {

	public static void main(String[] args) 
	{	
		double lado, area, comprimento;
		Scanner input = new Scanner(System.in);
			
		System.out.print("INFORME O LADO DO QUADRADO: ");
		lado = input.nextDouble();
		Quadrado quadrado1 = new Quadrado(lado);
		System.out.println("\n");
		System.out.println("O quadrado tem lados de tamanho: " + quadrado1.getLado() + " .\n");
		area = quadrado1.area();
		System.out.printf("Área do quadrado é: %.2f\n",area);	
		System.out.println("\n");
		
		quadrado1.desenha();
		
		comprimento = quadrado1.comprimento();
		System.out.printf("Perimento do quadrado é: %.2f\n",comprimento);	
		
	}
}
