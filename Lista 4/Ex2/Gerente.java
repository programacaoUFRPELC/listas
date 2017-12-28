

public class Gerente extends Funcionario {
	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	public void AumentaSalario() {
		this.setSalario(this.getSalario() + (this.getSalario() * 0.1));
	}
}
