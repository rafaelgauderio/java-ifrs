
public class Data {
	
	private int dia;
	private String mes;
	private long ano;
	
	//parametro ano pode ser int, char ou byte que faz a convers�o impl�cita
	
	public Data(int dia, String mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano=ano;
	}
	
	public Data(String mes, int dia, long ano) {
		this.mes=mes;
		this.dia=dia;		
		this.ano=ano;
	}

	@Override
	public String toString() {
		return "dia " + dia + " de " + mes + " de " + ano;
	}
	

}
