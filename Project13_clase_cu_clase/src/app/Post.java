package app;

public class Post {

	// field-uri Post
	public String autor;
	public String data;
	public String titlu;
	public String continut;
	
	public void afiseazaPost(){
		System.out.println("POST: " + autor + " " + continut);
	}
}
