
public class Program {

	public static void main(String[] args) {

		// Ferma.infoFerma();
		Ferma.infoFermaStatic();
		
		System.out.println("*********************");
		String nume = "Ion";
		String nume2 = "Vasile"; // = new String("vasile");
		String nume3 = new String("George");
		
		
		
		
		Ferma f1 = new Ferma();
		Ferma f2 = new Ferma();
		Ferma fermaMare = new Ferma();
		
		f1.infoFerma();
		
		System.out.println("*************************");
		String username = new String("jack");
		String password = "1234";
		System.out.println(username + " " + password);
	}

}
