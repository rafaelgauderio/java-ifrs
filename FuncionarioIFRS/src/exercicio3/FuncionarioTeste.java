package exercicio3;

import exercicio1.Funcionario;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		testaFuncionario();

	}

	public static void testaFuncionario() {

		Funcionario f1 = new Funcionario();
		f1.setNome("João da Silva Costa");
		f1.setDepartamento("Vendas");
		f1.setSalario(1000);
		f1.setDataEntrada("17/05/2019");
		f1.setRg("3025902545");
		f1.setEstaNaEmpresa(true);
		
		f1.bonifica(500);
		f1.mostra();

	}
}
