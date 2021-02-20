
public abstract class Pessoa {
	
	private String nome;
	private byte idade;
	private String email;
	private String endereco;
	
	public Pessoa () {
		
	}

	public Pessoa(String nome, byte idade, String email, String endereco) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public byte getIdade() {
		return idade;
	}

	public void setIdade(byte idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", idade=" + idade + ", email=" + email + ", endereco=" + endereco +"]";
	}
	
	

}
