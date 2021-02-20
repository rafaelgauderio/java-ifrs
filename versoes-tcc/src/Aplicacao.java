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
		carlos.setTitulacao("Doutor em Matem�tica");
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

		String titulo = "Trabalho de conclus�o sobre circuitos l�gicos";
		String introducao1 = "INTRODU��O\nO trabalho de conclus�o refere-se a uma an�lise sobre circuitos l�gicos digitais.";
		String objetivo1 = "OBJETIVOS\nO presente TCC tem por objetivo fazer an�lise de circutitos digitais atr�ves de testes em um circuito integrado.";
		String desenvolvimento1 = "DESENVOLVIMENTO\nPrimeira linha referente ao desenvolvimento do TCC.";
		String testes1 = "TESTES\nCorrente medida = 2.3 amperes";
		String testes2 = "Voltagem=3.5 Volts";
		String conclusao1 = "CONCLUS�O\nPodemos concluir que os resultados foram satistat�rios, conforme o planejamento.";

		ArrayList<String> conteudo = new ArrayList<String>();
		conteudo.add(titulo);
		conteudo.add(introducao1);
		conteudo.add(objetivo1);
		conteudo.add(desenvolvimento1);
		conteudo.add(testes1);
		conteudo.add(testes2);
		conteudo.add(conclusao1);

		// Imprimendo os dados do TCC (dados do aluno e Orientador)
		System.out.println(tcc);

		rafael.entregarEtapa();
		rafael.atualizarCronograma();
		rafael.AvisarProfessor();
		tcc.setVersao(3);

		System.out.println(tcc);

		// Imprimindo o conteudo do TCC via ArrayList
		for (int i = 0; i < conteudo.size(); i++) {
			System.out.println(conteudo.get(i));
		}

		// Imprimndo utilizando a classe TccConteudo
		TccConteudo conteudoTcc = new TccConteudo(introducao1, objetivo1, desenvolvimento1, testes1, conclusao1);
		System.out.println(conteudoTcc);

	}

}
