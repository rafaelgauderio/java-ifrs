
public class AplicacaoFigura {

	public static void main(String [] args) {
		
		Object obj = new Quadrado(5);
		// variável do tipo Object recebe qualquer objeto que seja de um tipo que estenda Object
		
		Figura fig = new Quadrado(6);
		// variável do tipo Figura recebe qualquer objeto que seja do tipo figura
		
		Object obj2= fig;
		// variável do tipo Object recebe qualquer váriável cujo tipo seja uma interface
		
		Retangulo ret = new Retangulo(7.5,9);
		
		System.out.println(obj);
		System.out.println(fig);
		System.out.println(obj2);		
		System.out.println(ret);
		
		
		
		
	}
	
}
