package exercicio10;

public class PortaTest {

	public static void main(String[] args) {
		
			testarPorta();
	}
	
	public static void testarPorta(){
		
		Porta porta = new Porta();
		porta.setAberta(false);
		porta.setCor("Verde");
		porta.setDimensaoX(2.2);
		porta.setDimensaoY(3.5);
		porta.setDimensaoZ(1.85);
		
		System.out.println(porta);
		
		porta.abre();		
		System.out.println("A porta se enconstra aberta? " +porta.estaAberta());
		porta.fecha();
		System.out.println("A porta se enconstra aberta? " +porta.estaAberta());
		
		
		porta.setDimensaoX(3.35);
		porta.setDimensaoY(2.30);
		porta.setDimensaoZ(4.25);
		porta.pinta("Branco e Preto");
		System.out.println(porta);
		
		if (porta.estaAberta()==true) {
			System.out.println("A porta está aberta!");
		}
		else {
			System.out.println("A porta está fechada!");
		}
		
		System.out.println("A área da porta: "+ String.format("%.2f",porta.areaPorta())+" m²");
		System.out.println("O volume da porta: "+ String.format("%.2f",porta.volumePorta())+" m³");
				
			
	}

}
