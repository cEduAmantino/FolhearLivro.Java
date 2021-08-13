
public class Livro implements Publicacao{
	private String titulo;
	private String autor;
	private int totalPaginas;
	private int paginaAtual;
	private boolean aberto;
	private Pessoa leitor;
	
//toString
	public String detalhes() {
		return "Livro [titulo=" + titulo + ", autor=" + autor 
				+ ", totalPaginas=" + totalPaginas + ",\n paginaAtual="
				+ paginaAtual + ", aberto=" + aberto + ", leitor=" + leitor.getNome() + ", idade=" + leitor.getIdade() 
				+", sexo=" + leitor.getSexo() +"]";
	}

//Construtor
	public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setTotalPaginas(totalPaginas);
		this.setAberto(false);
		this.setPaginaAtual(0);
		this.setLeitor(leitor);
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

	public int getTotalPaginas() {
		return totalPaginas;
	}

	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}

	public int getPaginaAtual() {
		return paginaAtual;
	}

	public void setPaginaAtual(int paginaAtual) {
		this.paginaAtual = paginaAtual;
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
	public void abrirLivro() {
		this.setAberto(true);
	}

	@Override
	public void fecharLivro() {
		this.setAberto(false);
	}

	@Override
	public void avancarPagina() {
		this.setPaginaAtual(paginaAtual + 1);
	}

	@Override
	public void voltarPagina() {
		this.setPaginaAtual(paginaAtual - 1);
	}

	@Override
	public void folhearLivro(int pagAt) {
		if(pagAt > this.getTotalPaginas()) {
			this.setPaginaAtual(0);
		}else {
		this.setPaginaAtual(pagAt);
		}
	}

	
}
