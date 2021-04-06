
public class Quadrado extends Object implements Figura{

	private double lado;
	
	public Quadrado() {
		
	}
	
	public Quadrado(double lado) {
		this.lado=lado;
	}
	
		
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		double area = lado * lado;		
		return area;
	}

	@Override
	public String toString() {
		return "Quadrado [lado=" + String.format("%.2f", lado) + "m, Área= "+ String.format("%.2f", calcularArea()) + " m² ]";
	}
	
	
	

}
