
public class Program {

	public static void main(String[] args) {
		
		String tara = "RO";
		String mesaj = "Salut lume";
		String info = "Aceasta e o aplicatie simpla :) ";
		
		if(tara == "RO"){
			System.out.println("Esti in Romania");
			System.out.println("Bun venit");
		}else{
			System.out.println("Strainatate");
			System.out.println("Schimba bani");
		}
		
		// String varsta = "18";
		
		double pret= 33.22;
		
		
		int varstaMajorat = 40;
		if(tara== "US"){
			varstaMajorat = 21;
		}else{
			varstaMajorat = 18;
		}
		
		
		
		if(15<varstaMajorat){
			System.out.println("N-ai voie in aplicatie");
		}else{
			System.out.println("Bine ai venit");
		}
		
		if(18<varstaMajorat){
			System.out.println("N-ai voie in aplicatie");
		}else{
			System.out.println("Bine ai venit!!!");
		}
		
		
	}
}
