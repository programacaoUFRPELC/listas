
public class ContaPoupan�a extends Conta {
	public ContaPoupan�a(String numero, double saldo) {
		super(numero, 0.0);

	}

	public void RenderJuros(double taxa) {
		this.Creditar(this.getSaldo() + (this.getSaldo() * taxa));
	}
}
