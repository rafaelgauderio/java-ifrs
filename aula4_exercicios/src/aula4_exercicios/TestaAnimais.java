package aula4_exercicios;

public class TestaAnimais {

	public static void main(String[] args) {

		Peixe tubarao = new Peixe();
		tubarao.setNome("Tubarão");
		tubarao.setComprimento((float) 300.0);
		tubarao.setNumeroDePatas(0);
		tubarao.setCor("Cinzento");
		tubarao.setAmbiente("Mar");
		tubarao.setVelocidadeMedia((float) 1.5);
		tubarao.setCaracteristica("Barbatanas e cauda");

		Mamifero camelo = new Mamifero();
		camelo.setNome("Camelo");
		camelo.setComprimento((float) 150.0);
		camelo.setNumeroDePatas(4);
		camelo.setCor("Amarelo");
		camelo.setAmbiente("Terra");
		camelo.setVelocidadeMedia((float) 2.0);

		Mamifero ursocanada = new Mamifero();

		ursocanada.setNome("Urso-do-canadá");
		ursocanada.setComprimento((float) 180.0);
		ursocanada.setNumeroDePatas(4);
		ursocanada.setCor("Vermelho");
		ursocanada.setAmbiente("Terra");
		ursocanada.setVelocidadeMedia((float) 0.5);
		ursocanada.setAlimento("Mel");

		tubarao.dadosPeixe();
		camelo.dadosMamifero();
		ursocanada.dadosMamifero();

	}

}
