import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Aplicacao {

	public static void main(String[] args) {

		Orientador carlos = new Orientador();
		carlos.setNome("Carlos Silva");
		carlos.setIdade((byte) 52);
		carlos.setEmail("carlos52@gmail.com");
		carlos.setEndereco("Av. Luzitana, 458, Igara");
		carlos.setTitulacao("Doutor em Matemática");
		carlos.setNumeroOrientados((byte) 2);

		Aluno rafael = new Aluno();
		rafael.setNome("Rafael De Luca");
		rafael.setEmail("rafael17@gmail.com");
		rafael.setEndereco("Rua Brasil, 175, Centro");
		rafael.setIdade((byte) 31);
		rafael.setMatricula(194567);
		rafael.setCurso("Engenharia Civil");
		rafael.setOrientador(carlos);

		Tcc tcc = new Tcc();
		tcc.setVersao(1);
		tcc.setAluno(rafael);
		tcc.setOrientador(carlos);
		
		/*Fiz várias Strings para cada paráfrafo de cada item de TCC (introducao1, introducao2, testes1...) e depois
		*concatenar os mesmos em uma lista ou em uma Classe chamada Tccconteudo, mas interessante que criar um vetor, pois
		*não tem como saber de antemão quantos parágrafos vai ter cada item do TCC.
		*/

		String titulo = "Trabalho de conclusão sobre circuitos lógicos";
		String introducao1 = "INTRODUÇÃO\nO trabalho de conclusão refere-se a uma análise sobre circuitos lógicos digitais.";
		String objetivo1 = "OBJETIVOS\nO presente TCC tem por objetivo fazer análise de circutitos digitais atráves de testes em um circuito integrado.";
		String desenvolvimento1 = "DESENVOLVIMENTO\nPrimeira linha referente ao desenvolvimento do TCC.";
		String testes1 = "TESTES\nCorrente medida = 2.3 amperes";
		String testes2 = "Voltagem=3.5 Volts";
		String conclusao1 = "CONCLUSÃO\nPodemos concluir que os resultados foram satistatórios, conforme o planejamento.";

		ArrayList<String> conteudo = new ArrayList<String>();
		conteudo.add(titulo);
		conteudo.add(introducao1);
		conteudo.add(objetivo1);
		conteudo.add(desenvolvimento1);
		conteudo.add(testes1);
		conteudo.add(testes2);
		conteudo.add(conclusao1);

		// Imprimindo os dados do TCC (dados do aluno e Orientador)i
		System.out.println(tcc);

		//Chamandos os métodos criados na classe Aluno
		rafael.entregarEtapa();
		rafael.atualizarCronograma();
		rafael.AvisarProfessor();
		tcc.setVersao(3);

		//Imprimindo dados após a alteração de versão
		System.out.println(tcc);

		// Imprimindo o conteudo do TCC via ArrayList
		for (int i = 0; i < conteudo.size(); i++) {
			System.out.println(conteudo.get(i));
		}

		// Setando itens do TCC e Imprimindo utilizando a classe TccConteudo
		ConteudoTcc conteudoTcc = new ConteudoTcc();
		conteudoTcc.setIntroducao(introducao1);
		conteudoTcc.setObjetivo(objetivo1);
		conteudoTcc.setDesenvolvimento(desenvolvimento1);
		conteudoTcc.setTestes(testes1+"\n"+testes2);
		conteudoTcc.setConclusao(conclusao1);
		
		System.out.println(conteudoTcc);

	}

}
