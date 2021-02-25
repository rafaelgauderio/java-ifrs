import java.util.Scanner;

public class Professor extends Funcionario {

	String titulacao;
	String areaPesquisa;	

	public Professor() {

	}

	public Professor(String titulacao, String areaPesquisa) {
		super();
		this.titulacao = titulacao;
		this.areaPesquisa = areaPesquisa;
	}

	
	public void lerDados() {

		Scanner s = new Scanner(System.in);
		System.out.println("Informe a titulação do professor: ");
		this.titulacao = s.nextLine();
		System.out.println("Informe a Área de Pesquisa do professor: ");
		this.areaPesquisa = s.nextLine();

	}

	public void mostrarDados() {
		System.out.println("\nDados do Professor");
		System.out.println("Nome do professor: " + this.nome);
		System.out.println("Endereço do professor: " + this.endereco);
		System.out.println("Telefone do professor: " + this.telefone);
		System.out.println("CPF do professor: " + this.cpf);
		System.out.println("CTPS do professor: " + this.ctps);
		System.out.println("Salário do funcionário: " + String.format("R$ %.2f", this.salario));
		System.out.println("Titulacao do professor: " + this.titulacao);
		System.out.println("Área de Pesquisa do Professor: " + this.areaPesquisa);

	}

}
