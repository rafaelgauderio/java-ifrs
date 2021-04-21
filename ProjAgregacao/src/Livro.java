
public class Livro implements Publicacao {

	private String titulo;
	private String autor;
	private int totPagina;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;

	public Livro() {

	}

	public Livro(String titulo, String autor, int totPagina, int pagAtual, boolean aberto, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPagina = totPagina;
		this.pagAtual = pagAtual;
		this.aberto = aberto;
		this.leitor = leitor;
	}

	// construtor de um livro ainda fechado
	public Livro(String titulo, String autor, int totPagina, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPagina = totPagina;
		this.pagAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPagina() {
		return totPagina;
	}

	public void setTotPagina(int totPagina) {
		this.totPagina = totPagina;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		this.aberto = true;

	}

	@Override
	public void fechar() {
		this.aberto = false;

	}

	@Override
	public void folhear(int pagina) {
		if (pagina > this.totPagina) {
			this.pagAtual = 0;
		} else {
			this.pagAtual = pagina;
		}

	}

	@Override
	public void avancarPag() {
		this.pagAtual++;

	}

	@Override
	public void voltarPag() {
		this.pagAtual--;

	}

	public String detalhes() {
		return "Livro{" + " título= " + titulo + "\n, autor=" + autor + "\n, total de Páginas= " + totPagina
				+ "\n, página Atual= " + pagAtual + "\n, aberto= " + aberto + "\n, leitor= " + leitor.getNome()
				+ "\n, idade= " + leitor.getIdade() + "\n, sexo= " + leitor.getSexo() + " }";
	}

}
