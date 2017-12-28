
public abstract class ContaAbstrata {
	private String numero;
	private double saldo;

	public ContaAbstrata(String numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	public ContaAbstrata(String numero) {
		this.numero = numero;
		this.saldo = 0;
	}

	public void Creditar(double valor) {
		this.saldo = this.saldo + valor;
	}

	public abstract void Debitar(double valor);

	public void Transferir(ContaAbstrata contaAbstrata, double valor) {
		this.Debitar(valor);
		this.Creditar(valor);
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
