
public class Aplicacao {
	
	public static void main(String [] args) {
		
		
		Pessoa [] vetPessoas = new Pessoa[2];
		
		Livro [] vetLivros = new Livro[3];
		
		vetPessoas[0] = new Pessoa("Rafael De Luca", 31,"M");
		vetPessoas[1] = new Pessoa("Maria da Silva",25, "F");
		
		vetLivros[0] = new Livro("Aprendendo Java", "João da Silva",300,vetPessoas[0]);
		vetLivros[1] = new Livro("Java Plus", "Maria escritora", 500,vetPessoas[1]);
		vetLivros[2] = new Livro("Bíblia do Java", "Aragão de Souza", 400, vetPessoas[0]);
		
		vetLivros[0].abrir();
		vetLivros[0].folhear(150);
		
		vetLivros[1].abrir();
		vetLivros[1].folhear(120);
		vetLivros[1].avancarPag();
		vetLivros[1].avancarPag();
		vetLivros[1].avancarPag();
		
		
		System.out.println(vetLivros[0].detalhes());
		
		System.out.println("\n");
		
		System.out.println(vetLivros[1].detalhes());
		
		System.out.println("\n");
		System.out.println(vetLivros[2].detalhes());
		
		
		
		
	}

}
