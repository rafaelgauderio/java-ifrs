package exercicio6;

public class FuncionarioTeste {

	public static void main(String[] args) {

		testaFuncionario();

	}

	public static void testaFuncionario() {

		Funcionario func = new Funcionario();
		Data data = new Data();

		func.setNome("Juliana Silva");
		func.setDepartamento("Financeiro");
		func.setSalario(1500.30);
		data.setDia(15);
		data.setMes(8);
		data.setAno(2017);
		func.setDataEntrada(data);

		func.mostra();

	}

}
