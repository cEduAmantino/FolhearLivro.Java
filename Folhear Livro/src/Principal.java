
public class Principal {
	public static void main(String[]args) {
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("José", 21, 'M');
		p[1] = new Pessoa("Abigail", 24, 'F');
		
		l[0] = new Livro("Java básico", "Tiosso", 450, p[0]);
		l[1] = new Livro("Java Intermediário", "Marcus", 250, p[1]);
		l[2] = new Livro("Java avançado", "Estouvem", 150, p[1]);
		
		l[0].abrirLivro();
		l[0].fecharLivro();
		l[0].abrirLivro();
		l[0].avancarPagina();
		l[0].voltarPagina();
		l[0].avancarPagina();
		l[0].folhearLivro(450);
		
		System.out.println(l[0].detalhes());
		System.out.println();
		System.out.println(l[1].detalhes());
		System.out.println();
		System.out.println(l[2].detalhes());
	}
}
