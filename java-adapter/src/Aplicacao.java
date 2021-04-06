
public class Aplicacao {
	
	public static void main(String [] args) {
		
		TomadaComFioTerra tomada3 =  new TomadaComFioTerra();
		
		AdapterTomada adaptador = new AdapterTomada(tomada3);
		
		adaptador.desligarDaTomadaSemFioTerra();
		
		adaptador.ligarNaTomadaSemFioTerra();
		
		// Atrav�s do adaptador estamos chamando o m�todo de ligar e desligar uma tomada sem o fio terra, mas
		// na verdade esta chamada foi adaptada para um tomada com o terceiro pino (fio terra). Agora temos duas 
		// interfaces, que n�o eram compat�veis anteriormente conversando entre si.		
				
		
	}

}
