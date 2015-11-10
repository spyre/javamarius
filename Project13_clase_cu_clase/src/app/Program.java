package app;

public class Program {

	public static void main(String[] args) {

		Pagina home = new Pagina();
		home.title = "Home";
		home.header = "Welcome";
		home.footer = "Copyright @Marius";
		
		Pagina contact = new Pagina();
		contact.title = "Contact";
		contact.header = "Find us at...";
		contact.footer = "Copyright @Marius";
		
		home.afiseazaPagina();
		contact.afiseazaPagina();
		
		System.out.println("***************************************");
		Post post1 = new Post();
		post1.autor = "Marius";
		post1.continut = "Post despre Java si bla";
		post1.titlu = "Java dev";
		
		post1.afiseazaPost();
		
		
		System.out.println("***************************************");
		
		home.postulPaginii = post1;
		System.out.println(home.postulPaginii.autor);
		
		if(contact.postulPaginii != null){
			System.out.println(contact.postulPaginii.autor);
		}
		
		Pagina offline = null;
		System.out.println(offline);
		
		if(offline != null)
			offline.title = "To be implemented";
		
		
	}

}
