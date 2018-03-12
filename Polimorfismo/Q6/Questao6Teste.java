package questao6;

import questao5.DespesaDia;
import questao5.DespesaIndividuo;
import questao5.DespesaMes;

public class Questao6Teste {

	public static void main(String[] args) {
		
		DespesaMes jan = new DespesaMes(1, 240f);
		DespesaMes fev = new DespesaMes(2, 1250f);
		DespesaDia niver = new DespesaDia(12, 2, 350f);
		DespesaDia mar = new DespesaDia(8, 3, 50f);
		DespesaMes[] total = {jan, fev, mar, niver};
		DespesaIndividuo vivi = new DespesaIndividuo("123456", total);
		
		DespesaMes jan2 = new DespesaMes(1, 240f);
		DespesaMes fev2 = new DespesaMes(2, 1250f);
		DespesaDia niver2 = new DespesaDia(12, 2, 350f);
		DespesaDia mar2 = new DespesaDia(8, 3, 30f);
		DespesaMes[] total2 = {jan, fev, mar, niver};
		DespesaIndividuo tony = new DespesaIndividuo("654321", total2);
		
		
		CorrentistaDespesa d1 = new CorrentistaDespesa("123456", 200f, vivi);
		
		CorrentistaDespesa d2 = new CorrentistaDespesa("654321", 20f, tony);
		
		CorrentistaDespesa[] d3 = {d1, d2};
		
		CorrentistaDespesa[] v = verificaDespesas(d3);
		
		System.out.println("Despesas de Marco de Vivi: " + vivi.totalizaMes(3));
		System.out.println("Despesas de Marco de Tony: " + tony.totalizaMes(3));
		System.out.println("Resultado de verificaDespesas: " + v[0]);
		}
	

	public static CorrentistaDespesa[] verificaDespesas(CorrentistaDespesa[] todas) {
	
		int ind = 0;
		CorrentistaDespesa[] atual = new CorrentistaDespesa[todas.length];
		
		for (int i = 0; i < todas.length; i++) {
			float f = todas[i].getDespesasPrevistas().totalizaMes(3).getValor(); 
					
				if(f < todas[i].getSaldo()) {
					atual[ind] = todas[i];
					ind++;
			}
		}
		return atual;
	}
}
