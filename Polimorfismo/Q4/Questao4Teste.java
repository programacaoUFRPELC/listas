package questao4;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Questao4Teste {

	public static void main(String[] args) {
		Correntista c1, c2, c3, c4, c5;
		
		c1 = new Correntista("12345", 45f);
		c2 = new Correntista("67890", 245f);
		c3 = new Correntista("123123", 345f);
		c4 = new Correntista("456456", 145f);
		c5 = new Correntista("789789", 545f);
		
		Movimentos m1, m2, m3, m4, m5;
		
		m1 = new Movimentos("12345", 100f);
		m2 = new Movimentos("67890", -100f);
		m3 = new Movimentos("123123", 200f);
		m4 = new Movimentos("456456", -200f);
		m5 = new Movimentos("789789", 1000f);
		
		Correntista[] todos = {c1, c2, c3, c4, c5};
		
		Movimentos[] ms = {m1, m2, m3, m4, m5};
		
		Operacoes myO = new Operacoes();
		
		System.out.println("Correntistas antes das operacoes: ");
		System.out.println("\nCPF: " + c1.getCPFCliente() + "\nSaldo: " + c1.getSaldo());
		System.out.println("\nCPF: " + c2.getCPFCliente() + "\nSaldo: " + c2.getSaldo());
		System.out.println("\nCPF: " + c3.getCPFCliente() + "\nSaldo: " + c3.getSaldo());
		System.out.println("\nCPF: " + c4.getCPFCliente() + "\nSaldo: " + c4.getSaldo());
		System.out.println("\nCPF: " + c5.getCPFCliente() + "\nSaldo: " + c5.getSaldo());
		
		atualizaSaldos(todos, ms, myO);
		
		System.out.println("\nCorrentistas depois das operacoes: ");
		System.out.println("\nCPF: " + c1.getCPFCliente() + "\nSaldo: " + c1.getSaldo());
		System.out.println("\nCPF: " + c2.getCPFCliente() + "\nSaldo: " + c2.getSaldo());
		System.out.println("\nCPF: " + c3.getCPFCliente() + "\nSaldo: " + c3.getSaldo());
		System.out.println("\nCPF: " + c4.getCPFCliente() + "\nSaldo: " + c4.getSaldo());
		System.out.println("\nCPF: " + c5.getCPFCliente() + "\nSaldo: " + c5.getSaldo());
		
		
		}
	

	public static void atualizaSaldos (Correntista[] C, Movimentos[] M, Operacoes o) {
		
		int m = M.length;
		
		Correntista tmp;
		
		for (int i = 0; i < m; i++) {
			
			tmp = o.encontraCorrentista(C, M[i].getCPFCorrentista());
			if(tmp != null) {
				tmp.setSaldo(tmp.getSaldo() + M[i].getValorMovimento());
			}
			
		}
	}
}
