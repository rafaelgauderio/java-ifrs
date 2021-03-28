import java.util.Arrays;

public class Pedido extends Produto {

	private Produto[] produtos;

	public Pedido(Produto[] produtos) {		
		this.produtos = produtos;		
	}

	public Pedido() {
		
	}

	public Produto[] getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto[] podutos) {
		this.produtos = podutos;
	}

	@Override
	public String toString() {
		return "Itens do Pedido\n"+ Arrays.toString(produtos);

	}

}
