package MetodoDeGaussSeidel;

public class GaussSeidel {
	protected double x, y, z, x1, y1, z1, e, e1, e2, e3;
	protected int cont = 1;

	public void printSolucao() {
		System.out.printf("\nSolucao: x=%.3f, y=%.3f e z = %.3f\n", this.x1, this.y1, this.z1);

	}

	public void gaussSeidel() {
		System.out.printf("\nIteracao   x\t    y\t   z\n");

		System.out.printf("\n%d\t|%.4f\t|%.4f\t|%.4f\n", 0, this.x, this.y, this.z);

		do {
			// Cálculo das interações
			this.x1 = f1(this.x, this.y, this.z);
			this.y1 = f2(this.x1, this.y, this.z);
			this.z1 = f3(this.x1, this.y1, this.z);

			System.out.printf("%d\t|%.4f\t|%.4f\t|%.4f\n", cont, x1, y1, z1);

			// Cálculo do erro
			this.e1 = Math.abs(this.x - x1);
			this.e2 = Math.abs(this.y - y1);
			this.e3 = Math.abs(this.z - z1);

			cont++; // contador de iterações

			// definindo o valor das próximas iterações
			this.x = this.x1;
			this.y = this.y1;
			this.z = this.z1;

		} while (this.e1 > this.e && this.e2 > this.e && this.e3 > this.e);

	}

	protected double f1(double x, double y, double z) {
		return (8 - (2 * y - z)) / 3;
	}

	protected double f2(double x, double y, double z) {
		return (-4 - (2 * x + 2 * z)) / -4;
	}

	protected double f3(double x, double y, double z) {
		return (3 - (-x + y)) / 5;
	}
	//Criador da minha classe
	public GaussSeidel(double x, double y, double z, double e) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.e = e;
	}

}
