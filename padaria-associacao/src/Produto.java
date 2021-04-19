
public abstract class Produto {

	// um produto não pode ser instanciodo só com preço e quantidade, tem que ser
	// instanciado com um atributo nome
	// através das subClasses

	private double preco;
	private int quantidade;

	public Produto() {

	}

	public Produto(double preco, int quantidade) {
		this.preco = preco;
		this.quantidade = quantidade;

	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double totalPedido() {
		double total = 0;
		total += quantidade * preco;
		return total;
	}

}
