
public class AplicacaoFigura {

	public static void main(String[] args) {

		Figura qua = new Quadrado(15);

		Circulo cir = new Circulo(2.7);
		
		 cir.setRaio(5.4);

		System.out.println(qua);
		System.out.println(cir);
		
		
		
		System.out.println("Área do quadrado é " + qua.calcularArea());
		System.out.println("Área do círculo é " + String.format("%.2f", cir.calcularArea()));
		
	}

}
