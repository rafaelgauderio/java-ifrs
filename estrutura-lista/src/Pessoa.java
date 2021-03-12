
public class Pessoa {

	private Integer codigo;
	private String nome;
	private Integer idade;

	public Pessoa() {

	}

	public Pessoa(Integer codigo, String nome, Integer idade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.idade = idade;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {

		return "Código: " + codigo + ", nome: " + nome + ", idade: " + idade + "\n";
	}
}
