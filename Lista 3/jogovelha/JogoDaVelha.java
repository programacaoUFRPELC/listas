
public class JogoDaVelha {

	private char[][] tabuleiro;

	private char marcaAtual;

	public JogoDaVelha() {

		tabuleiro = new char[3][3];

		marcaAtual = 'x';

		iniciar();

	}

	public void iniciar() {

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				tabuleiro[i][j] = '-';

			}

		}

	}

	public void imprime() {

		System.out.println("-------------");

		for (int i = 0; i < 3; i++) {

			System.out.print("| ");

			for (int j = 0; j < 3; j++) {

				System.out.print(tabuleiro[i][j] + " | ");

			}

			System.out.println();

			System.out.println("-------------");

		}

	}

	public boolean estaCheio() {

		boolean estado = true;

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				if (tabuleiro[i][j] == '-') {

					estado = false;

				}
			}

		}

		return estado;

	}

	public boolean checaVitoria() {

		return (checaLinhas() || checaColunas() || checaDiagonais());

	}

	private boolean checaLinhas() {

		for (int i = 0; i < 3; i++) {

			if (checaLinhaCol(tabuleiro[i][0], tabuleiro[i][1], tabuleiro[i][2]) == true) {

				return true;

			}

		}

		return false;

	}

	private boolean checaColunas() {

		for (int i = 0; i < 3; i++) {

			if (checaLinhaCol(tabuleiro[0][i], tabuleiro[1][i], tabuleiro[2][i]) == true) {

				return true;

			}

		}

		return false;

	}

	private boolean checaDiagonais() {

		return ((checaLinhaCol(tabuleiro[0][0], tabuleiro[1][1], tabuleiro[2][2]) == true)
				|| (checaLinhaCol(tabuleiro[0][2], tabuleiro[1][1], tabuleiro[2][0]) == true));

	}

	private boolean checaLinhaCol(char c1, char c2, char c3) {

		return ((c1 != '-') && (c1 == c2) && (c2 == c3));

	}

	public void mudarJogador() {

		if (marcaAtual == 'x') {

			marcaAtual = 'o';

		}

		else {

			marcaAtual = 'x';

		}

	}

	public boolean marcar(int row, int col) {

		if ((row >= 0) && (row < 3)) {

			if ((col >= 0) && (col < 3)) {

				if (tabuleiro[row][col] == '-') {

					tabuleiro[row][col] = marcaAtual;

					return true;

				}

			}

		}

		return false;

	}
}
