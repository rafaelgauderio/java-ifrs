
public abstract class Hamburguer {
	
	protected String presunto;
	protected String queijo;
	protected String file;
	protected String frango;
	
	
	public Hamburguer(String presunto, String queijo, String file, String frango) {
		this.presunto = presunto;
		this.queijo = queijo;
		this.file = file;
		this.frango = frango;
	}


	public Hamburguer() {
		
	}


	public String getPresunto() {
		return presunto;
	}


	public void setPresunto(String presunto) {
		this.presunto = presunto;
	}


	public String getQueijo() {
		return queijo;
	}


	public void setQueijo(String queijo) {
		this.queijo = queijo;
	}


	public String getFile() {
		return file;
	}


	public void setFile(String file) {
		this.file = file;
	}


	public String getFrango() {
		return frango;
	}


	public void setFrango(String frango) {
		this.frango = frango;
	}
	
	
	

}
