
public class Persoana {

	// atribute = caracteristici, trasturi = cine este
	
	String nume;
	String prenume;
	int varsta;
	
	// metodele = comportamente = ce face
	public static void saluta(){
		System.out.println("SALUT!");
	}
	
	public       void salutaPersonalizat(){
		System.out.println("Ma cheama " + nume + " si te salut!");
	}
	
	public void afiseazaInformatiiFormatate(){
		System.out.println("["+varsta+"]" + "Nume: " + nume + " prenume: " + prenume );
		if(varsta < 18){
			System.out.println("MINOR");
		}
	}
}
