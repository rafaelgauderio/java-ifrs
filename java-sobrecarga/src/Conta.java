
public class Conta {

	private double saldo;

	public Conta() {

	}

	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [saldo=" + String.format("r$ %.2f",saldo) + "]";
	}
	
	
	public String toString2() {
		return "saldo = " + this.saldo;
	}
	
	public String toString(String prefixo) {
		return prefixo + ":" + toString();
	}
	

}
