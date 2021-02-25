import java.util.Scanner;

public class Curso {

	String codigo;
	String nome;
	Integer duracao;

	public Curso() {

	}

	public Curso(String codigo, String nome, Integer duracao) {
		this.codigo = codigo;
		this.nome = nome;
		this.duracao = duracao;
	}

	public void lerDados() {

		Scanner s = new Scanner(System.in);
		System.out.println("Digite o codigo do curso:");
		this.codigo = s.nextLine();

		System.out.println("Digite o nome do curso:");
		this.nome = s.nextLine();

		System.out.println("Digite a duracao do curso:");
		this.duracao = s.nextInt();

	}

	public void mostrarDados() {
		System.out.println("\nDados do Curso");
		System.out.println("Codigo do curso: " + this.codigo);
		System.out.println("Nome do curso: " + this.nome);
		System.out.println("Duração do curso: " + this.duracao + " anos");

	}

}
