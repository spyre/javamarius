
public class Program {
	

	public static void main(String[] args) {

		Persoana.saluta();

		Persoana pers1 = new Persoana();
		Persoana pers2 = new Persoana();
		
		pers1.nume = "Jim";
		pers1.prenume = "Carrey";
		pers1.varsta = 50;
		
		pers2.nume = "Bob";
		pers2.varsta = 17;
		
		System.out.println("Numele este: " + pers1.nume);
		System.out.println("Prenumele este: " + pers1.prenume);
		System.out.println("Varsta este: " + pers1.varsta);
		
		System.out.println("Numele este: " + pers2.nume);
		System.out.println("Prenumele este: " + pers2.prenume);
		System.out.println("Varsta este: " + pers2.varsta);
		
		System.out.println("***************************");
//		System.out.println("Nume: " + pers1.nume + " prenume: " + pers1.prenume +" ["+pers1.varsta+"]");
//		System.out.println("Nume: " + pers2.nume + " prenume: " + pers2.prenume +" ["+pers2.varsta+"]");
		pers1.afiseazaInformatiiFormatate();
		pers2.afiseazaInformatiiFormatate();
		
	}

}
