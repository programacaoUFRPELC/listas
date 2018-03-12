
package questao1;

public class Cavalo implements Animal {

	private String especie = "Cavalo";
	private String nome;
	
	public Cavalo(String nome) {
		this.nome = nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String getNomeEspecie() {
		// TODO Auto-generated method stub
		return this.especie;
	}

	@Override
	public String getNomeAnimal() {
		// TODO Auto-generated method stub
		return this.nome;
	}

}
