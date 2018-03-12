

package questao1;

public class Gato implements Animal{
	private String especie = "Gato";
	private String nome;
	
	
public Gato(String nome) {
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
