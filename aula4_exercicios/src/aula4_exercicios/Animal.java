package aula4_exercicios;

public class Animal {

	private String nome;
	private float comprimento;
	private int numeroDePatas;
	private String cor;
	private String ambiente;
	private float velocidadeMedia;

	// construtor vazio
	public Animal() {

	}

	// construtor com argumentos
	public Animal(String nome, float comprimento, int numeroDePatas, String cor, String ambiente,
			float velocidadeMedia) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.numeroDePatas = numeroDePatas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidadeMedia = velocidadeMedia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public int getNumeroDePatas() {
		return numeroDePatas;
	}

	public void setNumeroDePatas(int numeroDePatas) {
		this.numeroDePatas = numeroDePatas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public float getVelocidadeMedia() {
		return velocidadeMedia;
	}

	public void setVelocidadeMedia(float velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}

	public void dados() {
		System.out.println("Nome: " + nome + "\nComprimento(cm): " + String.format("%.2f", comprimento)
				+ "\nNúmero de Patas: " + numeroDePatas + "\nCor: " + cor + "\nAmbiente: " + ambiente
				+ "\nVelocidade Média(m/s): " + String.format("%.2f", velocidadeMedia));
	}

}
