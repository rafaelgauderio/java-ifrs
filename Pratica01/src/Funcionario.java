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
		System.out.println("\nDigite o nome do Funcionário: ");
		this.nome = s.nextLine();
		System.out.println("Digite o endereço do Funcionário: ");
		this.endereco = s.nextLine();
		System.out.println("Digite o telefone do Funcionário: ");
		this.telefone = s.nextLine();
		System.out.println("Digite o CPF do Funcionário: ");
		this.cpf = s.nextLine();
		System.out.println("Digite a CTPS do Funcionário: ");
		this.ctps = s.nextLine();
		System.out.println("Digite salario do Funcionário: ");
		this.salario = s.nextDouble();

	}

	public void mostrarDados() {
		System.out.println("\nDados do Funcionário");
		System.out.println("Nome do funcionário: " + this.nome);
		System.out.println("Endereço do funcionário: " + this.endereco);
		System.out.println("Telefone funcionário: " + this.telefone);
		System.out.println("CPF do funcionário: " + this.cpf);
		System.out.println("CTPS do funcionário: " + this.ctps);
		System.out.println("Salário do funcionário: " + String.format("R$ %.2f", this.salario));
	}

}
