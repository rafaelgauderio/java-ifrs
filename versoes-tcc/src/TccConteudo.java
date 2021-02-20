public class TccConteudo {

	private String introducao;
	private String objetivo;
	private String desenvolvimento;
	private String testes;
	private String conclusao;

	public TccConteudo() {

	}

	public TccConteudo(String introducao, String objetivo, String desenvolvimento, String testes, String conclusao) {
		
		this.introducao = introducao;
		this.objetivo = objetivo;
		this.desenvolvimento = desenvolvimento;
		this.testes = testes;
		this.conclusao = conclusao;
	}

	public String getIntroducao() {
		return introducao;
	}

	public void setIntroducao(String introducao) {
		this.introducao = introducao;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public String getDesenvolvimento() {
		return desenvolvimento;
	}

	public void setDesenvolvimento(String desenvolvimento) {
		this.desenvolvimento = desenvolvimento;
	}

	public String getTestes() {
		return testes;
	}

	public void setTestes(String testes) {
		this.testes = testes;
	}

	public String getConclusao() {
		return conclusao;
	}

	public void setConclusao(String conclusao) {
		this.conclusao = conclusao;
	}

	@Override
	public String toString() {
		return "\nConteúdo do TCC\n" + introducao + "\n" + objetivo + "\n"
				+ desenvolvimento + "\n" + testes + "\n" + conclusao + "\n";
	}

}
