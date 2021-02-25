
public class Principal {

	public static void main(String[] args) {
		
		//Instanciando objetos e setando valores 
		Curso curso01 = new Curso();
		curso01.lerDados();

		Aluno aluno01 = new Aluno();
		aluno01.lerDados();
		aluno01.curso = curso01;		

		Funcionario funcionario01 = new Funcionario();
		funcionario01.lerDados();	
		Funcionario funcionario02 = new Funcionario("Ana Maria", "Av. Principal 120, Centro", "51-92847456","001.026.635-15","98850126",4500.25);
		Funcionario funcionario03 = new Funcionario("Mario Pereira de Souza", "Av. Brasil 35, Centro", "51-993654854","450.026.635-13","37900115",7300.50); 
		
		
		Professor professor01 = new Professor();
		professor01.lerDados();
		professor01.nome=funcionario02.nome;
		professor01.endereco=funcionario02.endereco;
		professor01.telefone=funcionario02.telefone;
		professor01.cpf=funcionario02.cpf;
		professor01.ctps=funcionario02.ctps;		
		professor01.salario=funcionario02.salario;
		
				
		Tecnicos tecnicos01 = new Tecnicos();
		tecnicos01.lerDados();
		tecnicos01.nome=funcionario03.nome;
		tecnicos01.endereco=funcionario03.endereco;
		tecnicos01.telefone=funcionario03.telefone;
		tecnicos01.cpf=funcionario03.cpf;
		tecnicos01.ctps=funcionario03.ctps;
		tecnicos01.salario=funcionario03.salario;
		
		Disciplina disciplina01 = new Disciplina();
		disciplina01.lerDados();
		disciplina01.professor=professor01;
		disciplina01.curso=curso01;
		
		//imprimindo no console os valores
		curso01.mostrarDados();
		aluno01.mostrarDados();
		funcionario03.mostrarDados();
		professor01.mostrarDados();
		tecnicos01.mostrarDados();
		disciplina01.mostrarDados();
		
		
	}

}
