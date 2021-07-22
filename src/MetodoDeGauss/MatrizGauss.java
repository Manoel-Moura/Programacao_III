package MetodoDeGauss;

import java.util.Scanner;

public class MatrizGauss {
	Scanner sc = new Scanner(System.in);
	int tamanho = 4;
	double[][] matriz = new double[this.tamanho][this.tamanho + 1];

	public void criaMatriz(int tamanho) {

		this.tamanho = tamanho;

		for (int i = 0; i < tamanho; i++) { // Coleta de dados para preencher a matriz
			for (int j = 0; j <= tamanho; j++) {
				System.out.print("Digite [" + i + ", " + j + "]: ");
				matriz[i][j] = sc.nextDouble();
			}
		}

		System.out.println("\n\n\t Matriz Original!");
		imprimeMatriz();

		eliminacaPorgreciva(); // ELIMINACAO PROGRESSIVA

		System.out.println("\n\t Matriz de Gauss!");
		imprimeMatriz();

	}

	public void imprimeMatriz() {
		System.out.println("");
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j <= tamanho; j++) {
				System.out.printf("|%.3f\t", matriz[i][j]);
			}
			System.out.println(" ");
		}
	}

	public void eliminacaPorgreciva() {
		double fator;
		for (int k = 0; k < tamanho - 1; k++) {// Coluna pivo que se altera.
			for (int i = (k + 1); i < tamanho; i++) {// Linhas que sofrerao as eliminacoes.
				fator = matriz[i][k] / matriz[k][k];// Fator que sera multiplicado pela linha pivo
				for (int j = 0; j <= tamanho; j++) {// Cada coluna da linha que sofrerao modificacoes da linha i
					matriz[i][j] = matriz[i][j] - fator * matriz[k][j];
				}
			}
		}

	}

}
