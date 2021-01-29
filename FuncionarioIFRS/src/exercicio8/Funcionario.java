package exercicio8;

public class Funcionario {

	private String nome;
	private String departamento;
	private double salario;
	private Data dataEntrada;
	private String rg;
	private boolean estaNaEmpresa;

	// construtor vazio
	public Funcionario() {

	}

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;

	}

	// construtor com argumento
	public Funcionario(String nome, String departamento, double salario, Data dataEntrada, String rg,
			boolean estaNaEmpresa) {
		super();
		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
		this.dataEntrada = dataEntrada;
		this.rg = rg;
		this.estaNaEmpresa = estaNaEmpresa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Data getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Data dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public boolean getEstaNaEmpresa() {
		return estaNaEmpresa;
	}

	public void setEstaNaEmpresa(boolean estaNaEmpresa) {
		this.estaNaEmpresa = estaNaEmpresa;

	}

	public void bonifica(double argumento) {

		this.salario = this.salario + argumento;

	}

	public void desconta(double argumento) {
		this.salario = this.salario - argumento;
	}

	public void demite() {
		if (this.estaNaEmpresa == true) {
			this.estaNaEmpresa = false;
			System.out.println("O funcionário foi demitido.");
		} else {
			System.out.println("O funcionário já não pertence ao quadro de funcionários.");
		}

	}

	public void situacaoFuncionaio() {
		if (this.estaNaEmpresa == true) {
			System.out.println("Funcionário está trabalhando na empresa.");
		} else {
			System.out.println("Funcionário NÃO faz mais parte da equipe.");
		}

	}

	public void mostra() {
		System.out.println("DADOS FO FUNCIONÁRIO\nNome: " + this.nome + "\nDepartamento: " + this.departamento
				+ "\nSalario: " + String.format("R$%.2f", this.salario) + "\nData de Entrada: " + this.dataEntrada.formatada()
				+ "\nRG: " + this.rg + "\nFuncionário está trabalhando na empresa: " + this.estaNaEmpresa);

	}

	public boolean igual(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario outro = (Funcionario) obj;
		if (nome == null) {
			if (outro.nome != null)
				return false;
		} else if (!nome.equals(outro.nome))
			return false;
		if (Double.doubleToLongBits(salario) != Double.doubleToLongBits(outro.salario))
			return false;
		return true;
	}

	
}
