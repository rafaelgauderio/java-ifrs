
public class Cachorro extends Animal{
	
	@Override
	public String toString() {
		String cachorro1;
		
		cachorro1 = "\nCachorro:";
		cachorro1 += "\nNome: " + this.getNome();
		cachorro1 += "\nPeso (kg): " + this.getPeso();
		cachorro1 += "\nRaça: " + this.getRaca();		
		return cachorro1;
	}
}
