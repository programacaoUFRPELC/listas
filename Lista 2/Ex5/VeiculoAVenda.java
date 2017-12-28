
public class VeiculoAVenda {
	private String tipo;
	private int ano;
	private double valor;
	static int automóveis;
	static int caminhões;
	static int motocicletas;

	public VeiculoAVenda(String tipo, int ano, double preçoVenda) {
		setTipo(tipo);
		setAno(ano);
		setPreçoDeVenda(preçoVenda);
	}

	@Override
	public String toString() {
		return "VeiculoAVenda [tipo= " + tipo + ", ano= " + ano + ", valor= " + valor + ", Quantidade= " + automóveis
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

	public double getPreçoDeVenda() {
		return valor;
	}

	public void setPreçoDeVenda(double preçoDeVenda) {
		this.valor = preçoDeVenda;
	}
}
