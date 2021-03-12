import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer vetor[] = { 45, 80, 95, 89, 90, 13 };
		int numero = 0;
		boolean localizou = false;

		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		System.out.println(vetor[2]);
		System.out.println(vetor[3]);

		System.out.println("\nPercorrendo com um laço for:");

		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		
		
		String[] nome = { "Rafael", "Julina", "Afonso", "Camila" };
		double[] altura = { 1.75, 1.80, 1.90, 1.65 };

		System.out.println("\n\n---------------------------------");
		System.out.println("------------TABELA---------------");
		System.out.println("---------------------------------");

		for (int j = 0; j < nome.length; j++) {

			System.out.println(nome[j] + "\t\t" + altura[j]);
		}

		System.out.print("\nInforme a posição do vetor que deseja imprimir: ");

		numero = sc.nextInt();
		for (int posicao = 0; posicao < vetor.length; posicao++) {

			if (posicao == numero) {

				System.out.println("\nEncontrado valor informado na posicao: " + posicao + " com valor de: "
						+ vetor[posicao] + "\n");
				localizou = true;

			}

		}
		// if fora do laço para não repetir essa mensagem várias vezes se simplesmente
		// colocar um else;
		if (localizou == false) {
			System.out.println("\nVocê informaste uma posição inválida\n");
		}

	}

}
