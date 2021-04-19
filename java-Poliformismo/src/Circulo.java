
public class Circulo extends Figura {

	private static final double PI = 3.141592;

	private double raio;

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {

		double area = PI * raio * raio;
		return area;
	}

	@Override
	public String toString() {
		return "Circulo [raio=" + raio + "]";
	}

}
