
public class Tcc {

	private int versao;
	private Aluno aluno;
	private Orientador orientador;
	private TccConteudo conteudo;

	// construtor vazio
	public Tcc() {

	}

	public Tcc(int versao, Aluno aluno, Orientador orientador) {
		super();
		this.versao = versao;
		this.aluno = aluno;
		this.orientador = orientador;
	}

	public Tcc(int versao, Aluno aluno, Orientador orientador, TccConteudo conteudo) {
		super();
		this.versao = versao;
		this.aluno = aluno;
		this.orientador = orientador;
		this.conteudo = conteudo;
	}

	public int getVersao() {
		return versao;
	}

	public void setVersao(int versao) {

		this.versao = versao;
		if (this.versao>1) {
			System.out.println("Foi setada um nova versão\nNova versão número: "
					+ this.versao +"\n");			
		}
		
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Orientador getOrientador() {
		return orientador;
	}

	public void setOrientador(Orientador orientador) {
		this.orientador = orientador;
	}

	public TccConteudo getConteudo() {
		return conteudo;
	}

	public void setConteudo(TccConteudo conteudo) {
		this.conteudo = conteudo;
	}

	@Override
	public String toString() {
		return "Tcc [versao do TCC=" + versao + "]" + "\n" + aluno + "\n" + orientador + "\n";
	}

}
