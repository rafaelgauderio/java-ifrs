import java.util.Arrays;

public class Orientador extends Pessoa {

	
	private String titulacao;	
	private byte numeroOrientados;

	public Orientador() {

	}

	public Orientador(String titulacao, byte numeroOrientados) {
		super();
		this.titulacao = titulacao;
		this.numeroOrientados = numeroOrientados;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public byte getNumeroOrientados() {
		return numeroOrientados;
	}

	public void setNumeroOrientados(byte numeroOrientados) {
		this.numeroOrientados = numeroOrientados;
	}
	@Override
	public String toString() {
		return "Orientador: "+ super.toString() + "\n[titulacao=" + titulacao + ", número de  Alunos Orientados=" + numeroOrientados + "]";
	}
	
	

}
