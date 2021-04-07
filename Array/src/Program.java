
public class Program {	
	
	public static void main(String[] args) {		
		
		String [] arrayDeString = {"Rafael", "Amanda", "Claudio","Juliana"};		
		// array chamado arrayDeString vai variar da posicão 0 até a posição 3
		
		System.out.println(arrayDeString[3]);
		
		arrayDeString[3]="Bruna";
		
		System.out.print("\n");	
				
		System.out.println(arrayDeString[0]);
		System.out.println(arrayDeString[1]);
		System.out.println(arrayDeString[2]);
		System.out.println(arrayDeString[3]);		
		
		//Matriz 
		System.out.print("\n");		
		int n=3,m=3;
		int[][] matriz = new int[n][m];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("[%d]", matriz[i][j] = i + 2*j);
			}
			System.out.println();
		}
		
		System.out.print("\n");
		System.out.println("Matriz na posição [1][2] é igual: " + matriz[1][2]);	

	}

}
