
public class Doces extends Produto {

	private String nome;

	public Doces() {
		super();

	}

	public Doces(double preco, int quantidade, String nome) {
		super(preco, quantidade);
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Doces [nome= " + nome + ", preço(por unidade)= " + String.format("R$ %.2f", super.getPreco()) + ", quantidade= "
				+ getQuantidade() + ", total item= " + String.format("R$ %.2f", super.totalPedido())+ "]\n";
	}

}
