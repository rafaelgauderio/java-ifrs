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
		System.out.println("Informe a cargo do T�cnico: ");
		this.cargo = s.nextLine();
		System.out.println("Informe o departamento do T�cnico: ");
		this.departamento = s.nextLine();

	}

	public void mostrarDados() {
		System.out.println("\nDados do T�cnico");
		System.out.println("Nome do t�cnico: " + this.nome);
		System.out.println("Endere�o do t�cnico: " + this.endereco);
		System.out.println("Telefone do t�cnico: " + this.telefone);
		System.out.println("CPF do t�cnico: " + this.cpf);
		System.out.println("CTPS do t�cnico: " + this.ctps);
		System.out.println("Sal�rio do t�cnico: " + String.format("R$ %.2f", this.salario));
		System.out.println("Cargo do t�cnico: " + this.cargo);
		System.out.println("Departamento do T�cnico: " + this.departamento);

	}

}
