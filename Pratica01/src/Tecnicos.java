import java.util.Scanner;

public class Tecnicos extends Funcionario {

	String cargo;
	String departamento;

	public Tecnicos() {

	}

	public Tecnicos(String cargo, String departamento) {
		super();
		this.cargo = cargo;
		this.departamento = departamento;
	}

	public void lerDados() {

		Scanner s = new Scanner(System.in);
		System.out.println("Informe a cargo do Técnico: ");
		this.cargo = s.nextLine();
		System.out.println("Informe o departamento do Técnico: ");
		this.departamento = s.nextLine();

	}

	public void mostrarDados() {
		System.out.println("\nDados do Técnico");
		System.out.println("Nome do técnico: " + this.nome);
		System.out.println("Endereço do técnico: " + this.endereco);
		System.out.println("Telefone do técnico: " + this.telefone);
		System.out.println("CPF do técnico: " + this.cpf);
		System.out.println("CTPS do técnico: " + this.ctps);
		System.out.println("Salário do técnico: " + String.format("R$ %.2f", this.salario));
		System.out.println("Cargo do técnico: " + this.cargo);
		System.out.println("Departamento do Técnico: " + this.departamento);

	}

}
