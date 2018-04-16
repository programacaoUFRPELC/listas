package classeHerancaPolimorfismo.questao1;

public class Termo {
	private double a;
	private int i;
	private double ax;
	
	public Termo(double ai, int i) {
		this.a = ai;
		this.i = i;
		this.ax = ai;
	}
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public double getAx() {
		return ax;
	}

	public void setAx(double d) {
		this.ax = d;
	}

	public void insere(Termo t) {
		this.a = t.getA();
		this.i = t.getI();
		this.ax = t.getAx();
	}
	
	public double calcula(int x) {
				
		return (this.getA() * (Math.pow(x, this.getI())));
	}
}
