package app;

import clase.Persoana;

public class Program {

	
	public static void main(String[] args) {
		Persoana persoana1 = new Persoana();
		persoana1.setNume("Jim");
		
		persoana1.setVarsta(22);
		
		persoana1.displayPersoana();
		
		persoana1.getNume();
		String mesaj = "Salut, " + persoana1.getNume() +" ce mai faci?";
		// System.out.println(persoana1.nume);
		System.out.println(mesaj);
		System.out.println(persoana1.getNume());
	}
}
