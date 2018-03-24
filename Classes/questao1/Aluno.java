package classes.questao1;

public class Aluno {

	private String matricula;
	private String nome;
	private double notaP1;
	private double notaP2;
	private double notaT;
	public String getMatricula() {
		return matricula;
	}
	
	public Aluno(String mat, String nome, double p1, double p2, double t) {
		this.matricula = mat;
		this.nome = nome;
		this.notaP1 = p1;
		this.notaP2 = p2;
		this.notaT = t;
		
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNotaP1() {
		return notaP1;
	}
	public void setNotaP1(double notaP1) {
		this.notaP1 = notaP1;
	}
	public double getNotaP2() {
		return notaP2;
	}
	public void setNotaP2(double notaP2) {
		this.notaP2 = notaP2;
	}
	public double getNotaT() {
		return notaT;
	}
	public void setNotaT(double notaT) {
		this.notaT = notaT;
	}
	
	public double media() {
		double m = 0;
		double pesoP = 2.5;
		double pesoT = 2.0; 	
		
		m = ((this.getNotaP1() * pesoP) + (this.getNotaP2() * pesoP) + (this.getNotaT() * pesoP)) / ((2 * pesoP) + pesoT);
		return m;
		
	}
	
	public double Final() {
		double f = 0;
		if(this.media() < 7) {
			f = 10 - this.media();
		}
		return f;
	}
}
