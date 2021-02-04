package exercicio9;

public class CasaTest {

	public static void main(String[] args) {
		
		testarCasa();

	}

	public static void testarCasa() {
		Casa casa = new Casa();
		casa.setCor("Azul Forte");
		casa.setPorta1(1);
		casa.setPorta2(1);
		casa.setPorta3(1);

		// Setando 1 a porta está fechada, setado 0 a porta está aberta

		System.out.println("Cor da casa: " + casa.getCor());
		System.out.println("Numero de portas Abertas: " + casa.quantasPortasEstãoAbertas());

		casa.abrePorta(1);
		casa.abrePorta(2);
		casa.abrePorta(3);
		System.out.println("Numero de portas Abertas: " + casa.quantasPortasEstãoAbertas());
		casa.fechaPorta(1);
		casa.fechaPorta(3);
		System.out.println("Numero de portas Abertas: " + casa.quantasPortasEstãoAbertas());
		casa.abrePorta(1);
		System.out.println("Numero de portas Abertas: " + casa.quantasPortasEstãoAbertas());

		casa.pinta("Amarelo");
		System.out.println("Nova cor da casa depois da pintura: " + casa.getCor());

	}

}
