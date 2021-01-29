package exercicio4;

import exercicio1.Funcionario;

public class FuncionarioTeste {

	public static void main(String[] args) {

		testaFuncionario();		
		System.out.println("-------------------------------------------------------------");
		testaFuncionariosIguais();
	}

	public static void testaFuncionario() {

		Funcionario func = new Funcionario();
		func.setNome("Jo�o da Silva Costa");
		func.setDepartamento("Vendas");
		func.setSalario(1000);
		func.setDataEntrada("17/05/2019");
		func.setRg("3025902545");
		func.setEstaNaEmpresa(true);

		func.bonifica(500);
		func.mostra();

	}

	public static void testaFuncionariosIguais() {

		Funcionario f1 = new Funcionario();
		f1.setNome("Jo�o");
		f1.setSalario(100);
		Funcionario f2 = new Funcionario();
		f2.setNome("Jo�o");
		f2.setSalario(100);

		Funcionario f3 = new Funcionario();
		f3.setNome("Rafael");
		f3.setSalario(400);

		Funcionario f4 = new Funcionario("Rafael", 400);

		if (f1.igual(f2)) {
			System.out.println("Os funcion�rios s�o IGUAIS");
		} else {
			System.out.println("Os funcion�rio s�o DIFERENTES");
		}

		if (f1.igual(f3)) {
			System.out.println("Os funcion�rios s�o IGUAIS");
		} else {
			System.out.println("Os funcion�rio s�o DIFERENTES");
		}

		if (f1.igual(null)) {
			System.out.println("Os funcion�rios s�o IGUAIS");
		} else {
			System.out.println("Os funcion�rio s�o DIFERENTES");
		}

		if (f3.igual(f4)) {
			System.out.println("Os funcion�rios s�o IGUAIS");
		} else {
			System.out.println("Os funcion�rio s�o DIFERENTES");
		}

	}

}
