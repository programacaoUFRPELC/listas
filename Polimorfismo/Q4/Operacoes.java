package questao4;

import questao2.ItemOrcamento;

public class Operacoes implements OperacoesBanco {

	/*
	private Correntista[] todos;
	private static int size;
	
	public Operacoes (Correntista[] correntistas) {
		
		this.todos = new Correntista[correntistas.length];
		for (int i = 0; i < correntistas.length; i++) {
			this.todos[size] = correntistas[i];
			this.size++;
			
		}
	}
	
	*/
	
	@Override
	public Correntista encontraCorrentista(Correntista[] todosCorrentistas, String cpfProcurado) {
		Correntista c = null;
		int size = todosCorrentistas.length;
		for (int i = 0; i < size; i++) {
			
			if(todosCorrentistas[i].getCPFCliente().equals(cpfProcurado)) {
				c = todosCorrentistas[i];
			}
		}
		
		return c;
	}

}
