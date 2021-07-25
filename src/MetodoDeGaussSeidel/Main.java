package MetodoDeGaussSeidel;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = 1.0;
		double y = 1.5;
		double z = 2.0;
		System.out.print("Valor do erro: ");
		float e = sc.nextFloat();
		GaussSeidel g = new GaussSeidel(x, y, z, e);
		g.gaussSeidel();
		g.printSolucao();
		sc.close();
	}

}
