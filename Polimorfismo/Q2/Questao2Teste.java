package questao2;

public class Questao2Teste {

	public static void main(String[] args) {
	
		ItemOrcamento i1 = new ItemOrcamento("Martelo", 15.34f);
		ItemOrcamento i2 = new ItemOrcamento("Prego", 0.35f);
		ItemOrcamento i3 = new ItemOrcamento("Madeira", 50f);
		ItemOrcamento i4 = new ItemOrcamento("Tijolo", 6.89f);
		ItemOrcamento i5 = new ItemOrcamento("Cimento", 12.23f);
		ItemOrcamento i6 = new ItemOrcamento("Parafuso", 1.32f);
		ItemOrcamento[] sala = new ItemOrcamento[3];
		sala[0] = i1;
		sala[1] = i3;
		sala[2] = i6;
		ItemOrcamentoComplexo i7 = new ItemOrcamentoComplexo("Sala 2", sala);
		
	
	System.out.println("\nItem 1: " + i1.getHistorico() +"\n Valor: " + i1.getValor());
	System.out.println("\nItem 2: " + i2.getHistorico() +"\n Valor: " + i2.getValor());
	System.out.println("\nItem 3: " + i3.getHistorico() +"\n Valor: " + i3.getValor());
	System.out.println("\nItem 4: " + i4.getHistorico() +"\n Valor: " + i4.getValor());
	System.out.println("\nItem 5: " + i5.getHistorico() +"\n Valor: " + i5.getValor());
	System.out.println("\nItem 6: " + i6.getHistorico() +"\n Valor: " + i6.getValor());
	System.out.println("\nItem 7: " + i7.getHistorico() +"\n Valor: " + i7.getValor());

	System.out.println(i7.encontraItem("Martelo"));
	System.out.println(i7.encontraItem("Prego"));
	
	}

}
