package app;

public class Pagina {

	public String header;
	public String title;
	public String footer;
	
	// orice pagina poate avea un post
	// TODO: cum ai face ca o pagina sa poata avea mai multe post-uri
	// lista!! / array
	// List<Post> .....
	public Post postulPaginii;
	
	public void afiseazaPagina(){
		System.out.println(title);
		System.out.println(header);
		System.out.println(footer);
	}
	
}
