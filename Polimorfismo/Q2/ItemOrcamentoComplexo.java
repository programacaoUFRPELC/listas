package questao2;

import java.util.ArrayList;
import java.util.List;

public class ItemOrcamentoComplexo extends ItemOrcamento {

	private ItemOrcamento[] subitens;
	private static int size;
	
	public ItemOrcamentoComplexo(String historico, ItemOrcamento[] itens) {
		super(historico, 0);
		 this.subitens = new ItemOrcamento[itens.length];
		this.size = 0;
		 for (int i = 0; i < itens.length; i++) {
			this.subitens[size] = itens[i];
			this.size++;
		}
		
		
		// TODO Auto-generated constructor stub
	}

	public float getValor() {
		
		
		float total = 0;
		
		for (int i = 0; i < this.size; i++) {
			
		
			total = total + this.subitens[i].getValor();
			
		}
		
		return total;
		
	}
	
	public ItemOrcamento encontraItem(String historico) {
		
		List<ItemOrcamento> itens = new ArrayList<ItemOrcamento>();
		
		ItemOrcamento item = new ItemOrcamento(null, 0);
		for (int i = 0; i < this.subitens.length; i++) {
		  if (this.subitens[i].getHistorico().equals(historico)) {
			  item = subitens[i];
		  }
			//	itens.add(this.subitens[i]);
		}
		
		
		return item;
		
	}
}
