package classes.questao4;

public class Prova {

	private char[] gabarito = new char[15];
	private char[] respostas = new char[15];
	
	private int index;
	private int empate;
	
	public Prova(char[] g) {
		this.gabarito = g;
		this.index = 0;
		this.empate = 1;
	}
	
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public void respostaAluno(char c) {
		if(this.index < 15) {
		this.respostas[index] = c;
		index++;
		}
		
	}
	
	public int acertos() {
		int n = 0;
		
		for (int i = 0; i < this.index; i++) {
			if(this.gabarito[i] == this.respostas[i]) {
				n++;
			}
		}
		return n;
		
	}
	
	public double nota() {
		double n = 0;
		
		for (int i = 0; i < 10; i++) {
			if (this.gabarito[i] == this.respostas[i]) {
				n = n + 0.5;
			}
		}
		
		for (int j = 10; j < 15; j++) {
			if (this.gabarito[j] == this.respostas[j]) {
				n++;
			}
		}
		return n;
		
	}
	
	public double maior(Prova p) {
		double n = 0;
		
		if (this.empate % 2 == 0) {
			if (this.nota() >= p.nota()) { 
				this.empate++;
				n = this.nota();
			} else {
				this.empate++;
				n = p.nota();
		}
		}
		else {
			this.empate++;
			if(p.nota() >= this.nota()) {
				n = p.nota();
			}
			else {
				n = this.nota();
			}
			
		}
		
		return n;
		
	}
	
}
