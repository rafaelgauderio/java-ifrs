
public class AdapterTomada extends TomadaSemFioTerra{
	
	private TomadaComFioTerra tomadaComFioTerra;
	
	public AdapterTomada(TomadaComFioTerra tomadaComFioTerra) {
		this.tomadaComFioTerra=tomadaComFioTerra;	
	}
	
	
	public TomadaComFioTerra getTomadaComFioTerra() {
		return tomadaComFioTerra;
	}


	public void setTomadaComFioTerra(TomadaComFioTerra tomadaComFioTerra) {
		this.tomadaComFioTerra = tomadaComFioTerra;
	}



	public void desligarNaTomadaSemFioTerra() {
		tomadaComFioTerra.desligarDaTomadaComFioTerra();
	}
	
	public void ligarNaTomadaSemFioTerra() {
		tomadaComFioTerra.ligarNaTomadaComFioTerra();
	}

	
}

