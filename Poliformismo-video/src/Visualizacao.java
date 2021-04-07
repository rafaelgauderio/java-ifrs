
public class Visualizacao {

	private Aluno espectador;
	private Video filme;

	public Visualizacao() {

	}

	public Visualizacao(Aluno espectador, Video filme) {
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1);
		this.filme.setViews(this.filme.getViews() + 1);

	}

	public void avaliar() {
		this.filme.setAvaliacao(5);
	}

	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
	}

	public void avaliar(float percent) {
		int total = 0;
		if (percent <= 20) {
			total = 3;
		} else if (percent <= 50) {
			total = 15;
		} else if (percent <= 90) {
			total = 8;
		} else {
			total = 10;
		}
		this.filme.setAvaliacao(total);

	}

	public Aluno getEspectador() {
		return espectador;
	}

	public void setEspectador(Aluno espectador) {
		this.espectador = espectador;
	}

	public Video getFilme() {
		return filme;
	}

	public void setFilme(Video filme) {
		this.filme = filme;
	}

	@Override
	public String toString() {
		return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
	}
	
	

}
