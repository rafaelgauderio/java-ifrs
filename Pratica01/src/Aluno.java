import java.util.Scanner;

public class Aluno {

	String nome;
	String matricula;
	String cpf;
	Curso curso;

	public Aluno() {

	}

	public Aluno(String nome, String matricula, String cpf, Curso curso) {
		this.nome = nome;
		this.matricula = matricula;
		this.cpf = cpf;
		this.curso=curso;
	}
	
	public Aluno(String nome, String matricula, String cpf) {
		this.nome = nome;
		this.matricula = matricula;
		this.cpf = cpf;
		
	}

	public void lerDados() {

		Scanner s = new Scanner(System.in);
		System.out.println("\nInforme o nome do aluno:");
		this.nome = s.nextLine();
		System.out.println("Informe a matrícula do aluno:");
		this.matricula = s.nextLine();
		System.out.println("Informe o CPF do aluno:");
		this.cpf = s.nextLine();
		
		
	}

	public void mostrarDados() {

		System.out.println("\nDados do Aluno");
		System.out.println("Nome do aluno: " + this.nome);
		System.out.println("Matricula do aluno: " + this.matricula);
		System.out.println("CPF do aluno: " + this.cpf);
		System.out.println("Codigo do curso: " + curso.codigo);
		System.out.println("Nome do curso: " + curso.nome);
		System.out.println("Duração do curso: " + curso.duracao + " anos");

	}
	
	

}
