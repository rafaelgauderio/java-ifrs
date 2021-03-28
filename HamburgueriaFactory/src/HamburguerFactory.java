
public abstract class HamburguerFactory {
	
	protected abstract Hamburguer Make();
	public Hamburguer getHamburguer() => this.Make;
	
}

public class CarneFactory HamburguerFactory {
	
	protected Hamburguer Make() {
		
		Carne hamburguer = new Carne();
			
		
	}
	
	
}
