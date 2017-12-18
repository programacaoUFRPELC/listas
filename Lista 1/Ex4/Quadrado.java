
public class Quadrado {
	private double lado;

	public Quadrado() {
		this.lado = 0;
	}

	public Quadrado(double lado) {

		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double area() {
		double area = this.lado * this.lado;
		return area;
	}

	public double comprimento() {
		double comprimento = 4 * this.lado;
		return comprimento;
	}

	public void desenha() {
		int j, i;
		System.out.println("\t\tDesenhando Quadrado!");

		for (i = 1; i <= this.lado; i++) {
			System.out.printf(" _");
		}
		for (j = 1; j <= this.lado; j++) {
			System.out.printf("\n|");

			for (i = 1; i <= this.lado; i++) {
				System.out.printf("_");
				System.out.printf("|");
			}
		}
		System.out.printf("\n\n");
	}
}
