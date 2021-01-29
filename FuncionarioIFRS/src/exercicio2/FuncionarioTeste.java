package exercicio2;

import exercicio1.Funcionario;

public class FuncionarioTeste {

	public static void main(String args[]) {

		testaFuncionario();

	}

	public static void testaFuncionario() {

		Funcionario f1 = new Funcionario();
		f1.setNome("Rafael De Luca");
		f1.setDepartamento("TI");
		f1.setSalario(1000);
		f1.setRg("3025902578");
		f1.setEstaNaEmpresa(true);

		System.out.println("Salário:" + String.format("%.2f", f1.getSalario()));
		f1.bonifica(100);
		System.out.println("Salário após a bonificação: " + String.format("%.2f", f1.getSalario()));

	}

}
