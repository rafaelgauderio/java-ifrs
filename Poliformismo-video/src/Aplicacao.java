
public class Aplicacao {
	
	public static void main(String [] args) {
		
		
		Video vetorVideo[] = new Video[3];
		
		// setando apenas o título do video
		vetorVideo[0] = new Video("Aula 01 - HTML");
		vetorVideo[1] = new Video("Aula 02 - PHP");
		vetorVideo[2] = new Video("Aula 03 - POO");
		
		Aluno vetorAluno [] = new Aluno[2];
		
		vetorAluno[0]= new Aluno("Rafael De Luca", 35,"Masculino",0, "rafa" );
		vetorAluno[1] = new Aluno("Juliana da Silva", 23, "Feminino", 0 , "juju");
		
		Visualizacao vis[] = new Visualizacao[3];
		vis[0] = new Visualizacao(vetorAluno[0], vetorVideo[2]);
		vis[0].avaliar();
		
		vis[1] = new Visualizacao(vetorAluno[1], vetorVideo[1]);
		vis[1].avaliar(85.0f);
		
		vis[2] = new Visualizacao(vetorAluno[1], vetorVideo[0]);
		vis[2].avaliar(15);
		vetorVideo[0].setCurtidas(15);
		vetorVideo[0].setViews(7);
		
		
		for (int i=0; i<vis.length ; i++) {
			System.out.println(vis[i].toString()+"\n");
		}
		
		
		
		
	}

}
