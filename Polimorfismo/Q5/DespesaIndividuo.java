package questao5;

public class DespesaIndividuo {

	private String cpf;
	private DespesaMes[] despesas;
	private static int index;
	
	public DespesaIndividuo (String cpf, DespesaMes[] todas) {
		this.cpf = cpf;
		this.despesas = new DespesaMes[todas.length];
		this.index = 0;
		
		 for (int i = 0; i < despesas.length; i++) {
		this.despesas[index] = todas[i];
		this.index++;
	}
		
	}

	public String getCPF() {
		return this.cpf;
	}

	public DespesaMes totalizaMes(int mes) {
		
		int j = 0; 
		int ind = this.despesas.length;
		float total = 0;
		
		for (int i = 0; i < ind; i++) {
			if (this.despesas[i].getMes() == mes) {
				total = total + this.despesas[i].getValor();
			}
		}
		DespesaMes m = new DespesaMes(mes, total);
		return m;
	}
}
