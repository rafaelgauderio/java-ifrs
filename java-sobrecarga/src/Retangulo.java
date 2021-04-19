
public class Retangulo extends Object implements Figura {

	private double base;
	private double altura;

	public Retangulo() {

	}

	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		double area = base * altura;
		return area;
	}
	
	@Override
	public String toString() {
		return "Retângulo [Base=" + String.format("%.2f", base) + "m ,Altura= "+ String.format("%.2f", altura) + "m, Área= "+ String.format("%.2f", calcularArea()) + " m² ]";
	}
	
	
	

}
