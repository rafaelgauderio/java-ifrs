
public class AplicacaoConta {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		c1.setSaldo(300.50);
		
		Conta c2 = new Conta(500);
		
		System.out.println(c1);
		System.out.println(c1.toString2());
		
		System.out.println(c2);		
		System.out.println(c2.toString("Saldo da conta 69048-3"));
		
		

	}

}
