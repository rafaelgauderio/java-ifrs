
public class Quadrado extends Figura {

	private double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	
	
	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}



	public double calcularArea() {
		double area = lado * lado;
		return area;
	}

	@Override
	public String toString() {
		return "Quadrado [lado=" + lado + "]";
	}
		

}
