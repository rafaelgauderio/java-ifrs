
public class Principal {
	
	public static void main(String [] args) {
		
		Cliente rafael = new Cliente();
		rafael.setNome("Rafael De Luca");
		rafael.setIdade(31);
		rafael.setEndereco("Av. Brasil, 35, Centro");
		rafael.setProduto("Camiseta");
		rafael.setValor(45.50);
		
		System.out.println(rafael);
		
		
		Vendedor joao = new Vendedor();
		joao.setNome("João de Souza");
		joao.setIdade(42);
		joao.setEndereco("Rua Berlinda 98, apto: 302, Guajuviras");
		joao.setSalario(4500.99);
		
		
		System.out.println(joao);		
		joao.fazAniversario();
		joao.fazAniversario();
		
		
	}

}
