
public class Cliente extends Pessoa {

	private String produto;
	private double valor;

	public Cliente() {

	}

	public Cliente(String nome, int idade, String endereco, String produto, double valor) {
		super(nome, idade, endereco);
		this.produto = produto;
		this.valor = valor;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "\nPessoa [Nome= " + super.getNome() + ", idade= " + super.getIdade() + ", endereço= "
				+ super.getEndereco() + "]" + "\nCliente [produto= " + produto + ", valor= " + String.format("R$ %.2f", valor)+ "]";
	}

}
