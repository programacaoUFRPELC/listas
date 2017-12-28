
public class VeiculoAVenda {
	private String tipo;
	private int ano;
	private double valor;
	static int autom�veis;
	static int caminh�es;
	static int motocicletas;

	public VeiculoAVenda(String tipo, int ano, double pre�oVenda) {
		setTipo(tipo);
		setAno(ano);
		setPre�oDeVenda(pre�oVenda);
	}

	@Override
	public String toString() {
		return "VeiculoAVenda [tipo= " + tipo + ", ano= " + ano + ", valor= " + valor + ", Quantidade= " + autom�veis
				+ "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getPre�oDeVenda() {
		return valor;
	}

	public void setPre�oDeVenda(double pre�oDeVenda) {
		this.valor = pre�oDeVenda;
	}
}
