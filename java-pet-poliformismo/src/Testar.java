import java.util.ArrayList;
import java.util.Scanner;

public class Testar {

	public static ArrayList<Animal> lista = new ArrayList<>();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Gato gato1 = new Gato();
		gato1.setNome("Xaninho");
		gato1.setPeso(1.5f);
		gato1.setRaca("Siames");
		
		Cachorro cachorro1 = new Cachorro();
		System.out.println("Informe o nome do cachorro");
		cachorro1.setNome(scan.nextLine());
		System.out.println("Informe o peso do cachorro");
		cachorro1.setPeso(Double.parseDouble(scan.nextLine()));		
		System.out.println("Informe a Raça do cachorro");
		cachorro1.setRaca(scan.nextLine());
		
		Passarinho passarinho1 = new Passarinho();
		System.out.println("Informe o nome do passarinho");
		passarinho1.setNome(scan.nextLine());		
		System.out.println("Informe o peso do passarinho");
		passarinho1.setPeso(Double.parseDouble(scan.nextLine()));		
		System.out.println("Informe a Raça do passarinho");
		passarinho1.setRaca(scan.nextLine());

		lista.add(gato1);
		lista.add(cachorro1);
		lista.add(passarinho1);

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).toString());
		}
		
		scan.close();

	}

}
