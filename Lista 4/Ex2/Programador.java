
public class Programador extends Funcionario {
	public Programador(String nome, double salario) {
		super(nome, salario);
	}

	public void AumentaSalario() {
		this.setSalario(this.getSalario() + (this.getSalario() * 0.2));
	}
}
