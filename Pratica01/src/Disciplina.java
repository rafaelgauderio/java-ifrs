import java.util.Scanner;

public class Disciplina {
	
	String codigo;
	String nome;
	Integer cargaHoraria;
	Curso curso;
	Professor professor;
	
	public Disciplina() {
		
	}

	public Disciplina(String codigo, String nome, Integer cargaHoraria, Curso curso, Professor professor) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.curso = curso;
		this.professor = professor;
	}
	
	public void lerDados() {

		Scanner s = new Scanner(System.in);
		System.out.println("Digite o codigo da disciplina:");
		this.codigo = s.nextLine();

		System.out.println("Digite o nome da disciplina:");
		this.nome = s.nextLine();

		System.out.println("Digite a carga Horária da disciplina");
		this.cargaHoraria = s.nextInt();

	}

	public void mostrarDados() {
		System.out.println("\nDados da Disciplina");
		System.out.println("Codigo da disciplina: " + this.codigo);
		System.out.println("Nome da Disciplina: " + this.nome);
		System.out.println("Carga Horária da Disciplina: " + this.cargaHoraria + " horas");
		System.out.println("Disciplina pertence ao curso: " + this.curso.nome);
		System.out.println("Professor que ministra a disciplina: " + this.professor.nome);
		

	}

	
	
}
