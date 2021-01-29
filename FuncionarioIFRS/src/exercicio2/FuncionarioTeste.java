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
		f1.setDataEntrada("17/05/2018");
		f1.setRg("3025902578");
		f1.setEstaNaEmpresa(true);

		System.out.println("Sal�rio:" + String.format("R$ %.2f", f1.getSalario()));
		f1.bonifica(100);
		System.out.println("Sal�rio ap�s a bonifica��o: " + String.format("R$%.2f", f1.getSalario()));
		
		System.out.println("\nDADOS DO FUNCION�RIO\nNome do funcion�rio: " + f1.getNome()+"\nDepartamento: " +f1.getDepartamento()
		+"\nSal�rio: "+ String.format("R$%.2f", f1.getSalario()) + "\nData de entrada na empresa: "+f1.getDataEntrada()
		+"\nRG: " + f1.getRg()+"\nFuncion�rio est� trabalhando: " + f1.getEstaNaEmpresa());
		
		f1.demite();
		f1.situacaoFuncionaio();
		f1.desconta(350.25);
		System.out.println("Sal�rio:" + String.format("R$%.2f", f1.getSalario()));

		
	}

}
