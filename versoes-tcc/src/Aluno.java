
public class Aluno extends Pessoa {

	private int matricula;
	private String curso;
	private Orientador orientador;

	public Aluno() {

	}

	public Aluno(int matricula, String curso) {
		super();
		this.matricula = matricula;
		this.curso = curso;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	
	public Orientador getOrientador() {
		return orientador;
	}

	public void setOrientador(Orientador orientador) {
		this.orientador = orientador;
	}

	public void entregarEtapa() {
		
		System.out.println("O Aluno " + super.getNome() + " entregou uma nova etapa do TCC.\n");
		
	}
	
	public void atualizarCronograma() {
		System.out.println("O Aluno " + super.getNome() + " atualizou o seu cronograma de entregas das etapas do TCC.\n");
	}
	
	public void AvisarProfessor() {
		System.out.println("Prezado Orientador " + orientador.getNome() + ", o aluno " + super.getNome() +" está precisando de "
				+ "ajuda, fazer entrar em contato!\n");
	}
	
	@Override
	public String toString() {
		return "Aluno: " + super.toString() + "\n[matricula=" + matricula + ", curso=" + curso + "]";
	}

	
	
}
