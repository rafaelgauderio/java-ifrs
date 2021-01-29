package exercicio8;

public class FuncionarioTeste {

	public static void main(String[] args) {

		testaDataDeEntrada();

	}

	public static void testaDataDeEntrada() {

		Funcionario func = new Funcionario();
		Data data = new Data();

		func.setNome("Veridiana Pereira Neto");
		func.setDepartamento("Financeiro");
		func.setSalario(7500.30);
		func.setRg("40578987");
		func.setEstaNaEmpresa(true);
		func.setDataEntrada(data);
		func.mostra();

		System.out.println("---------------------------------------------------");

		data.setDia(31);
		data.setMes(12);
		data.setAno(2017);
		func.setDataEntrada(data);

		func.mostra();

	}

}
