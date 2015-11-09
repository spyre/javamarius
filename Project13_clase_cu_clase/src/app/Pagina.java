package app;

public class Pagina {

	public String header;
	public String title;
	public String footer;
	
	public Post postulPaginii;
	
	public void afiseazaPagina(){
		System.out.println(title);
		System.out.println(header);
		System.out.println(footer);
	}
	
}
