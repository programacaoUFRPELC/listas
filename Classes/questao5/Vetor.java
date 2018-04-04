package classes.questao5;

public class Vetor {

	private String[] vetor;
	private int index;
	private int size;
	
	public Vetor(int s) {
		this.vetor = new String[s];
		this.index = 0;
		this.size = s;
	}
	
	public void insert(String s) {
		if(this.index < this.vetor.length) {
			this.vetor[index] = s;
			index++;
		}
		else {
			String[] novo = new String[this.vetor.length + 1];
			for(int i = 0; i < this.index; i++) {
				novo[i] = this.vetor[i];
			}
			novo[this.index] = s;
			this.vetor = novo;
			index++;
		}
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String get(int n) {
		String s = null;
		if (n < this.vetor.length && this.vetor[n] != null) {
			s = this.vetor[n];
		}
		return s;
}
	
	public int size() {
		return this.index;
	}
}
