package app;

import clase.Film;

public class Program {

	public static void main(String[] args) {

		Film f1 = new Film();
		f1.titlu = "Dark City";
		f1.pret = 23.99;
		// f1.categorii = "Drama Sci-FI, Mistery";
		f1.categorii.add("Mistery");
		f1.categorii.add("Sci-FI");
		f1.categorii.add("Drama");
		
		
		
		f1.categorii.remove("Drama");
		f1.displayFilm();
	}

}
