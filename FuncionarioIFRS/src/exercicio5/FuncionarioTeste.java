package exercicio5;

import exercicio1.Funcionario;


public class FuncionarioTeste {

	public static void main(String[] args) {
		
		testafuncionariosComMesmaReferencia();
		
		
	}
	
	public static void testafuncionariosComMesmaReferencia() {
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Claudio");
		f1.setSalario(500);
		
		Funcionario f3 = new Funcionario();
		f1.setNome("CLAUDIO");
		f1.setSalario(500);
		
		Funcionario f2 = f1;
		
		System.out.println("Comparando f1 com f2");
		if (f1.igual(f2)) {
			System.out.println("Os funcionários são IGUAIS.");
		}
		else {
			System.out.println("Os funcionários são DIFERENTES.");
		}
		
		
		System.out.println("\nComparando f1 com f3");
		if (f1.igual(f3)) {
			System.out.println("Os funcionários são IGUAIS.");
		}
		else {
			System.out.println("Os funcionários são DIFERENTES.");
		}
		
		
	}

}
