package exercicio10;

public class Porta {

	private boolean aberta;
	private String cor;
	private double dimensaoX;
	private double dimensaoY;
	private double dimensaoZ;
	
	public Porta() {

	}

	public Porta(boolean aberta, String cor, double dimensaoX, double dimensaoY, double dimensaoZ) {
		super();
		this.aberta = aberta;
		this.cor = cor;
		this.dimensaoX = dimensaoX;
		this.dimensaoY = dimensaoY;
		this.dimensaoZ = dimensaoZ;
	}

	public boolean isAberta() {
		return aberta;
	}

	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getDimensaoX() {
		return dimensaoX;
	}

	public void setDimensaoX(double dimensaoX) {
		this.dimensaoX = dimensaoX;
	}

	public double getDimensaoY() {
		return dimensaoY;
	}

	public void setDimensaoY(double dimensaoY) {
		this.dimensaoY = dimensaoY;
	}

	public double getDimensaoZ() {
		return dimensaoZ;
	}

	public void setDimensaoZ(double dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}

	public void abre() {
		this.aberta = true;
	}

	public void fecha() {
		this.aberta = false;
	}

	public void pinta(String novaCor) {
		this.cor = novaCor;
	}

	public boolean estaAberta() {
		if (this.aberta == true) {
			return true;
		} else {
			return false;
		}

	}
	
	public double areaPorta() {
		return this.dimensaoX *this.dimensaoY;
	}
	
	public double volumePorta() {
		return this.dimensaoX *this.dimensaoY * this.dimensaoZ;
	}

	@Override
	public String toString() {
		return "\nDADOS DA PORTA [aberta=" + aberta + ", cor=" + cor + ", dimensaoX=" + String.format("%.2f", dimensaoX)
				+ ", dimensaoY=" + String.format("%.2f", dimensaoY) + ", dimensaoZ=" + String.format("%.2f", dimensaoZ)
				+ "]\n";
	}

}
