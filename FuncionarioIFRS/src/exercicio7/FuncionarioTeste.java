package exercicio7;

import exercicio1.Funcionario;

public class FuncionarioTeste {

	public static void main(String[] args) {

		testaFuncionariosIguais();
		testaFuncionariosLevementeDiferentes();
		testaFuncionariosLevementeDiferentes2();
	}

	public static void testaFuncionariosIguais() {

		Funcionario f1 = new Funcionario();
		f1.setNome("Camila");
		f1.setSalario(100);

		Funcionario f2 = new Funcionario();
		f2.setNome("Camila");
		f2.setSalario(100);

		if (f1.igual(f2)) {
			System.out.println("Os funcionários são IGUAIS");
		} else {
			System.out.println("Os funcionário são DIFERENTES");
		}

	}

	public static void testaFuncionariosLevementeDiferentes() {
		Funcionario f1 = new Funcionario();
		f1.setNome("camila");
		f1.setSalario(100);

		Funcionario f2 = new Funcionario();
		f2.setNome("Camila");
		f2.setSalario(100);

		if (f1.igual(f2)) {
			System.out.println("Os funcionários são IGUAIS");
		} else {
			System.out.println("Os funcionário são DIFERENTES");
		}

	}

	public static void testaFuncionariosLevementeDiferentes2() {

		Funcionario f1 = new Funcionario();
		f1.setNome("camila");
		f1.setSalario(100);

		Funcionario f2 = new Funcionario();
		f2.setNome("Camila");
		f2.setSalario(1000);

		if (f1.igual(f2)) {
			System.out.println("Os funcionários são IGUAIS");
		} else {
			System.out.println("Os funcionário são DIFERENTES");
		}

	}

}
