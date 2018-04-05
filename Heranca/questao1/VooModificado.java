package heranca.questao1;
import java.time.LocalTime;

import classes.questao2.Data;


public class VooModificado extends Voo {

	private boolean[] cadeiras;
	private int indexFumantes;
	private int indexNao;
	
	private int fumantes;
	private int naoFumantes;
	
	public VooModificado(Data data, LocalTime horario, int numero, int nCadeiras, int nFumantes) {
		super(data, horario, numero);
		this.indexNao = 0;
		this.cadeiras = new boolean[nCadeiras];
		this.fumantes = nFumantes;
		this.indexFumantes = nFumantes - 1;
		this.naoFumantes = nCadeiras - nFumantes;
		for (int i = 0; i < nCadeiras; i++) {
			this.cadeiras[i] = false;
		}
	}
	
	public int maxVagas() {
		return this.cadeiras.length;
	}
	
	public int proximoLivre(char c) {

		if(c == 'F') {
			return this.indexFumantes;
		}
		else {
			return this.indexNao;
		}
		

	}
	
	public boolean verifica(int cadeira) {

		return this.cadeiras[cadeira];
		
	}
	
	public boolean ocupa (int cadeira) {
		boolean status = false;
		
		
		if (this.cadeiras[cadeira] == false) {
			this.cadeiras[cadeira] = true;
			if(cadeira < this.fumantes) {
				this.indexNao++;
			}
			else {
				this.indexFumantes++;
			}
			
			status = true;
		}
		
		return status;
	}
	
	
	public int cadeirasFumantes() {
		return this.fumantes;
	}
	
	public char tipo(int cadeira) {
		if(cadeira >= this.naoFumantes) {
			return 'F';
		}
		
		else {
			return 'N';
		}
	}
}
