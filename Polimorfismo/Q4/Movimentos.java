package questao4;

public class Movimentos implements MovimentoConta {

	private String cpf;
	private float valor;
	
	public Movimentos(String cpf, float valor) {
		
		this.cpf = cpf;
		this.valor = valor;
	}
	
	@Override
	public String getCPFCorrentista() {
		// TODO Auto-generated method stub
		return this.cpf;
	}

	@Override
	public float getValorMovimento() {
		// TODO Auto-generated method stub
		return this.valor;
	}

}
