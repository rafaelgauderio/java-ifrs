package exercicio9;

public class Casa {

	private String cor;
	private int porta1;
	private int porta2;
	private int porta3;

	public Casa() {

	}

	public Casa(String cor, int porta1, int porta2, int porta3) {
		super();
		this.cor = cor;
		this.porta1 = porta1;
		this.porta2 = porta2;
		this.porta3 = porta3;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getPorta1() {
		return porta1;
	}

	public void setPorta1(int porta1) {
		this.porta1 = porta1;
	}

	public int getPorta2() {
		return porta2;
	}

	public void setPorta2(int porta2) {
		this.porta2 = porta2;
	}

	public int getPorta3() {
		return porta3;
	}

	public void setPorta3(int porta3) {
		this.porta3 = porta3;
	}

	public int quantasPortasEstãoAbertas() {
		int soma = 0;
		if (this.porta1 == 0 && this.porta1 == 0 && this.porta3 == 0) {
			soma = 3;
		} else if ((this.porta1 == 1 && this.porta2 == 0 && this.porta3 == 0)
				|| (this.porta1 == 0 && this.porta2 == 1 && this.porta3 == 0)
				|| (this.porta1 == 0 && this.porta2 == 0 && this.porta3 == 1)) {
			soma = 2;
		} else if ((this.porta1 == 1 && this.porta2 == 1 && this.porta3 == 0)
				|| (this.porta1 == 1 && this.porta2 == 0 && this.porta3 == 1)
				|| (this.porta1 == 0 && this.porta2 == 1 && this.porta3 == 1)) {
			soma = 1;
		} else if (this.porta1 == 1 && this.porta1 == 1 && this.porta3 == 1) {
			soma = 0;
		}
		return soma;
	}

	public void abrePorta(int i) {
		if (i == 1) {
			this.porta1 = 0;
		} else if (i == 2) {
			this.porta2 = 0;
		} else if (i == 3) {
			this.porta3 = 0;
		}

	}

	public void fechaPorta(int i) {
		if (i == 1) {
			this.porta1 = 1;
		} else if (i == 2) {
			this.porta2 = 1;
		} else if (i == 3) {
			this.porta3 = 1;
		}

	}
	
	public void pinta(String corNova) {
		this.cor=corNova;
		
	}

}
