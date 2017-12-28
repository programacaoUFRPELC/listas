package dvds;

public class Dvd {
private int codigo;
	
	private String descricao;
	
	
	public Dvd(int codigo, String descricao){
		
		this.codigo = codigo;
		this.descricao = descricao;
		
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String toString(){
		String resultado = "";
		
		resultado = resultado + "Descrição: " + this.getDescricao() + "\n" + "Código:" + " " + this.getCodigo();
		
		return resultado;
	}
}
