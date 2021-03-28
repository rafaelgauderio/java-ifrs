import java.util.Locale;

public class Aplicacao {

	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // para usar o ponto e não a virgula como separador decimal.
		int qtdItensDoPedido = 3;
		
		Frios presunto = new Frios();
		presunto.setNome("Presunto sem capa de gordura");
		presunto.setPreco(15.50);
		presunto.setQuantidade(10);
		
		Doces pudim = new Doces();
		pudim.setNome("Pudim de Leite");
		pudim.setPreco(20.80);
		pudim.setQuantidade(2);
		
		Paozinho pao = new Paozinho(4.50,40,"Cacetinho integral");				
	
		Produto[] vetorProduto = new Produto[qtdItensDoPedido];
		vetorProduto[0] = presunto;
		vetorProduto[1] = pudim;
		vetorProduto[2]=pao;
		
		
		for (int i = 0; i < vetorProduto.length; i++) {
			System.out.print(vetorProduto[i]);
		}	
		
			
		System.out.println("\n");		
		Pedido pedido1 = new Pedido();
		pedido1.setProdutos(vetorProduto);
		System.out.println(pedido1);

	}

}
