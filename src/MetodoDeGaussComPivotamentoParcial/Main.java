package MetodoDeGaussComPivotamentoParcial;

public class Main {
	public static void main(String[] args) {
		
//		Modelo:
		
//		0.004  15.73 = 15.77
//		0.423 -24.72 = -20.49
		
		int tam = 2; //Quantidade de linhas da matriz 'a'
		double x[][] = { { 0.004,15.73}, {0.423,-24.72 } }; //Matriz que recebe os 'dados'
		double y[] = { 15.77, -20.49 };// vetor que recebe os 'resultados' 
		

			
		EliminacaoGaussPivoParcial pivotamento = new EliminacaoGaussPivoParcial(x, y, tam);

		System.out.println("Matriz Original");
		pivotamento.imprimeMatriz(); 
		pivotamento.eliminacaoDeGauss() ; 
		System.out.println("Matriz de Gauss com pivotamento parcial.");
		pivotamento.imprimeMatriz(); 

	}
}
