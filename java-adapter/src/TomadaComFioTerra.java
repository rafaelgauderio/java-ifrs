
public class TomadaComFioTerra {
	
	public String fioFase;
	public String fioNeutro;
	public String fioTerra;
	
	public TomadaComFioTerra () {
		
	}

	public TomadaComFioTerra(String fioFase, String fioNeutro, String fioTerra) {
		super();
		this.fioFase = fioFase;
		this.fioNeutro = fioNeutro;
		this.fioTerra = fioTerra;
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

	public String getFioTerra() {
		return fioTerra;
	}

	public void setFioTerra(String fioTerra) {
		this.fioTerra = fioTerra;
	}
	
	public void ligarNaTomadaComFioTerra() {
		System.out.println("Ligado na Tomada com fio Terra!");
	}
	
	public void desligarDaTomadaComFioTerra() {
		System.out.println("Deligado da Tomada com fio Terra!");
	}		
	

}
