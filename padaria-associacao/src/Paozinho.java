
public class Paozinho extends Produto {

	private String nome;

	public Paozinho() {
		super();

	}

	public Paozinho(double preco, int quantidade, String nome) {
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
		return "Paozinho [nome= " + nome + ", preço(por unidade)= " + String.format("R$ %.2f", super.getPreco()) + ", quantidade= "
				+ getQuantidade() + ", total item= " + String.format("R$ %.2f", super.totalPedido())+ "]\n";
	}

}
