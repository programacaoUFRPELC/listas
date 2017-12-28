
public class ContaBonificada extends Conta {
	protected double bonus;

	public ContaBonificada(String numero) {
		super(numero, 0.0);
	}

	public void Creditar(double valor) {
		bonus = bonus + (valor * 0.01);
		super.Creditar(valor);
	}

	public void RenderBonus() {
		super.Creditar(bonus);
		bonus = 0;
	}

	public double getBonus() {
		return bonus;
	}
}
