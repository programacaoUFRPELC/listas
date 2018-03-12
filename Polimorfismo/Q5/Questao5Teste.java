package questao5;

public class Questao5Teste {

	public static void main(String[] args) {
		
		DespesaMes jan = new DespesaMes(1, 240f);
		DespesaMes fev = new DespesaMes(2, 1250f);
		DespesaDia niver = new DespesaDia(12, 2, 350f);
		DespesaDia mar = new DespesaDia(8, 3, 50f);
		DespesaMes[] total = {jan, fev, mar, niver};
		DespesaIndividuo vivi = new DespesaIndividuo("123456", total);
		
		System.out.println("\nDespesas Janeiro: " + jan.getValor());
		System.out.println("\nDespesas Fevereiro: " + fev.getValor());
		System.out.println("\nDespesas Marco: " + mar.getValor());
		System.out.println("\nDespesas Aniversario: " + niver.getValor());
		System.out.println("\nDespesas de Vivi em Fevereiro: " + vivi.totalizaMes(2));
	}

}
