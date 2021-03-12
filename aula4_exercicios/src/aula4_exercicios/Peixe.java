package aula4_exercicios;

public class Peixe extends Animal {

	private String caracteristica;

	public Peixe() {

	}

	public Peixe(String nome, float comprimento, int numeroDePatas, String cor, String ambiente, float velocidadeMedia,
			String caracteristica) {
		super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia);
		this.caracteristica = caracteristica;

	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public void dadosPeixe() {
		System.out.println("\nDADOS DO PEIXE");
		super.dados();
		System.out.println("Caracterísiticas: " + caracteristica);
	}

}
