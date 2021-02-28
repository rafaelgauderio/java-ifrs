import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		dadosPessoas();

	}

	public static void dadosPessoas() {

		Scanner sc = new Scanner(System.in);

		Pessoa pessoa;
		List<Pessoa> listaPessoas = new ArrayList<>();
		Pessoa pessoa1 = new Pessoa(4052, "Rafael De Luca", 35);
		Pessoa pessoa2 = new Pessoa(5698, "Cristia de Souza", 23);
		listaPessoas.add(pessoa1);
		listaPessoas.add(pessoa2);

		int escolha = 0;

		// criando o meunu
		do {
			System.out.println("MENU\n\n## Escolha uma op��o informando um n�mero entre 1 e 3 ##");
			System.out.println("Op��o 1 - Cadastra Usu�rio");
			System.out.println("Op��o 2 - Imprime usu�rios cadastrados");
			System.out.println("Op��o 3 - SAIR do programa");
			System.out.println("__________________________________________________");
			System.out.print("Informe aqui sua op��o: ");
			escolha = Integer.parseInt(sc.nextLine());

			// Criando um novo objeto do tipo Pessoa
			if (escolha == 1) {

				pessoa = new Pessoa();
				System.out.println("Informe o codigo do usupario: ");
				pessoa.setCodigo(Integer.parseInt(sc.nextLine()));

				System.out.println("Informe o nome do usu�rio: ");
				pessoa.setNome(sc.nextLine());

				System.out.println("Informe a idade do usu�rio: ");
				pessoa.setIdade(Integer.parseInt(sc.nextLine()));

				// guardando o objeto Pessoa na lista
				listaPessoas.add(pessoa);

			} else if (escolha == 2) {
				if (listaPessoas.isEmpty()) {
					System.out.println("\nN�o existem usu�rios Cadastrados");
					sc.nextLine();
				} else {

					/*
					 * for (int i = 0; i < listaPessoas.size(); i++) {
					 * System.out.println(listaPessoas); *
					 */
					System.out.println(listaPessoas.toString());

					System.out.println("Pressione ENTER para continuar");
					sc.nextLine();

				}

			}

		} while (escolha != 3);

		sc.close();

		System.out.println("\nPROGRAMA FINALIZADO");

	}
}
