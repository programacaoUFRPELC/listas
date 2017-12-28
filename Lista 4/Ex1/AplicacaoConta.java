
public class AplicacaoConta {

	public static void main(String[] args) {
		ContaAbstrata contaAb1, contaAb2;
		contaAb1 = new ContaBonificada("21.342-7");
		contaAb2 = new ContaImposto("21.987-8", 1000);
		contaAb1.Creditar(1000);
		contaAb1.Debitar(200);
		System.out.println(contaAb1.getSaldo());
		contaAb2.Creditar(1000);
		contaAb2.Debitar(500);
		System.out.println(contaAb2.getSaldo());
	}

}
