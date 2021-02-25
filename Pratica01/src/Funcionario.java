import java.util.Scanner;

public class Funcionario {

	String nome;
	String endereco;
	String telefone;
	String cpf;
	String ctps;
	double salario;

	public Funcionario() {

	}

	public Funcionario(String nome, String endereco, String telefone, String cpf, String ctps, double salario) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
		this.ctps = ctps;
		this.salario = salario;
	}

	public void lerDados() {

		Scanner s = new Scanner(System.in);
		System.out.println("\nDigite o nome do Funcion�rio: ");
		this.nome = s.nextLine();
		System.out.println("Digite o endere�o do Funcion�rio: ");
		this.endereco = s.nextLine();
		System.out.println("Digite o telefone do Funcion�rio: ");
		this.telefone = s.nextLine();
		System.out.println("Digite o CPF do Funcion�rio: ");
		this.cpf = s.nextLine();
		System.out.println("Digite a CTPS do Funcion�rio: ");
		this.ctps = s.nextLine();
		System.out.println("Digite salario do Funcion�rio: ");
		this.salario = s.nextDouble();

	}

	public void mostrarDados() {
		System.out.println("\nDados do Funcion�rio");
		System.out.println("Nome do funcion�rio: " + this.nome);
		System.out.println("Endere�o do funcion�rio: " + this.endereco);
		System.out.println("Telefone funcion�rio: " + this.telefone);
		System.out.println("CPF do funcion�rio: " + this.cpf);
		System.out.println("CTPS do funcion�rio: " + this.ctps);
		System.out.println("Sal�rio do funcion�rio: " + String.format("R$ %.2f", this.salario));
	}

}
