package questao5;

public class DespesaDia extends DespesaMes {    
	private int dia;  // dia da despesa    
	public DespesaDia(int dia, int mes, float valor) {    
		super(mes, valor);    
		this.dia = dia;    
		}    
	
	public int getDia() {    
		return dia;    
		} 
	}


