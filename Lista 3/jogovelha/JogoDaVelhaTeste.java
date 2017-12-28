
import java.util.Scanner;

public class JogoDaVelhaTeste {

	public static void main(String[] args){
		
		JogoDaVelha jogo = new JogoDaVelha();

		int i, j;
		
		Scanner input = new Scanner (System.in);
		
		do{
			
		
		jogo.imprime();

		System.out.println("Insira a posição da linha: ");
		i = input.nextInt();
		System.out.println("Insira a posição da coluna: ");
		j = input.nextInt();
		
		jogo.marcar(i, j);
		
		
		if (jogo.checaVitoria()) {
		   System.out.println("Você ganhou!");
		   System.exit(0);
		}
		else if (jogo.estaCheio()) {
		   System.out.println("Empate!");
		   System.exit(0);
		}

		
		jogo.mudarJogador();
		

}while ((!jogo.estaCheio()) && (!jogo.checaVitoria()));
	}
}