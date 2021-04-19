
public class Gato extends Animal {
	
	@Override
	public String toString() {
		String gato1;
		
		gato1 = "\nGato:";
		gato1 += "\nNome: " + this.getNome();
		gato1 += "\nPeso (kg): " + this.getPeso();
		gato1 += "\nRaça: " + this.getRaca();		
		return gato1;
	}

}
