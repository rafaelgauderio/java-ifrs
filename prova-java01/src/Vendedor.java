
public class Vendedor extends Pessoa {

	private Double salario;

	public Vendedor() {

	}

	public Vendedor(Double salario) {
		this.salario = salario;
	}

	public Vendedor(String nome, int idade, String endereco, Double salario) {
		super(nome, idade, endereco);
		this.salario = salario;

	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void fazAniversario() {
		super.setIdade(getIdade()+1);
		System.out.println("\nParab�ns " + super.getNome() + ", voc� est� de anivers�rio!\nAgora voc� tem "+ super.getIdade()+ " anos.");
	}

	@Override
	public String toString() {
		return "\nPessoa [Nome= " + super.getNome() + ", idade= " + super.getIdade() + ", endere�o= "
				+ super.getEndereco() + "]" + "\nVendedor [salario= " + String.format("R$ %.2f", salario)+ "]";
	}

}
