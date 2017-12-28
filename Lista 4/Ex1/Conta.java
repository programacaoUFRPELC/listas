
public class Conta extends ContaAbstrata {
	public Conta(String numero, double saldo) {
		super(numero, saldo);
	}

	public void Debitar(double valor) {
		this.setSaldo(this.getSaldo() - valor);
	}

}
