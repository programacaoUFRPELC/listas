
public class ContaPoupanša extends Conta {
	public ContaPoupanša(String numero, double saldo) {
		super(numero, 0.0);

	}

	public void RenderJuros(double taxa) {
		this.Creditar(this.getSaldo() + (this.getSaldo() * taxa));
	}
}
