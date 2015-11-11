package clase;

import java.util.ArrayList;
import java.util.List;

public class Film {

	public String titlu;
	public String descriere;
	public double pret;
	
	// public String categorii;
	public List<String> categorii = new ArrayList<>();
	
	public void displayFilm(){
		System.out.println(titlu + " descriere: " + descriere + " costa: " + pret);
		System.out.println("Categorii film:");
		for(int i=0; i<categorii.size(); i++){
			System.out.println("Categorie: " + categorii.get(i));
		}
	}
	
}
