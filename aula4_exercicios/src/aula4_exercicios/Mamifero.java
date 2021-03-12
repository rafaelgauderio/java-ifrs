package aula4_exercicios;

public class Mamifero extends Animal {

	private String alimento;

	public Mamifero() {

	}

	public Mamifero(String nome, float comprimento, int numeroDePatas, String cor, String ambiente,
			float velocidadeMedia, String alimento) {
		super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia);
		this.alimento = alimento;

	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {

		this.alimento = alimento;

	}

	public void dadosMamifero() {
		if (alimento == null) {
			alimento = "Atributo não informado";
			System.out.println("\nDADOS DO MAMÍFERO");
			super.dados();
			System.out.println("Alimento: " + alimento);
		} else {
			System.out.println("\nDADOS DO MAMÍFERO");
			super.dados();
			System.out.println("Alimento: " + alimento);
		}

	}

}
