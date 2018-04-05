package heranca.questao1;

import java.time.LocalTime;


import classes.questao2.Data;

public class Voo {

	private Data data;
	private LocalTime horario;
	private boolean[] passageiros = new boolean[100];
	private int numero;
	private int index;
	
	public Voo(Data data, LocalTime horario, int numero) {
		this.data = data;
		this.horario = horario;
		this.numero = numero;
		this.index = 0;
	}
	
	public int proximoLivre() {
		return this.index;
	}
	
	public boolean verifica(int cadeira) {
		if(cadeira >= index) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public boolean ocupa (int cadeira) {
		boolean status = false;
		if (this.passageiros[cadeira] == false) {
			this.passageiros[cadeira] = true;
			this.index++;
			status = true;
		}
		
		return status;
	}
	
	public int vagas() {
		return (100 - this.index);
	}

	public int getVoo() {
		return this.numero;
	}
	
	public Data getData() {
		
		return this.data;
		
	}
	
	public Voo clona() {
		
		Voo novo = new Voo(this.data, this.horario, this.numero);
		
		return novo;
	}
}


