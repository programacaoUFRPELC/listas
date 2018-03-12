package questao5;

public class DespesaMes {

	 private int mes;  // mes da despesa    
	 private float valor;  // valor da despesa    
	 public DespesaMes(int mes, float valor) {    
		 this.mes = mes;    
		 this.valor = valor;    
		 }    
	 
	 public int getMes() {    
		 return mes;    
		 }    
	 
	 public float getValor() {    
		 return valor;    
		 }

	 public String toString() {
		 return "\nValor: " + this.getValor();
	 }
}
