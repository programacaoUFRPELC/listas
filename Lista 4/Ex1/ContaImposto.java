
public class ContaImposto extends ContaAbstrata {
	public static final double TAXA = 0.001;

	public ContaImposto(String numero, double saldo) {
		super(numero, saldo);
	}

	public void Debitar(double valor) {
		double imposto = valor * TAXA;
		this.setSaldo(this.getSaldo() - (valor * imposto));

	}
}
