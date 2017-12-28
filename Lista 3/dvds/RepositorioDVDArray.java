package dvds;


public class RepositorioDVDArray {
private Dvd[] dvds;
	
	private static int indice;
	
	public RepositorioDVDArray(int capacidade){
		
		this.dvds = new Dvd[capacidade];
		this.indice = 0;
		
	}
	
	public void inserir (Dvd dvd){
		
		this.dvds[this.indice] = dvd;
		this.indice++;
		
	}
	
	public Dvd procurar (int codigo){
		
		Dvd tmp = null;
		
		for (int i = 0; i < this.indice; i++){
			if (this.dvds[i].getCodigo() == codigo){
				tmp = this.dvds[i];
			}
		}
		return tmp;
		
	}

	public void remover(Dvd dvd){
		
		int local = 0;
		//Dvd tmp = this.procurar(dvd.codigo);
		
		for (int i = 0; i < this.indice; i++){
			if (this.dvds[i].getCodigo() == dvd.getCodigo()){
				this.dvds[i] = this.dvds[this.indice - 1];
				this.dvds[this.indice - 1] = null;
				this.indice--;
				
				}
				}
	}
	public Dvd[] getDvds() {
		return dvds;
	}

	public void setDvds(Dvd[] dvds) {
		this.dvds = dvds;
	}

	public static int getIndice() {
		return indice;
	}

	public static void setIndice(int indice) {
		RepositorioDVDArray.indice = indice;
	}
	
	public String toString(){
		
		String resultado = "########\n";
		
		for (int i = 0; i < this.getIndice(); i++){
			
			resultado = resultado + this.dvds[i].toString() + "\n########\n";
		}
		return resultado;
		
		
	}
}
