
public class Passarinho extends Animal{
	
	@Override
	public String toString() {
		String Passarinho1;
		
		Passarinho1 = "\nPassarinho:";
		Passarinho1 += "\nNome: " + this.getNome();
		Passarinho1 += "\nPeso (kg): " + this.getPeso();
		Passarinho1 += "\nRaça: " + this.getRaca();		
		return Passarinho1;
	}
}