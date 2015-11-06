package clase;

public class Persoana {

	private String nume;
	private int varsta;
	
	// permitem accesul la varsta DOAR prin metoda asta
	public void setVarsta(int p){
		if(p >= 0){
			varsta = p;
		}else{
			varsta = 0;
		}
	}
	
	public void setNume(String n){
		if(n.length() > 0){
			nume = n;
		}else{
			nume ="NOT DEFINED";
		}
	}
	
	public String getNume(){
//		 System.out.println(nume);
		return nume;
	}
	
	
	public void displayPersoana(){
		System.out.println("Nume = " + nume + " varsta = " + varsta);
	}
}
