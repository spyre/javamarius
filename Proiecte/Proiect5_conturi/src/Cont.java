
public class Cont {

	String numeCont;
	double suma;
	
	public void afiseazaInfoCont(){
		System.out.println("Nume cont: " + numeCont + " === " + suma);
	}
	
	public void retrageZeceMii(){
		if(suma < 10000){
			// ce afisezi daca nu are
			System.out.println("Fonduri insuficiente");
		}else{
			// daca are
			System.out.println("Retragem 10000");
			suma = suma-10000;
		}
	}
	
	public void retrageCinciMii(){
		System.out.println("Retragem 5000");
		suma = suma-5000;
	}
	
}
