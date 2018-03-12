package questao6;

import questao4.Correntista;
import questao5.DespesaIndividuo;

public class CorrentistaDespesa extends Correntista {    
	
	private DespesaIndividuo despesasPrevistas;  // despesas previstas    
	
	public CorrentistaDespesa(String cpfCliente, float saldo, DespesaIndividuo despesas) {        
		super(cpfCliente, saldo);        
		this.despesasPrevistas = despesas;    
		}    
	
	public DespesaIndividuo getDespesasPrevistas() {        
		return despesasPrevistas;    
		}
	
	public String toString() {
		return "\nCpf: " + this.getCPFCliente()+ "\nValor: " + this.getSaldo();
	}
	}


