
public class MeuArray {
	private int vet[];

	public MeuArray(int vet[]) {
		this.vet = vet;
	}

	public int getSum() {
		int soma = 0;
		for (int numero : vet) {
			soma += numero;
		}
		return soma;
	}

	public int getMax() {
		int Max = vet[0];
		for (int vet : vet) {
			if (vet > Max) {
				Max = vet;
			}
		}
		return Max;
	}

	public int getGreater(int valor) {
		int i, contador = 0;
		for (i = 0; i < vet.length; i++) {
			if (vet[i] == valor) {
				contador++;
			}
		}
		return contador;
	}

	public void changePosition() {

		int i = 0, f = vet.length - 1;
		while (i < f) {
			int aux = vet[i];
			vet[i] = vet[f];
			vet[f] = aux;
			i++;
			f--;
		}
		System.out.printf("\nDepois\n");
		for (int x : vet) {
			System.out.printf(x + " ");
		}
		System.out.println();
	}

}
