package app;

public class ProgramSiruri {

	
	public static void main(String[] args) {
		
		String mesaj = "Hello world acesta este un test";
		String deSters = "acesta";
		System.out.println("Mesaj: " + mesaj);
		if(mesaj.contains(deSters)){
			System.out.println("CONTINE");
			
			int idx = mesaj.indexOf(deSters);
			mesaj = mesaj.substring(idx+deSters.length());
			
		}else{
			System.out.println("NU CONTINE");
		}
		
		System.out.println(mesaj);
		
		System.out.println("*****************************");
		String mesaj2 = "Java e un cacat lol";
		mesaj2 = mesaj2.replace("cacat", "CENSORED");
		System.out.println(mesaj2);
	}
}
