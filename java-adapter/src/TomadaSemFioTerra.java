
public class TomadaSemFioTerra {
	private String fioFase;
	private String fioNeutro;
	
	public TomadaSemFioTerra() {
		
	}
	
	public TomadaSemFioTerra(String fioFase, String fioNeutro) {
		this.fioFase = fioFase;
		this.fioNeutro = fioNeutro;
	}

	public String getFioFase() {
		return fioFase;
	}

	public void setFioFase(String fioFase) {
		this.fioFase = fioFase;
	}

	public String getFioNeutro() {
		return fioNeutro;
	}

	public void setFioNeutro(String fioNeutro) {
		this.fioNeutro = fioNeutro;
	}
	
	
	public void ligarNaTomadaSemFioTerra() {
		System.out.println("ligado na Tomada sem fio Terra");
	}
	
	public void desligarDaTomadaSemFioTerra() {
		System.out.println("Deligado da Tomada sem fio Terra");
	}	
	
	

}
