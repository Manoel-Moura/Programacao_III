package MetodoDeGaussComPivotamentoParcial;

public class Main {
	public static void main(String[] args) {
		
		int tam = 2;
		double x[][] = { { 0.004,15.73}, { 0.423,-24.72 } }; 
		double y[] = { 15.77, -20.49 };

			
		EliminacaoGaussPivoParcial pivotamento = new EliminacaoGaussPivoParcial(x, y, tam);

		System.out.println("Matriz Original");
		pivotamento.imprimeMatriz(); 
		pivotamento.eliminacaoDeGauss() ; 
		System.out.println("Matriz de Gauss com pivotamento parcial.");
		pivotamento.imprimeMatriz(); 

	}
}
