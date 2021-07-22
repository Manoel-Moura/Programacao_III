package MetodoDeGaussComPivotamentoParcial;

public class EliminacaoGaussPivoParcial {
	private int tam; 
	private double x[][]; 
	private double y[]; 


	
	private void alteraLinha(int linha1, int linha2) {
		double aux = 0.00;

		for (int i = 0; i < tam; i++) {
			aux = x[linha1][i];
			x[linha1][i] = x[linha2][i];
			x[linha2][i] = aux;
		}

		aux = y[linha1];
		y[linha1] = y[linha2];
		y[linha2] = aux;

	
	}
	
	public void eliminacaoDeGauss() {

		for (int k = 0; k < (tam - 1); k++) {
			for (int i = (k + 1); i < tam; i++) {
				if (Math.abs(x[k][k]) < Math.abs(x[i][k])) {
					alteraLinha(k, i);
				}
				double m = x[i][k] / x[k][k];
				x[i][k] = 0;

				for (int j = (k + 1); j < tam; j++) {
					x[i][j] = x[i][j] - m * x[k][j];
				}

				y[i] = y[i] - m * y[k];
			}
		}

	}
	
	public void imprimeMatriz() {
		System.out.println("");

		for (int linha = 0; linha < tam; linha++) {
			for (int coluna = 0; coluna < tam; coluna++) {
				System.out.printf("|%.3f ", x[linha][coluna]);
			}
			System.out.printf(" |%.3f", y[linha]);
			System.out.print("\n");
		}
		System.out.println("");

	
	}

	
	EliminacaoGaussPivoParcial(double x[][], double y[], int tam) {
		this.x = x;
		this.y = y;
		this.tam = tam;
	}
}
