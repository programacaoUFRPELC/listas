package classeHerancaPolimorfismo.questao1;

public class Polinomio{

	private Termo[] P;
	
	public Polinomio(Termo t) {
		P = new Termo[t.getI() + 1];
		for (int i = 0; i < t.getI(); i++) {
			P[i] = new Termo(0,1);
		}
		P[t.getI()] = t;
		}

	public void insere(Termo t) {
		int i = t.getI();
		
		if (i > this.P.length) {
			Termo[] newP = new Termo[t.getI()];
			for (int j = 0; j < i; j++) {
				newP[j] = this.P[j];
			}
			newP[i] = t;
			this.P = newP;
		}
		else {
			Termo newTermo = new Termo(t.getA(), t.getI());
			newTermo.setA(t.getA() + this.P[i - 1].getA());	
			newTermo.setAx(t.getA() + this.P[i - 1].getA());
			this.P[i - 1] = newTermo;
		}
	}
	
	public double calcula(int x) {
		double result = 0;
		
		for (int j = 0; j < this.P.length; j++) {
			result = result + (this.P[j].getAx() * (Math.pow(x, this.P[j].getI())));
		}
		return result;
	}
}
